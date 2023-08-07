from antlr4 import *
from jasmin import Jasmin

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
        self.jasmin.createMain(10, 10)
        self.escopoMain = True
        pass

    # Exit a parse tree produced by jauanParser#main.
    def exitMain(self, ctx: jauanParser.MainContext):
        self.escopoMain = False
        self.jasmin.endMain()
        print(self.tabelaDeSimbolos)
        pass

    # Enter a parse tree produced by jauanParser#declar_funcao.
    def enterDeclar_funcao(self, ctx: jauanParser.Declar_funcaoContext):
        self.escopoMain=False
        pass

    # Exit a parse tree produced by jauanParser#declar_funcao.
    def exitDeclar_funcao(self, ctx: jauanParser.Declar_funcaoContext):
        self.escopoMain = True
        pass

    # Enter a parse tree produced by jauanParser#args_formal.
    def enterArgs_formal(self, ctx: jauanParser.Args_formalContext):
        pass

    # Exit a parse tree produced by jauanParser#args_formal.
    def exitArgs_formal(self, ctx: jauanParser.Args_formalContext):
        pass

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
        pass

    # Exit a parse tree produced by jauanParser#retorno.
    def exitRetorno(self, ctx: jauanParser.RetornoContext):
        pass

    # Enter a parse tree produced by jauanParser#parametro.
    def enterParametro(self, ctx: jauanParser.ParametroContext):
        pass

    # Exit a parse tree produced by jauanParser#parametro.
    def exitParametro(self, ctx: jauanParser.ParametroContext):
        pass

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
        for indice, constante in enumerate(ctx.ID()):
            if isinstance(ctx.value()[indice].val, str):
                if "TRUE" == ctx.value()[indice].val.upper():
                    ctx.value()[indice].val = True
                elif "FALSE" == ctx.value()[indice].val.upper():
                    ctx.value()[indice].val = False
            # Verifica se a constante já foi declarada
            if self.searchSymbolTable(constante.getText()) == None:
                # Verifica se a tabela de simbolos está vazia
                if len(self.tabelaDeSimbolos.keys()) == 0:
                    self.tabelaDeSimbolos[indice] = [constante.getText(), ctx.value()[indice].val,
                                                     type(ctx.value()[indice].val).__name__, self.escopoMain, "const"]
                else:
                    self.tabelaDeSimbolos[list(self.tabelaDeSimbolos.keys())[-1] + 1] = [constante.getText(),
                                                                                         ctx.value()[indice].val, type(
                            ctx.value()[indice].val).__name__, self.escopoMain, "const"]
            else:
                raise Exception("A constante " + constante.getText() + " já foi declarada")

    # Enter a parse tree produced by jauanParser#declaraVariavel.
    def enterDeclaraVariavel(self, ctx: jauanParser.DeclaraVariavelContext):
        pass

    # Exit a parse tree produced by jauanParser#declaraVariavel.
    def exitDeclaraVariavel(self, ctx: jauanParser.DeclaraVariavelContext):
        for indice, variavel in enumerate(ctx.ID()):
            if self.searchSymbolTable(variavel.getText()) == None:
                valorInicial = self.atribuirValorInicial(ctx)
                if len(self.tabelaDeSimbolos.keys()) == 0:
                    self.tabelaDeSimbolos[indice] = [variavel.getText(), valorInicial, ctx.TIPO().getText(),
                                                     self.escopoMain, "var"]
                else:
                    self.tabelaDeSimbolos[list(self.tabelaDeSimbolos.keys())[-1] + 1] = [variavel.getText(),
                                                                                         valorInicial,
                                                                                         ctx.TIPO().getText(),
                                                                                         self.escopoMain, "var"]
            else:
                raise Exception("A variavel '" + variavel.getText() + "' já foi declarada")

    # Enter a parse tree produced by jauanParser#comando_atribuicao.
    def enterComando_atribuicao(self, ctx: jauanParser.Comando_atribuicaoContext):
        pass

    # Exit a parse tree produced by jauanParser#comando_atribuicao.
    def exitComando_atribuicao(self, ctx: jauanParser.Comando_atribuicaoContext):
        var = self.searchSymbolTable(str(ctx.ID(0)))
        if type(self.tabelaDeSimbolos[var][VALOR]) == type(ctx.op_algebrico().val):
            ctx.val = ctx.op_algebrico().val
            self.tabelaDeSimbolos[var][VALOR] = ctx.op_algebrico().val
        else:
            raise Exception("A variável " + str(ctx.ID(0)) + " não é do mesmo tipo do valor atribuído")

    # Enter a parse tree produced by jauanParser#unario.
    def enterUnario(self, ctx: jauanParser.UnarioContext):
        pass

    # Exit a parse tree produced by jauanParser#unario.
    def exitUnario(self, ctx: jauanParser.UnarioContext):
        ctx.val = -ctx.op_algebrico().val

    # Enter a parse tree produced by jauanParser#parenteses.
    def enterParenteses(self, ctx: jauanParser.ParentesesContext):
        pass

    # Exit a parse tree produced by jauanParser#parenteses.
    def exitParenteses(self, ctx: jauanParser.ParentesesContext):
        ctx.val = ctx.op_algebrico().val

    # Enter a parse tree produced by jauanParser#multDiv.
    def enterMultDiv(self, ctx: jauanParser.MultDivContext):
        pass

    # Exit a parse tree produced by jauanParser#multDiv.
    def exitMultDiv(self, ctx: jauanParser.MultDivContext):
        if type(ctx.op_algebrico(0).val) == type(ctx.op_algebrico(1).val):
            if ctx.op.text == '*':
                ctx.val = ctx.op_algebrico(0).val * ctx.op_algebrico(1).val
            elif ctx.op.text == '/':
                ctx.val = ctx.op_algebrico(0).val / ctx.op_algebrico(1).val
        else:
            raise Exception("Erro: Tipos incompativeis.")

    # Enter a parse tree produced by jauanParser#addSub.
    def enterAddSub(self, ctx: jauanParser.AddSubContext):
        pass

    # Exit a parse tree produced by jauanParser#addSub.
    def exitAddSub(self, ctx: jauanParser.AddSubContext):
        if type(ctx.op_algebrico(0).val) == type(ctx.op_algebrico(1).val):
            if ctx.op.text == '+':
                ctx.val = ctx.op_algebrico(0).val + ctx.op_algebrico(1).val
            elif ctx.op.text == '-':
                ctx.val = ctx.op_algebrico(0).val - ctx.op_algebrico(1).val
        else:
            raise Exception("Erro: Tipos incompativeis.")

    # Enter a parse tree produced by jauanParser#operando.
    def enterOperando(self, ctx: jauanParser.OperandoContext):
        pass

    # Exit a parse tree produced by jauanParser#operando.
    def exitOperando(self, ctx: jauanParser.OperandoContext):
        if ctx.ID():
            var = self.searchSymbolTable(ctx.ID().getText())
            if var == None:
                raise Exception("Erro: Variavel '" + ctx.ID().getText() + "' nao declarada.")
            if self.tabelaDeSimbolos[var][TIPO] == 'int' or self.tabelaDeSimbolos[var][TIPO] == 'float':
                ctx.val = self.tabelaDeSimbolos[var][VALOR]
            else:
                raise Exception("Erro: Variavel '" + ctx.ID().getText() + "' é do tipo '" + self.tabelaDeSimbolos[var][
                    TIPO] + "' e nao do tipo int ou float.")
        elif ctx.num():
            ctx.val = ctx.num().val

    # Enter a parse tree produced by jauanParser#ifElse.
    def enterIfElse(self, ctx: jauanParser.IfElseContext):
        pass

    # Exit a parse tree produced by jauanParser#ifElse.
    def exitIfElse(self, ctx: jauanParser.IfElseContext):
        pass

    # Enter a parse tree produced by jauanParser#while.
    def enterWhile(self, ctx: jauanParser.WhileContext):
        pass

    # Exit a parse tree produced by jauanParser#while.
    def exitWhile(self, ctx: jauanParser.WhileContext):
        pass

    # Enter a parse tree produced by jauanParser#scanf.
    def enterScanf(self, ctx: jauanParser.ScanfContext):
        pass

    # Exit a parse tree produced by jauanParser#scanf.
    def exitScanf(self, ctx: jauanParser.ScanfContext):
        pass

    # Enter a parse tree produced by jauanParser#print.
    def enterPrint(self, ctx: jauanParser.PrintContext):
        pass

    # Exit a parse tree produced by jauanParser#print.
    def exitPrint(self, ctx: jauanParser.PrintContext):
        print(ctx.args_real().val)

    # Enter a parse tree produced by jauanParser#break.
    def enterBreak(self, ctx: jauanParser.BreakContext):
        if not self.inLoop(ctx):
            print("Erro: O comando 'break' deve estar dentro de um loop.")

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
        pass

    # Exit a parse tree produced by jauanParser#args_real.
    def exitArgs_real(self, ctx: jauanParser.Args_realContext):
        if ctx.value():
            ctx.val = ctx.value().val
        elif ctx.exprAlgebrica():
            ctx.val = ctx.exprAlgebrica()[0].val
        elif ctx.exprRelacionalBinaria():
            ctx.val = ctx.exprRelacionalBinaria()[0].val
        elif ctx.exprRelacionalUnaria():
            ctx.val = ctx.exprRelacionalUnaria()[0].val

    # Enter a parse tree produced by jauanParser#exprRelacional.
    def enterExprRelacionalBinaria(self, ctx: jauanParser.ExprRelacionalBinariaContext):
        pass


    # Exit a parse tree produced by jauanParser#exprRelacional.
    def exitExprRelacionalBinaria(self, ctx: jauanParser.ExprRelacionalBinariaContext):
        if type(ctx.op_relacional(0).val) == type(ctx.op_relacional(1).val):
            if ctx.OPERADOR().getText() == '>':
                ctx.val = ctx.op_relacional(0).val > ctx.op_relacional(1).val
            elif ctx.OPERADOR().getText() == '<':
                ctx.val = ctx.op_relacional(0).val < ctx.op_relacional(1).val
            elif ctx.OPERADOR().getText() == '>=':
                ctx.val = ctx.op_relacional(0).val >= ctx.op_relacional(1).val
            elif ctx.OPERADOR().getText() == '<=':
                ctx.val = ctx.op_relacional(0).val <= ctx.op_relacional(1).val
            elif ctx.OPERADOR().getText() == '==':
                ctx.val = ctx.op_relacional(0).val == ctx.op_relacional(1).val
        else:
            raise Exception("Tipos das variaveis '" + ctx.op_relacional(0).getText() + "' e '" + ctx.op_relacional(1).getText() + "' incompativeis.")


    # Enter a parse tree produced by jauanParser#op_relacional.
    def enterOp_relacional(self, ctx:jauanParser.Op_relacionalContext):
        pass

    # Exit a parse tree produced by jauanParser#op_relacional.
    def exitOp_relacional(self, ctx:jauanParser.Op_relacionalContext):
        if ctx.ID():
            var = self.searchSymbolTable(ctx.ID().getText())
            if var != None:
                ctx.val = self.tabelaDeSimbolos[var][VALOR]
            else:
                raise Exception("Erro: Variavel '" + ctx.ID().getText() + "' nao declarada.")
            
        if ctx.value():
            ctx.val = ctx.value().val

        if ctx.exprRelacionalUnaria():
            ctx.val = ctx.exprRelacionalUnaria().val


    # Enter a parse tree produced by jauanParser#exprRelacionalUnaria.
    def enterExprRelacionalUnaria(self, ctx: jauanParser.ExprRelacionalUnariaContext):
        pass

    # Exit a parse tree produced by jauanParser#exprRelacionalUnaria.
    def exitExprRelacionalUnaria(self, ctx: jauanParser.ExprRelacionalUnariaContext):
        if ctx.ID():
            var = self.searchSymbolTable(ctx.ID().getText())
            if var:
                if self.tabelaDeSimbolos[var][TIPO] == 'bool':
                    ctx.val = not self.tabelaDeSimbolos[var][VALOR]
                else:
                    raise Exception("Erro: era esperado da variável '" + self.tabelaDeSimbolos[var][ID] + "' o tipo 'bool', mas foi recebido '" + self.tabelaDeSimbolos[var][TIPO] +"'")
            else:
                raise Exception("Erro: Variavel '" + ctx.exprRelacionalUnaria().getText()[1] + "' nao declarada.")
        elif ctx.value():
            ctx.val = not ctx.value().val

    # Enter a parse tree produced by jauanParser#exprAlgebrica.
    def enterExprAlgebrica(self, ctx: jauanParser.ExprAlgebricaContext):
        pass

    # Exit a parse tree produced by jauanParser#exprAlgebrica.
    def exitExprAlgebrica(self, ctx: jauanParser.ExprAlgebricaContext):
        if ctx.op_algebrico():
            ctx.val = ctx.op_algebrico().val

    # Enter a parse tree produced by jauanParser#value.
    def enterValue(self, ctx: jauanParser.ValueContext):
        pass

    # Exit a parse tree produced by jauanParser#value.
    def exitValue(self, ctx: jauanParser.ValueContext):
        if ctx.num():
            ctx.val = ctx.num().val
        elif ctx.STRING():
            ctx.val = ctx.STRING().val
        elif ctx.TRUE():
            ctx.val = ctx.TRUE().getText()
        elif ctx.FALSE():
            ctx.val = ctx.FALSE().getText()

    # Enter a parse tree produced by jauanParser#num.
    def enterNum(self, ctx: jauanParser.NumContext):
        pass

    # Exit a parse tree produced by jauanParser#num.
    def exitNum(self, ctx: jauanParser.NumContext):
        if ctx.INT():
            ctx.val = int(ctx.INT().getText())
        elif ctx.FLOAT():
            ctx.val = float(ctx.FLOAT().getText())

    def inLoop(self, ctx):
        parent = ctx.parentCtx
        while parent is not None:
            if isinstance(parent, jauanParser.WhileContext):
                return True
            parent = parent.parentCtx
        return False

    # Buscar no dicionario a chave pelo valor
    def searchSymbolTable(self, value):
        for chave, valor in self.tabelaDeSimbolos.items():
            if valor[ID] == value and valor[ESCOPO] == self.escopoMain:
                return chave
        return None

    def atribuirValorInicial(self, ctx):
        "Atribui o valor a variavel"
        if ctx.TIPO().getText() == 'int':
            return 0
        if ctx.TIPO().getText() == 'float':
            return 0.0
        if ctx.TIPO().getText() == 'string':
            return ''
        if ctx.TIPO().getText() == 'bool':
            return False