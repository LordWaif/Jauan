from antlr4 import *
from jasmin import Jasmin
from Erros import *

from .jauanListener import jauanListener

if __name__ is not None and "." in __name__:
    from .jauanParser import jauanParser
else:
    from jauanParser import jauanParser

from antlr4.tree.Tree import TerminalNodeImpl

ID = 0
VALOR = 1
TIPO = 2
ESCOPO = 3
VAR_OR_CONST = 4

ID_FUNCTION = 0
RETURN_TYPE = 1
EXPECTED_TYPES = 2
LAST_LOCAL_USED = 3

#Tratar o escopo de variáveis, como armazenar parâmetros das funções e usar somente naquela função?


# This class defines a complete listener for a parse tree produced by jauanParser.
class MyListener(jauanListener):

    def __init__(self):
        self.stack = []
        self.tabelaDeSimbolos = {}
        self.blocoDePilha = []
        self.escopo = ''
        self.tabelaNameFunctions = {}
        self.scanner_address = -1
        self.jasmin = Jasmin('programaJasmin')

    # Enter a parse tree produced by jauanParser#prog.
    def enterProg(self, ctx: jauanParser.ProgContext):
        pass

    # Exit a parse tree produced by jauanParser#prog.
    def exitProg(self, ctx: jauanParser.ProgContext):
        self.jasmin.exit()
        pass

    # Enter a parse tree produced by jauanParser#main.
    def enterMain(self, ctx: jauanParser.MainContext):
        self.jasmin.createMain(20, 20)
        self.escopo = 'main'
        if self.searchNameFunction('main') == None:
            if len(self.tabelaNameFunctions.keys()) == 0:
                _id = 0
                self.tabelaNameFunctions[_id] = ['main', 'void']  
            else:
                _id = max(self.tabelaNameFunctions.keys()) + 1
                self.tabelaNameFunctions[_id] = ['main', 'void']
            self.tabelaNameFunctions[_id].append([])
            self.tabelaNameFunctions[_id].append(-1)
            self.jasmin.createScanner(self.tabelaNameFunctions[_id][LAST_LOCAL_USED]+1)
            self.tabelaNameFunctions[_id][LAST_LOCAL_USED]+=1
            self.scanner_address = self.tabelaNameFunctions[_id][LAST_LOCAL_USED]
        else:
            raise Exception("A função main já foi declarada.")


    # Exit a parse tree produced by jauanParser#main.
    def exitMain(self, ctx: jauanParser.MainContext):
        self.jasmin.endMain()
        self.jasmin.exit()
        limit = self.tabelaNameFunctions[self.searchNameFunction(self.escopo)][LAST_LOCAL_USED]
        self.jasmin.remakeLimits(limit+2,limit+1)
        self.jasmin.open()
        self.tabelaDeSimbolos = {}
        pass

    def enterDeclar_funcao(self, ctx: jauanParser.Declar_funcaoContext):
        self.escopo = ctx.ID_L().getText()
        ctx.args_formal().return_type = return_type = ctx.TIPO().getText()
        ctx.return_type = return_type
        self.jasmin.function_return_type = return_type
        self.jasmin.createFunction(ctx.ID_L().getText())
        if self.searchNameFunction(ctx.ID_L().getText()) == None:
            if len(self.tabelaNameFunctions.keys()) == 0:
                _id = 0
                self.tabelaNameFunctions[_id] = [ctx.ID_L().getText(), ctx.TIPO().getText()]  
            else:
                _id = max(self.tabelaNameFunctions.keys()) + 1
                self.tabelaNameFunctions[_id] = [ctx.ID_L().getText(), ctx.TIPO().getText()]
            self.tabelaNameFunctions[_id].append([])
            self.tabelaNameFunctions[_id].append(-1)
        else:
            cmd = "A função '" + ctx.ID_L().getText() + "' já foi declarada."
            raise Exception(cmd)

    # Exit a parse tree produced by jauanParser#declar_funcao.
    def exitDeclar_funcao(self, ctx: jauanParser.Declar_funcaoContext):
        id_ = self.searchNameFunction(self.escopo)
        type_ = self.tabelaNameFunctions[id_][RETURN_TYPE]
        if type_ != 'void':
            self.jasmin.loadConst(self.atribuirValorInicialParam(type_))
        self.jasmin.returnType()
        self.jasmin.endFunction()
        self.jasmin.exit()
        limit = self.tabelaNameFunctions[self.searchNameFunction(self.escopo)][LAST_LOCAL_USED]
        self.jasmin.remakeLimits(limit+2,limit+1)
        self.jasmin.open()
        self.tabelaDeSimbolos = {}
        self.jasmin.jasmin_file.write('\n')

    # Enter a parse tree produced by jauanParser#args_formal.
    def enterArgs_formal(self, ctx: jauanParser.Args_formalContext):
        pass

    # Exit a parse tree produced by jauanParser#args_formal.
    def exitArgs_formal(self, ctx: jauanParser.Args_formalContext):
        function = self.searchNameFunction(ctx.parentCtx.ID_L().getText())
        self.tabelaNameFunctions[function].append([])
        if function != None:
            for param in ctx.parametro():
                if self.searchSymbolTable(param.ID_L().getText()) == None:
                    valorInicial = self.atribuirValorInicialParam(param.TIPO().getText())
                    self.jasmin.passingParameters(param.TIPO().getText())
                else:
                    raise Exception("Parâmetro já declarado.")
                if len(self.tabelaDeSimbolos.keys()) == 0:
                    _id = 0
                    self.tabelaDeSimbolos[_id] = [param.ID_L().getText(), valorInicial, param.TIPO().getText(), self.escopo, "param"]
                else:
                    _id = max(self.tabelaDeSimbolos.keys()) + 1
                    self.tabelaDeSimbolos[_id] = [param.ID_L().getText(), valorInicial, param.TIPO().getText(), self.escopo, "param"]
                self.tabelaNameFunctions[function][EXPECTED_TYPES].append(param.TIPO().getText())
                self.tabelaNameFunctions[function][LAST_LOCAL_USED] += 1
            self.jasmin.defineReturnType(ctx.return_type)
            self.jasmin.setFunctionLimits(30,30)
            self.tabelaNameFunctions[function][LAST_LOCAL_USED] += 1
            self.jasmin.createScanner(self.tabelaNameFunctions[function][LAST_LOCAL_USED])  
            self.scanner_address = self.tabelaNameFunctions[function][LAST_LOCAL_USED]  
        else:
            cmd = "A função '" + ctx.parentCtx.ID_L().getText() + "' não foi declarada."
            raise Exception(cmd)
                
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
        ctx.getChild(1).inh = 'return'

    # Exit a parse tree produced by jauanParser#retorno.
    def exitRetorno(self, ctx: jauanParser.RetornoContext):
        _type = ''
        retorno = ctx.getChild(1)
        if retorno == None:
            _type = 'void'
        else:
            _type = retorno.type
        if _type != self.jasmin.function_return_type:
            ret = f"O tipo do retorno da função {self.escopo} é {self.jasmin.function_return_type} mas foi recebido {_type}"
            raise Exception(ret)
        self.jasmin.returnType()

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
        function_id = self.searchNameFunction(self.escopo)
        _id = self.tabelaNameFunctions[function_id][LAST_LOCAL_USED] + 1
        if self.searchSymbolTable(ctx.ID_L().getText()) == None and self.searchNameFunction(ctx.ID_L().getText()) == None:
            if len(self.tabelaDeSimbolos.keys()) == 0:
                self.tabelaDeSimbolos[_id] = [ctx.ID_L().getText(), ctx.value().val, ctx.value().type,
                                                 self.escopo, "const"]
            else:
                _id += 1
                self.tabelaDeSimbolos[_id] = [ctx.ID_L().getText(),
                                            ctx.value().val,
                                            ctx.value().type,
                                            self.escopo, "const"]
            self.jasmin.store(_id,ctx.value().type)
        else:
            cmd = "A constante '" + ctx.ID_L().getText() + "' já foi declarada"
            raise Exception(cmd)
        self.tabelaNameFunctions[function_id][LAST_LOCAL_USED] = _id

    # Enter a parse tree produced by jauanParser#declaraVariavel.
    def enterDeclaraVariavel(self, ctx: jauanParser.DeclaraVariavelContext):
        pass

    # Exit a parse tree produced by jauanParser#declaraVariavel.
    def exitDeclaraVariavel(self, ctx: jauanParser.DeclaraVariavelContext):
        function_id = self.searchNameFunction(self.escopo)
        _id = self.tabelaNameFunctions[function_id][LAST_LOCAL_USED]
        for variavel in ctx.ID_L():
            if self.searchSymbolTable(variavel.getText()) == None and self.searchNameFunction(variavel.getText()) == None:
                valorInicial = self.atribuirValorInicial(ctx)
                if len(self.tabelaDeSimbolos.keys()) == 0:
                    _id += 1
                    self.tabelaDeSimbolos[_id] = [variavel.getText(), valorInicial, ctx.TIPO().getText(),
                                                     self.escopo, "var"]
                else:
                    _id += 1
                    self.tabelaDeSimbolos[_id] = [variavel.getText(),
                                                valorInicial,
                                                ctx.TIPO().getText(),
                                                self.escopo, "var"]
                self.jasmin.loadConst(valorInicial,ctx.TIPO().getText())
                self.jasmin.store(_id,ctx.TIPO().getText())
            else:
                cmd = "A variavel '" + variavel.getText() + "' já foi declarada"
                raise Exception(cmd)
        self.tabelaNameFunctions[function_id][LAST_LOCAL_USED] = _id

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
        child = [i for i in ctx.children if not isinstance(i,TerminalNodeImpl)]
        child = child[1]
        #print(self.tabelaDeSimbolos[var][VAR_OR_CONST])
        if self.tabelaDeSimbolos[var][VAR_OR_CONST] in ['var','param']:
            if ctx.id_(0).type == child.type:
                if not isinstance(child, jauanParser.Inst_funcaoContext):
                    #ctx.val = child.val
                    #self.tabelaDeSimbolos[var][VALOR] = child.val
                    ...
                attr(var,ctx.id_(0).type)
            elif (ctx.id_(0).type == 'int' and child.type == 'float'):
                if not isinstance(child, jauanParser.Inst_funcaoContext):
                    #val = int(child.val)
                    #child.inh = val
                    #ctx.val = val
                    #self.tabelaDeSimbolos[var][VALOR] = val
                    ...
                self.jasmin.f2i()
                attr(var,ctx.id_(0).type)
            elif (ctx.id_(0).type == 'float' and child.type == 'int'):
                if not isinstance(child, jauanParser.Inst_funcaoContext):
                    #val = float(child.val)
                    #child.inh = val
                    #ctx.val = val
                    #self.tabelaDeSimbolos[var][VALOR] = val
                    ...
                self.jasmin.i2f()
                attr(var,ctx.id_(0).type)
            else:
                cmd = "A variável " + str(ctx.id_(0).name) + " não é do mesmo tipo do valor atribuído"
                raise Exception(cmd)
        else:
            cmd = str(ctx.getChild(0).name) + " é uma constante. Era esperado uma variável"
            raise Exception(cmd)

    # Enter a parse tree produced by jauanParser#unario.
    def enterUnario(self, ctx: jauanParser.UnarioContext):
        pass

    # Exit a parse tree produced by jauanParser#unario.
    def exitUnario(self, ctx: jauanParser.UnarioContext):
        ctx.type = ctx.op_algebrico().type
        #ctx.val = -ctx.op_algebrico().val
        self.jasmin.loadConst(-1 if ctx.type == 'int' else -1.0)
        self.jasmin.mul(ctx.type)
        if hasattr(ctx,'inh') and ctx.inh == 'print':
            self.jasmin.StringBuilderAppend(ctx.type)
    # Enter a parse tree produced by jauanParser#parenteses.
    def enterParenteses(self, ctx: jauanParser.ParentesesContext):
        pass

    # Exit a parse tree produced by jauanParser#parenteses.
    def exitParenteses(self, ctx: jauanParser.ParentesesContext):
        #ctx.val = ctx.op_algebrico().val
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
            #ctx.val = ctx.op_algebrico(0).val * ctx.op_algebrico(1).val
            self.jasmin.mul(_type)
        elif ctx.op.text == '/':
            #ctx.val = ctx.op_algebrico(0).val / ctx.op_algebrico(1).val
            self.jasmin.div(_type)
        else:
            raise Exception("Erro: Tipos incompativeis.")
        if hasattr(ctx,'inh') and ctx.inh == 'print':
            self.jasmin.StringBuilderAppend(_type)
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
            #ctx.val = ctx.op_algebrico(0).val + ctx.op_algebrico(1).val
            self.jasmin.add(_type)
        elif ctx.op.text == '-':
            #ctx.val = ctx.op_algebrico(0).val - ctx.op_algebrico(1).val
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
        #ctx.val = ctx.getChild(0).val
        ctx.type = ctx.getChild(0).type

    # Enter a parse tree produced by jauanParser#ifElse.
    def enterIfElse(self, ctx: jauanParser.IfElseContext):
        if ctx.exprRelacionalBinaria():
            ctx.exprRelacionalBinaria().inh = 'if'
        elif ctx.id_():
            ctx.id_().inh = 'if'
        elif ctx.exprRelacionalUnaria():
            ctx.exprRelacionalUnaria().inh = 'if'
        elif ctx.inst_funcao():
            ctx.inst_funcao().inh = 'if'
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
        if ctx.exprRelacionalBinaria():
            ctx.exprRelacionalBinaria().inh = 'while'
        elif ctx.id_():
            ctx.id_().inh = 'while'
        elif ctx.value():
            ctx.value().inh = 'while'
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
            self.jasmin.Aload(self.scanner_address)
            self.jasmin.invokeScanner(_id.type)
            self.jasmin.store(_id.id,_id.type)
        self.jasmin.pop()

    # Enter a parse tree produced by jauanParser#print.
    def enterPrint(self, ctx: jauanParser.PrintContext):
        ctx.args_real().inh = 'print'
        self.jasmin.createStringBuilder()

    # Exit a parse tree produced by jauanParser#print.
    def exitPrint(self, ctx: jauanParser.PrintContext):
        _id = self.searchNameFunction(self.escopo)
        self.jasmin.makeStringBuilder(self.tabelaNameFunctions[_id][LAST_LOCAL_USED]+1)
        self.jasmin.init_print()
        self.jasmin.Aload(self.tabelaNameFunctions[_id][LAST_LOCAL_USED]+1)
        self.tabelaNameFunctions[_id][LAST_LOCAL_USED]+=1
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
        ctx.type = self.tabelaNameFunctions[ctx.id_().id][RETURN_TYPE]
        self.jasmin.invokeFunction(ctx.id_().name,ctx.args_real().type,ctx.type)
        if hasattr(ctx,'inh') and ctx.inh == 'print':
            if ctx.type != 'void':
                if ctx.type == 'bool':
                    self.jasmin.ifBoolprint()
                    self.jasmin.StringBuilderAppend('str')
                else:
                    self.jasmin.StringBuilderAppend(ctx.type)
            else:
                self.jasmin.loadConst("", _type='str')
                self.jasmin.StringBuilderAppend('str')
                #raise Exception("Não é possível imprimir uma função void.")
        elif hasattr(ctx,'inh') and ctx.inh == 'if':
            if ctx.type != 'bool':
                cmd = "Erro: Era esperado uma variável do tipo 'bool' mas foi recebido '" + ctx.type + "'"
                raise Exception(cmd) 
            ctx.result_address = self.testeLogico()
            self.structElse(ctx)

    # Enter a parse tree produced by jauanParser#args_real.
    def enterArgs_real(self, ctx: jauanParser.Args_realContext):
        if ctx.children:
            for i in range(len(ctx.children)):
                if hasattr(ctx,'inh'):
                    ctx.children[i].inh = ctx.inh

    # Exit a parse tree produced by jauanParser#args_real.
    def exitArgs_real(self, ctx: jauanParser.Args_realContext):
        ctx.val = []
        ctx.type = []
        if ctx.children:
            for i in range(len(ctx.children)):
                child = ctx.getChild(i)
                if isinstance(child, jauanParser.IdContext):
                    if not isinstance(ctx.parentCtx,jauanParser.Inst_funcaoContext):
                        child.inh = ctx.inh
                    ctx.val.append(child)
                    ctx.type.append(child.type)
                elif isinstance(child, jauanParser.ValueContext):
                    ctx.val.append(child)
                    ctx.type.append(child.type)
                elif isinstance(child, jauanParser.ExprAlgebricaContext):
                    ctx.val.append(child)
                    ctx.type.append(child.type)
                elif isinstance(child, jauanParser.ExprRelacionalBinariaContext):
                    ctx.val.append(child)
                    ctx.type.append(child.type)
                elif isinstance(child, jauanParser.ExprRelacionalUnariaContext):
                    ctx.val.append(child) 
                    ctx.type.append(child.type)
                elif isinstance(child, jauanParser.Inst_funcaoContext):
                    ctx.type.append(child.type)
        if isinstance(ctx.parentCtx,jauanParser.Inst_funcaoContext):
            name_function = ctx.parentCtx.id_().ID_L().getText()
            function_id = self.searchNameFunction(name_function)
            if function_id != None:
                numero_parametros = len(self.tabelaNameFunctions[function_id][EXPECTED_TYPES])
                if ctx.children:
                    args_passer = [i for i in ctx.children if not isinstance(i,TerminalNodeImpl)]
                else:
                    args_passer = []
                if numero_parametros != len(args_passer):
                    cmd = "A função '" + name_function + "' espera " + str(len(self.tabelaNameFunctions[function_id][EXPECTED_TYPES])) + " parâmetros, mas foram recebidos " + str(len(ctx.children))
                    raise Exception(cmd)
                else:
                    for i in zip(args_passer,self.tabelaNameFunctions[function_id][EXPECTED_TYPES]):
                        if i[0].type != i[1]:
                            cmd = "A função '" + name_function + "' espera o tipo '" + i[1] + "' mas foi recebido '" + i[0].type + "'"
                            raise Exception(cmd)
            else:
                cmd = "A função '" + name_function + "' não foi declarada."
                raise Exception(cmd)

    # Enter a parse tree produced by jauanParser#exprRelacional.
    def enterExprRelacionalBinaria(self, ctx: jauanParser.ExprRelacionalBinariaContext):
        ctx.op_relacional(0).inh = 'l'
        ctx.op_relacional(1).inh = 'r'
        ctx.op_relacional(0).relacional = 'true'
        ctx.op_relacional(1).relacional = 'true'

    def structElse(self,ctx):
        self.jasmin.load(ctx.result_address,'int')
        lb_else,lb_end = self.jasmin.executeIf()
        if isinstance(ctx.parentCtx.else_(), jauanParser.ElseContext):
            ctx.parentCtx.else_().lb_else = lb_else
            ctx.parentCtx.else_().lb_end = lb_end

    # Exit a parse tree produced by jauanParser#exprRelacional.
    def exitExprRelacionalBinaria(self, ctx: jauanParser.ExprRelacionalBinariaContext):
        ctx.type = 'bool'
        _type = 'int' if ctx.op_relacional(0).type in ['int','bool'] and ctx.op_relacional(1).type in ['int','bool'] else 'float'
        if ctx.op_relacional(0).type in ['int','float', 'bool'] and ctx.op_relacional(1).type in ['int','float', 'bool']:
            #cmd = f"ctx.op_relacional(0).val {ctx.OPERADOR().getText()} ctx.op_relacional(1).val"
            #ctx.val = eval(cmd)
            if _type == 'float':
                if ctx.op_relacional(0).type == 'int':
                    self.jasmin.swap()
                    self.jasmin.i2f()
                    self.jasmin.swap()
                if ctx.op_relacional(1).type == 'int':
                    self.jasmin.i2f()
            ctx.result_address = self.testeLogico(ctx.OPERADOR().getText(),_type)
            if hasattr(ctx,'inh') and ctx.inh == 'if':
                self.structElse(ctx)
            elif hasattr(ctx,'inh') and ctx.inh == 'while':
                self.jasmin.load(ctx.result_address,'int')
                lb_end,lb_loop = self.jasmin.executeWhile()
            elif hasattr(ctx,'inh') and ctx.inh == 'attribute':
                self.jasmin.load(ctx.result_address,'int')
            elif hasattr(ctx,'inh') and ctx.inh == 'print':
                self.jasmin.load(ctx.result_address,'int')
                self.jasmin.ifBoolprint()
                self.jasmin.StringBuilderAppend('str')
            elif hasattr(ctx,'inh') and ctx.inh == 'return':
                self.jasmin.load(ctx.result_address,'int')
        else:
            cmd = "Tipos das variaveis '" + ctx.op_relacional(0).getText() + "' e '" + ctx.op_relacional(1).getText() + "' incompativeis."
            raise Exception(cmd)

    def testeLogico(self,operador=None,_type=None):
        self.jasmin.createIfElse()
        if operador != None and _type != None:
            self.jasmin.constructIf(operador,_type)
        else:
            self.jasmin.constructIf('!=','zero')
        lb_else,lb_end = self.jasmin.executeIf()
        # --- escopo do if
        self.jasmin.loadConst(1)
        _id = self.searchNameFunction(self.escopo)
        self.tabelaNameFunctions[_id][LAST_LOCAL_USED] += 1
        self.jasmin.createNewTemp(self.tabelaNameFunctions[_id][LAST_LOCAL_USED],'int')
        temp = self.tabelaNameFunctions[_id][LAST_LOCAL_USED]
        self.jasmin.jump(lb_end)
        # --- fim escopo do if
        # --- escopo do else
        self.jasmin.createLabel(lb_else)
        self.jasmin.loadConst(0)
        self.jasmin.store(temp,'int')
        # -- fim escopo do else
        self.jasmin.createLabel(lb_end)
        self.jasmin.in_execution.pop()
        return temp

    # Enter a parse tree produced by jauanParser#op_relacional.
    def enterOp_relacional(self, ctx:jauanParser.Op_relacionalContext):
        ctx.children[0].relacional = ctx.relacional
        if ctx.exprAlgebrica():
            ctx.exprAlgebrica().inh = ctx.inh
        pass

    # Exit a parse tree produced by jauanParser#op_relacional.
    def exitOp_relacional(self, ctx:jauanParser.Op_relacionalContext):
        #ctx.val = ctx.getChild(0).val
        ctx.type = ctx.getChild(0).type

    # Enter a parse tree produced by jauanParser#term.
    def enterTerm(self, ctx:jauanParser.TermContext):
        '''if hasattr(ctx,'inh'):
            ctx.getChild(1).inh = ctx.inh'''
        #self.jasmin.ifBoolprint(_not=True,_ctx='attr')
        pass

    # Exit a parse tree produced by jauanParser#term.
    def exitTerm(self, ctx:jauanParser.TermContext):
        if ctx.id_():
            if ctx.id_().type == 'bool':
                #ctx.val = not ctx.id_().val
                ctx.type = ctx.id_().type
            else:
                cmd = "Erro: era esperado da variável '" + ctx.id_().name + "' o tipo 'bool', mas foi recebido '" + ctx.id_().type +"'"
                raise Exception(cmd)
        elif ctx.value():
            if ctx.value().type == 'bool':
                #ctx.val = not ctx.value().val
                ctx.type = ctx.value().type
            else:
                cmd = "Erro: era esperado o tipo 'bool', mas foi recebido '" + ctx.value().type +"'"
                raise Exception(cmd)
            #ctx.type = ctx.value().type
        elif ctx.inst_funcao():
            ...
            #ctx.type = ctx.ctx.inst_funcao().type
        elif ctx.exprRelacionalBinaria():
            ...
            #ctx.type = ctx.exprRelacionalBinaria().type
        self.jasmin.ifBoolprint(_not=True,_ctx='attr')


    # Enter a parse tree produced by jauanParser#exprRelacionalUnaria.
    def enterExprRelacionalUnaria(self, ctx: jauanParser.ExprRelacionalUnariaContext):
        if hasattr(ctx,'inh') and ctx.inh == 'attribute':
            if ctx.term():
                ctx.term().inh = 'attribute'
        '''elif hasattr(ctx,'inh') and ctx.inh == 'print':
            if ctx.term():
                ctx.term().inh = 'printT'''

    # Exit a parse tree produced by jauanParser#exprRelacionalUnaria.
    def exitExprRelacionalUnaria(self, ctx: jauanParser.ExprRelacionalUnariaContext):
        ctx.type = 'bool'
        if hasattr(ctx,'inh') and ctx.inh == 'attribute':
            self.jasmin.ifBoolprint(_not=True,_ctx='attr')
        if hasattr(ctx,'inh') and ctx.inh == 'print':
            self.jasmin.ifBoolprint()
            self.jasmin.StringBuilderAppend('str')

    # Enter a parse tree produced by jauanParser#exprAlgebrica.
    def enterExprAlgebrica(self, ctx: jauanParser.ExprAlgebricaContext):
        if hasattr(ctx,'inh'):
            ctx.op_algebrico().inh = ctx.inh
        pass

    # Exit a parse tree produced by jauanParser#exprAlgebrica.
    def exitExprAlgebrica(self, ctx: jauanParser.ExprAlgebricaContext):
        #ctx.val = ctx.getChild(0).val
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
            ctx.type = 'str'
            self.jasmin.loadConst(ctx.val,'')
        elif ctx.TRUE():
            ctx.val = True
            ctx.type = 'bool'
            self.jasmin.loadConst(1)
        elif ctx.FALSE():
            ctx.val = False
            ctx.type = 'bool'
            self.jasmin.loadConst(0)
        if hasattr(ctx,'inh') and ctx.inh == 'print':
            if ctx.type == 'bool':
                self.jasmin.ifBoolprint()
                self.jasmin.StringBuilderAppend('str')
            elif not(ctx.num()):
                self.jasmin.StringBuilderAppend(ctx.type)
        elif hasattr(ctx,'inh') and ctx.inh == 'while':
            if ctx.type != 'bool':
                cmd = "Erro: Era esperado uma variável do tipo 'bool' mas foi recebido '" + ctx.type + "'"
                raise Exception(cmd)
            lb_end,lb_loop = self.jasmin.executeWhile()

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
            ...

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
        func = self.searchNameFunction(ctx.ID_L().getText())
        if var == None and func == None:
            cmd = f"Erro: Variavel '{ctx.ID_L().getText()}' nao declarada."
            raise Exception(cmd)
        if var != None:
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
        elif func != None:
            ctx.name = self.tabelaNameFunctions[func][ID]
            ctx.type = self.tabelaNameFunctions[func][RETURN_TYPE]
            ctx.id = func
        if hasattr(ctx,'inh') and ctx.inh == 'print':
            if ctx.type == 'bool':
                self.jasmin.StringBuilderAppend('str')
            else:
                self.jasmin.StringBuilderAppend(ctx.type)
        elif hasattr(ctx,'inh') and ctx.inh == 'while':
            if ctx.type != 'bool':
                cmd = "Erro: Era esperado uma variável do tipo 'bool' mas foi recebido '" + ctx.type + "'"
                raise Exception(cmd)
            lb_end,lb_loop = self.jasmin.executeWhile()
        elif hasattr(ctx,'inh') and ctx.inh == 'if':
            if ctx.type != 'bool':
                cmd = "Erro: Era esperado uma variável do tipo 'bool' mas foi recebido '" + ctx.type + "'"
                raise Exception(cmd) 
            ctx.result_address = self.testeLogico()
            self.structElse(ctx)
            

    # Buscar no dicionario a chave pelo valor
    def searchSymbolTable(self, value):
        for chave, valor in self.tabelaDeSimbolos.items():
            if valor[ID] == value and valor[ESCOPO] == self.escopo:
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
    
    def atribuirValorInicialParam(self, tipo):
        if tipo == 'int':
            return 0
        elif tipo == 'float':
            return 0.0
        elif tipo == 'str':
            return ""
        elif tipo == 'bool':
            return 0

    def searchNameFunction(self, value):
            for chave, valor in self.tabelaNameFunctions.items():
                if valor[ID] == value:
                    return chave
            return None

    def searchFunctionMainOrItself(self, value, nameEscopo):
        for chave, valor in self.tabelaDeSimbolos.items():
            if valor[ID] == value and (valor[ESCOPO] == 'main' or valor[ESCOPO] == nameEscopo):
                return chave
        return None