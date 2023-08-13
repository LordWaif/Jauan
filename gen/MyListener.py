from antlr4 import *
from jasmin import Jasmin
from Erros import *

from .jauanListener import jauanListener

if __name__ is not None and "." in __name__:
    from .jauanParser import jauanParser
else:
    from jauanParser import jauanParser

ID = 0
VALOR = 1
TIPO = 2
ESCOPO = 3
VAR_OR_CONST = 4

#Tratar o escopo de variáveis, como armazenar parâmetros das funções e usar somente naquela função?


# This class defines a complete listener for a parse tree produced by jauanParser.
class MyListener(jauanListener):
    tabelaDeSimbolos = {}
    argumentosDeFuncoes = {}
    blocoDePilha = []
    escopoMain = False

    def __init__(self):
        self.stack = []
        self.jasmin = Jasmin('programaJasmin')

    # Enter a parse tree produced by jauanParser#prog.
    def enterProg(self, ctx: jauanParser.ProgContext):
        pass

    # Exit a parse tree produced by jauanParser#prog.
    def exitProg(self, ctx: jauanParser.ProgContext):
        pass

    # Enter a parse tree produced by jauanParser#main.
    def enterMain(self, ctx: jauanParser.MainContext):
        self.jasmin.createMain(20, 20)
        self.jasmin.createScanner()
        self.escopoMain = True
        pass

    # Exit a parse tree produced by jauanParser#main.
    def exitMain(self, ctx: jauanParser.MainContext):
        self.escopoMain = False
        self.jasmin.endMain()
        self.jasmin.exit()
        pass

    def enterDeclar_funcao(self, ctx: jauanParser.Declar_funcaoContext):
        self.escopoMain = False

        function_name = ctx.ID_L().getText()
        return_type = ctx.TIPO().getText()

        if self.searchSymbolTable(function_name) == None:
            if len(self.tabelaDeSimbolos.keys()) == 0:
                self.tabelaDeSimbolos[0] = [function_name,
                                           None, return_type,
                                           0, "function"]
            else:
                self.tabelaDeSimbolos[list(self.tabelaDeSimbolos.keys())[-1] + 1] = [function_name,
                                                                                    None, return_type,
                                                                                    0, "function"]
        else:
            raise Exception("Erro: Função '" + function_name + "' já foi declarada.")

    # Exit a parse tree produced by jauanParser#declar_funcao.
    def exitDeclar_funcao(self, ctx: jauanParser.Declar_funcaoContext):
        function_name = ctx.ID_L().getText()

        arg_form = ctx.args_formal().val
        print(arg_form)
        if arg_form:
            args = arg_form
            argument_list = []
            for i,v in enumerate(args):
                arg_type = args[i][0]
                arg_name = args[i][1]
                argument_info = [
                    arg_name,
                    None, arg_type,
                    0, "parameter"
                ]

                if self.searchSymbolTable(arg_name) == None:
                    if len(self.tabelaDeSimbolos.keys()) == 0:
                        self.tabelaDeSimbolos[0] = argument_info
                    else:
                        self.tabelaDeSimbolos[list(self.tabelaDeSimbolos.keys())[-1] + 1] = argument_info
                else:
                    raise Exception("Erro: Argumento '" + arg_name + "' já foi utilizado.")

                argument_list.append(arg_name)

            self.argumentosDeFuncoes[function_name] = argument_list
        print("TABELA")
        print(self.tabelaDeSimbolos)
        
        self.escopoMain = True

    # Enter a parse tree produced by jauanParser#args_formal.
    def enterArgs_formal(self, ctx: jauanParser.Args_formalContext):
        pass

    # Exit a parse tree produced by jauanParser#args_formal.
    def exitArgs_formal(self, ctx: jauanParser.Args_formalContext):
        ctx.val = [[param.TIPO().getText(), param.ID_L().getText()] for param in ctx.parametro()]

    # Enter a parse tree produced by jauanParser#bloco.
    def enterBloco(self, ctx: jauanParser.BlocoContext):
        pass

    # Exit a parse tree produced by jauanParser#bloco.
    def exitBloco(self, ctx: jauanParser.BlocoContext):
        pass

    # Enter a parse tree produced by jauanParser#comando.
    def enterComando(self, ctx: jauanParser.ComandoContext):
        pass

    # Exit a parse tree produced by jauanParser#comando.
    def exitComando(self, ctx: jauanParser.ComandoContext):
        pass

    # Enter a parse tree produced by jauanParser#retorno.
    def enterRetorno(self, ctx: jauanParser.RetornoContext):
        if not self.inFunction(ctx):
            raise Exception("'return' fora de função.")

    # Exit a parse tree produced by jauanParser#retorno.
    def exitRetorno(self, ctx: jauanParser.RetornoContext):
        pass

    # Enter a parse tree produced by jauanParser#parametro.
    def enterParametro(self, ctx: jauanParser.ParametroContext):
        pass

    # Exit a parse tree produced by jauanParser#parametro.
    def exitParametro(self, ctx: jauanParser.ParametroContext):
        if ctx.TIPO():
            ctx.val = ctx.TIPO().getText()
        if ctx.ID_L():
            ctx.val = ctx.ID_L().getText()

    # Enter a parse tree produced by jauanParser#var.
    def enterVar(self, ctx: jauanParser.VarContext):
        pass

    # Exit a parse tree produced by jauanParser#var.
    def exitVar(self, ctx: jauanParser.VarContext):
        pass

    # Enter a parse tree produced by jauanParser#declaraConstante.
    def enterDeclaraConstante(self, ctx: jauanParser.DeclaraConstanteContext):
        pass

    # Exit a parse tree produced by jauanParser#declaraConstante.
    def exitDeclaraConstante(self, ctx: jauanParser.DeclaraConstanteContext):
        pass

    # Enter a parse tree produced by jauanParser#declConst.
    def enterDeclConst(self, ctx:jauanParser.DeclConstContext):
        pass

    # Exit a parse tree produced by jauanParser#declConst.
    def exitDeclConst(self, ctx:jauanParser.DeclConstContext):
        if self.searchSymbolTable(ctx.ID_L().getText()) == None:
            if len(self.tabelaDeSimbolos.keys()) == 0:
                _id = self.jasmin.max_locals_used
                self.jasmin.max_locals_used += 1
                self.tabelaDeSimbolos[_id] = [ctx.ID_L().getText(), ctx.value().val, ctx.value().type,
                                                 self.escopoMain, "const"]
            else:
                _id = list(self.tabelaDeSimbolos.keys())[-1] + 1
                self.tabelaDeSimbolos[_id] = [ctx.ID_L().getText(),
                                            ctx.value().val,
                                            ctx.value().type,
                                            self.escopoMain, "const"]
            self.jasmin.store(_id,ctx.value().type)
        else:
            raise Exception("A constante '" + ctx.ID_L().getText() + "' já foi declarada")

    # Enter a parse tree produced by jauanParser#declaraVariavel.
    def enterDeclaraVariavel(self, ctx: jauanParser.DeclaraVariavelContext):
        pass

    # Exit a parse tree produced by jauanParser#declaraVariavel.
    def exitDeclaraVariavel(self, ctx: jauanParser.DeclaraVariavelContext):
        for indice, variavel in enumerate(ctx.ID_L()):
            if self.searchSymbolTable(variavel.getText()) == None:
                valorInicial = self.atribuirValorInicial(ctx)
                if len(self.tabelaDeSimbolos.keys()) == 0:
                    _id = self.jasmin.max_locals_used
                    self.jasmin.max_locals_used += 1
                    self.tabelaDeSimbolos[_id] = [variavel.getText(), valorInicial, ctx.TIPO().getText(),
                                                     self.escopoMain, "var"]
                else:
                    _id = list(self.tabelaDeSimbolos.keys())[-1] + 1
                    self.tabelaDeSimbolos[_id] = [variavel.getText(),
                                                valorInicial,
                                                ctx.TIPO().getText(),
                                                self.escopoMain, "var"]
                self.jasmin.loadConst(valorInicial,ctx.TIPO().getText())
                self.jasmin.store(_id,ctx.TIPO().getText())
            else:
                raise Exception("A variavel '" + variavel.getText() + "' já foi declarada")

    # Enter a parse tree produced by jauanParser#comando_atribuicao.
    def enterComando_atribuicao(self, ctx: jauanParser.Comando_atribuicaoContext):
        child = ctx.getChild(2)
        child.inh = 'attribute'
        #print(ctx.num())
        pass

    # Exit a parse tree produced by jauanParser#comando_atribuicao.
    def exitComando_atribuicao(self, ctx: jauanParser.Comando_atribuicaoContext):
        def attr(var,_type):
            self.jasmin.swap()
            self.jasmin.pop()
            self.jasmin.store(var,_type)
        var = ctx.id_(0).id
        child = ctx.getChild(2)
        if self.tabelaDeSimbolos[var][VAR_OR_CONST] == 'var':
            if ctx.id_(0).type == child.type:
                ctx.val = child.val
                attr(var,ctx.id_(0).type)
                self.tabelaDeSimbolos[var][VALOR] = child.val
            elif (ctx.id_(0).type == 'int' and child.type == 'float'):
                val = int(child.val)
                child.inh = val
                ctx.val = val
                self.jasmin.f2i()
                attr(var,ctx.id_(0).type)
                self.tabelaDeSimbolos[var][VALOR] = val
            elif (ctx.id_(0).type == 'float' and child.type == 'int'):
                val = float(child.val)
                child.inh = val
                ctx.val = val
                self.jasmin.i2f()
                attr(var,ctx.id_(0).type)
                self.tabelaDeSimbolos[var][VALOR] = val
                
            else:
                raise Exception("A variável " + str(ctx.id_(0).name) + " não é do mesmo tipo do valor atribuído")
        else:
            raise Exception(str(ctx.getChild(0).name) + " é uma constante. Era esperado uma variável")

    # Enter a parse tree produced by jauanParser#unario.
    def enterUnario(self, ctx: jauanParser.UnarioContext):
        pass

    # Exit a parse tree produced by jauanParser#unario.
    def exitUnario(self, ctx: jauanParser.UnarioContext):
        ctx.type = ctx.op_algebrico().type
        ctx.val = -ctx.op_algebrico().val
        self.jasmin.loadConst(-1 if ctx.type == 'int' else -1.0)
        self.jasmin.mul(ctx.type)
    # Enter a parse tree produced by jauanParser#parenteses.
    def enterParenteses(self, ctx: jauanParser.ParentesesContext):
        pass

    # Exit a parse tree produced by jauanParser#parenteses.
    def exitParenteses(self, ctx: jauanParser.ParentesesContext):
        ctx.val = ctx.op_algebrico().val
        ctx.type = ctx.op_algebrico().type
        if hasattr(ctx,'inh') and ctx.inh == 'print':
            self.jasmin.StringBuilderAppend(ctx.type)

    # Enter a parse tree produced by jauanParser#multDiv.
    def enterMultDiv(self, ctx: jauanParser.MultDivContext):
        ctx.op_algebrico(0).inh = 'l'
        ctx.op_algebrico(1).inh = 'r'

    # Exit a parse tree produced by jauanParser#multDiv.
    def exitMultDiv(self, ctx: jauanParser.MultDivContext):
        _type = 'float' if 'float' in [ctx.op_algebrico(0).type,ctx.op_algebrico(1).type] else 'int'
        if _type == 'float':
            if ctx.op_algebrico(0).type == 'int':
                self.jasmin.swap()
                self.jasmin.i2f()
                self.jasmin.swap()
            if ctx.op_algebrico(1).type == 'int':
                self.jasmin.i2f()
        if ctx.op.text == '*':
            ctx.val = ctx.op_algebrico(0).val * ctx.op_algebrico(1).val
            self.jasmin.mul(_type)
        elif ctx.op.text == '/':
            ctx.val = ctx.op_algebrico(0).val / ctx.op_algebrico(1).val
            self.jasmin.div(_type)
        else:
            raise Exception("Erro: Tipos incompativeis.")
        ctx.type = _type


    # Enter a parse tree produced by jauanParser#addSub.
    def enterAddSub(self, ctx: jauanParser.AddSubContext):
        ctx.op_algebrico(0).inh = 'l'
        ctx.op_algebrico(1).inh = 'r'

    # Exit a parse tree produced by jauanParser#addSub.
    def exitAddSub(self, ctx: jauanParser.AddSubContext):
        _type = 'float' if 'float' in [ctx.op_algebrico(0).type,ctx.op_algebrico(1).type] else 'int'
        if not (ctx.op_algebrico(0).type in ['int','float'] and ctx.op_algebrico(1).type in ['int','float']):
            raise Exception("Erro: Tipos incompativeis.")
        if _type == 'float':
            if ctx.op_algebrico(0).type == 'int':
                self.jasmin.swap()
                self.jasmin.i2f()
                self.jasmin.swap()
            if ctx.op_algebrico(1).type == 'int':
                self.jasmin.i2f()
        if ctx.op.text == '+':
            ctx.val = ctx.op_algebrico(0).val + ctx.op_algebrico(1).val
            self.jasmin.add(_type)
        elif ctx.op.text == '-':
            ctx.val = ctx.op_algebrico(0).val - ctx.op_algebrico(1).val
            self.jasmin.sub(_type)

        if hasattr(ctx,'inh') and ctx.inh == 'print':
            self.jasmin.StringBuilderAppend(_type)
        ctx.type = _type

    # Enter a parse tree produced by jauanParser#operando.
    def enterOperando(self, ctx: jauanParser.OperandoContext):
        if hasattr(ctx, 'inh'):
            if ctx.num():
                ctx.num().inh = ctx.inh
            elif ctx.id_():
                ctx.id_().inh = ctx.inh

    # Exit a parse tree produced by jauanParser#operando.
    def exitOperando(self, ctx: jauanParser.OperandoContext):
        ctx.val = ctx.getChild(0).val
        ctx.type = ctx.getChild(0).type

    # Enter a parse tree produced by jauanParser#ifElse.
    def enterIfElse(self, ctx: jauanParser.IfElseContext):
        ctx.exprRelacionalBinaria().inh = 'if'
        self.jasmin.createIfElse()
        self.jasmin.constructIf('!=','zero')

    # Exit a parse tree produced by jauanParser#ifElse.
    def exitIfElse(self, ctx: jauanParser.IfElseContext):
        _if = self.jasmin.in_execution.pop()
        self.jasmin.jump(_if['label_end'])
        if isinstance(ctx.else_(),jauanParser.ElseContext):
            self.jasmin.createLabel(_if['label_end'])
        else:
            self.jasmin.createLabel(_if['label_else'])
            self.jasmin.createLabel(_if['label_end'])

    # Enter a parse tree produced by jauanParser#else.
    def enterElse(self, ctx:jauanParser.ElseContext):
        self.jasmin.jump(ctx.lb_end)
        self.jasmin.createLabel(ctx.lb_else)
        pass

    # Exit a parse tree produced by jauanParser#else.
    def exitElse(self, ctx:jauanParser.ElseContext):
        pass

    # Enter a parse tree produced by jauanParser#while.
    def enterWhile(self, ctx: jauanParser.WhileContext):
        ctx.exprRelacionalBinaria().inh = 'while'
        self.jasmin.createWhile()
        self.jasmin.constructIf('!=','zero')

    # Exit a parse tree produced by jauanParser#while.
    def exitWhile(self, ctx: jauanParser.WhileContext):
        _wh = self.jasmin.in_execution.pop()
        self.jasmin.jump(_wh['label_loop'])
        self.jasmin.createLabel(_wh['label_end'])

    # Enter a parse tree produced by jauanParser#scanf.
    def enterScanf(self, ctx: jauanParser.ScanfContext):
        for _id in ctx.id_():
            _id.inh = 'scanf'

    # Exit a parse tree produced by jauanParser#scanf.
    def exitScanf(self, ctx: jauanParser.ScanfContext):
        for _id in ctx.id_():
            self.jasmin.Aload(self.jasmin.scanner_adress)
            self.jasmin.invokeScanner(_id.type)
            self.jasmin.store(_id.id,_id.type)

    # Enter a parse tree produced by jauanParser#print.
    def enterPrint(self, ctx: jauanParser.PrintContext):
        ctx.args_real().inh = 'print'
        self.jasmin.createStringBuilder()

    # Exit a parse tree produced by jauanParser#print.
    def exitPrint(self, ctx: jauanParser.PrintContext):
        adress = self.jasmin.makeStringBuilder()
        self.jasmin.init_print()
        self.jasmin.Aload(adress)
        self.jasmin.printConst("")

    # Enter a parse tree produced by jauanParser#break.
    def enterBreak(self, ctx: jauanParser.BreakContext):
        if not self.inLoop(ctx):
            raise Exception("'break' fora de loop.")
        for _id in range(len(self.jasmin.in_execution)-1,-1,-1):
            if 'label_loop' in self.jasmin.in_execution[_id].keys():
                self.jasmin.jump(self.jasmin.in_execution[_id]['label_end'])
                break

    # Exit a parse tree produced by jauanParser#break.
    def exitBreak(self, ctx: jauanParser.BreakContext):
        pass

    # Enter a parse tree produced by jauanParser#inst_funcao.
    def enterInst_funcao(self, ctx: jauanParser.Inst_funcaoContext):
        pass

    # Exit a parse tree produced by jauanParser#inst_funcao.
    def exitInst_funcao(self, ctx: jauanParser.Inst_funcaoContext):
        pass

    # Enter a parse tree produced by jauanParser#args_real.
    def enterArgs_real(self, ctx: jauanParser.Args_realContext):
        for i in range(len(ctx.children)):
            ctx.children[i].inh = ctx.inh

    # Exit a parse tree produced by jauanParser#args_real.
    def exitArgs_real(self, ctx: jauanParser.Args_realContext):
        ctx.val = []
        for i in range(len(ctx.children)):
            child = ctx.getChild(i)
            if isinstance(child, jauanParser.IdContext):
                child.inh = ctx.inh
                ctx.val.append(child)
            elif isinstance(child, jauanParser.ValueContext):
                ctx.val.append(child)
            elif isinstance(child, jauanParser.ExprAlgebricaContext):
                ctx.val.append(child)
            elif isinstance(child, jauanParser.ExprRelacionalBinariaContext):
                ctx.val.append(child)
            elif isinstance(child, jauanParser.ExprRelacionalUnariaContext):
                ctx.val.append(child) 

    # Enter a parse tree produced by jauanParser#exprRelacional.
    def enterExprRelacionalBinaria(self, ctx: jauanParser.ExprRelacionalBinariaContext):
        ctx.op_relacional(0).inh = 'l'
        ctx.op_relacional(1).inh = 'r'
        ctx.op_relacional(0).relacional = 'true'
        ctx.op_relacional(1).relacional = 'true'

    # Exit a parse tree produced by jauanParser#exprRelacional.
    def exitExprRelacionalBinaria(self, ctx: jauanParser.ExprRelacionalBinariaContext):
        ctx.type = 'bool'
        _type = 'int' if ctx.op_relacional(0).type == 'int' and ctx.op_relacional(1).type == 'int' else 'float'
        if ctx.op_relacional(0).type in ['int','float', 'bool'] and ctx.op_relacional(1).type in ['int','float', 'bool']:
            cmd = f"ctx.op_relacional(0).val {ctx.OPERADOR().getText()} ctx.op_relacional(1).val"
            ctx.val = eval(cmd)
            if _type == 'float':
                if ctx.op_relacional(0).type == 'int':
                    self.jasmin.swap()
                    self.jasmin.i2f()
                    self.jasmin.swap()
                if ctx.op_relacional(1).type == 'int':
                    self.jasmin.i2f()
            self.jasmin.createIfElse()
            self.jasmin.constructIf(ctx.OPERADOR().getText(),_type)
            lb_else,lb_end = self.jasmin.executeIf()
            # --- escopo do if
            self.jasmin.loadConst(1)
            temp = self.jasmin.createNewTemp('int')
            self.jasmin.jump(lb_end)
            # --- fim escopo do if
            # --- escopo do else
            self.jasmin.createLabel(lb_else)
            self.jasmin.loadConst(0)
            self.jasmin.store(temp,'int')
            # -- fim escopo do else
            self.jasmin.createLabel(lb_end)
            ctx.result_address = temp
            self.jasmin.in_execution.pop()
            if hasattr(ctx,'inh') and ctx.inh == 'if':
                self.jasmin.load(ctx.result_address,'int')
                lb_else,lb_end = self.jasmin.executeIf()
                if isinstance(ctx.parentCtx.else_(), jauanParser.ElseContext):
                    ctx.parentCtx.else_().lb_else = lb_else
                    ctx.parentCtx.else_().lb_end = lb_end
            elif hasattr(ctx,'inh') and ctx.inh == 'while':
                self.jasmin.load(ctx.result_address,'int')
                lb_end,lb_loop = self.jasmin.executeWhile()
            elif hasattr(ctx,'inh') and ctx.inh == 'attribute':
                self.jasmin.load(ctx.result_address,'int')
            elif hasattr(ctx,'inh') and ctx.inh == 'print':
                self.jasmin.loadConst('true' if ctx.val else 'false' ,_type='str')
                self.jasmin.StringBuilderAppend('str')
        else:
            raise Exception("Tipos das variaveis '" + ctx.op_relacional(0).getText() + "' e '" + ctx.op_relacional(1).getText() + "' incompativeis.")


    # Enter a parse tree produced by jauanParser#op_relacional.
    def enterOp_relacional(self, ctx:jauanParser.Op_relacionalContext):
        ctx.children[0].relacional = ctx.relacional
        if ctx.exprAlgebrica():
            ctx.exprAlgebrica().inh = ctx.inh
        pass

    # Exit a parse tree produced by jauanParser#op_relacional.
    def exitOp_relacional(self, ctx:jauanParser.Op_relacionalContext):
        ctx.val = ctx.getChild(0).val
        ctx.type = ctx.getChild(0).type


    # Enter a parse tree produced by jauanParser#exprRelacionalUnaria.
    def enterExprRelacionalUnaria(self, ctx: jauanParser.ExprRelacionalUnariaContext):
        pass

    # Exit a parse tree produced by jauanParser#exprRelacionalUnaria.
    def exitExprRelacionalUnaria(self, ctx: jauanParser.ExprRelacionalUnariaContext):
        if ctx.id():
            if ctx.id().type == 'bool':
                ctx.val = not ctx.id().val
            else:
                raise Exception("Erro: era esperado da variável '" + ctx.id().name + "' o tipo 'bool', mas foi recebido '" + ctx.id().type +"'")
        elif ctx.value():
            ctx.val = not ctx.value().val

    # Enter a parse tree produced by jauanParser#exprAlgebrica.
    def enterExprAlgebrica(self, ctx: jauanParser.ExprAlgebricaContext):
        ctx.op_algebrico().inh = ctx.inh
        pass

    # Exit a parse tree produced by jauanParser#exprAlgebrica.
    def exitExprAlgebrica(self, ctx: jauanParser.ExprAlgebricaContext):
        ctx.val = ctx.getChild(0).val
        ctx.type = ctx.getChild(0).type
        pass

    # Enter a parse tree produced by jauanParser#value.
    def enterValue(self, ctx: jauanParser.ValueContext):
        if hasattr(ctx,'inh'):
            ctx.getChild(0).inh = ctx.inh
        pass

    # Exit a parse tree produced by jauanParser#value.
    def exitValue(self, ctx: jauanParser.ValueContext):
        if ctx.num():
            ctx.val = ctx.num().val
            ctx.type = type(ctx.val).__name__
        elif ctx.STRING():
            ctx.val = ctx.STRING().getText()
            ctx.type = 'bool'
            self.jasmin.loadConst(ctx.val,'str')
        elif ctx.TRUE():
            ctx.val = True
            ctx.type = 'bool'
            self.jasmin.loadConst(1)
        elif ctx.FALSE():
            ctx.val = False
            ctx.type = 'bool'
            self.jasmin.loadConst(0)
        if hasattr(ctx,'inh') and ctx.inh == "print":
            self.jasmin.pop()
            if ctx.type == 'bool':
                self.jasmin.loadConst('true' if ctx.val == 'TRUE' else 'false','str')
            self.jasmin.StringBuilderAppend("str")

    # Enter a parse tree produced by jauanParser#num.
    def enterNum(self, ctx: jauanParser.NumContext):
        pass

    # Exit a parse tree produced by jauanParser#num.
    def exitNum(self, ctx: jauanParser.NumContext):
        if ctx.INT():
            ctx.val = int(ctx.INT().getText())
            ctx.type = 'int'
        elif ctx.FLOAT():
            ctx.val = float(ctx.FLOAT().getText())
            ctx.type = 'float'
        self.jasmin.loadConst(ctx.val,ctx.type)
        if hasattr(ctx,'inh') and ctx.inh == 'print':
            self.jasmin.StringBuilderAppend(ctx.type)

    def inLoop(self, ctx):
        parent = ctx.parentCtx
        while parent is not None:
            if isinstance(parent, jauanParser.WhileContext):
                return True
            parent = parent.parentCtx
        return False

    def inFunction(self, ctx):
        parent = ctx.parentCtx
        while parent is not None:
            if isinstance(parent, jauanParser.Declar_funcaoContext):
                return True
            parent = parent.parentCtx
        return False

    # Enter a parse tree produced by jauanParser#id.
    def enterId(self, ctx:jauanParser.IdContext):
        pass

    # Exit a parse tree produced by jauanParser#id.
    def exitId(self, ctx:jauanParser.IdContext):
        var = self.searchSymbolTable(ctx.ID_L().getText())
        if var == None:
            raise Exception(f"Erro: Variavel '{ctx.ID_L().getText()}' nao declarada.")
        ctx.name = self.tabelaDeSimbolos[var][ID]
        ctx.val = self.tabelaDeSimbolos[var][VALOR]
        ctx.type = self.tabelaDeSimbolos[var][TIPO]
        ctx.id = var
        if ctx.type == 'str':
            self.jasmin.Aload(ctx.id)
        else:
            self.jasmin.load(ctx.id,ctx.type)
            if ctx.type == 'bool' and hasattr(ctx,'inh') and ctx.inh == 'print':
                self.jasmin.ifBoolprint()
        if hasattr(ctx,'inh') and ctx.inh == 'print':
            if ctx.type == 'bool':
                self.jasmin.StringBuilderAppend('str')
            else:
                self.jasmin.StringBuilderAppend(ctx.type)

    # Buscar no dicionario a chave pelo valor
    def searchSymbolTable(self, value):
        for chave, valor in self.tabelaDeSimbolos.items():
            if valor[ID] == value and valor[ESCOPO] == self.escopoMain:
                return chave
        return None

    def atribuirValorInicial(self, ctx):
        if ctx.TIPO().getText() == 'int':
            return 0
        if ctx.TIPO().getText() == 'float':
            return 0.0
        if ctx.TIPO().getText() == 'str':
            return ""
        if ctx.TIPO().getText() == 'bool':
            return 0