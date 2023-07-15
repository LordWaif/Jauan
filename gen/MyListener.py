from antlr4 import *

from .jauanListener import jauanListener

if __name__ is not None and "." in __name__:
    from .jauanParser import jauanParser
else:
    from jauanParser import jauanParser

# This class defines a complete listener for a parse tree produced by jauanParser.
class MyListener(jauanListener):

    # Enter a parse tree produced by jauanParser#prog.
    def enterProg(self, ctx:jauanParser.ProgContext):
        pass

    # Exit a parse tree produced by jauanParser#prog.
    def exitProg(self, ctx:jauanParser.ProgContext):
        pass

    # Enter a parse tree produced by jauanParser#declar_funcao.
    def enterDeclar_funcao(self, ctx:jauanParser.Declar_funcaoContext):
        pass

    # Exit a parse tree produced by jauanParser#declar_funcao.
    def exitDeclar_funcao(self, ctx:jauanParser.Declar_funcaoContext):
        pass


    # Enter a parse tree produced by jauanParser#args_formal.
    def enterArgs_formal(self, ctx:jauanParser.Args_formalContext):
        pass

    # Exit a parse tree produced by jauanParser#args_formal.
    def exitArgs_formal(self, ctx:jauanParser.Args_formalContext):
        pass


    # Enter a parse tree produced by jauanParser#parametro.
    def enterParametro(self, ctx:jauanParser.ParametroContext):
        pass

    # Exit a parse tree produced by jauanParser#parametro.
    def exitParametro(self, ctx:jauanParser.ParametroContext):
        pass


    # Enter a parse tree produced by jauanParser#retorno.
    def enterRetorno(self, ctx:jauanParser.RetornoContext):
        pass

    # Exit a parse tree produced by jauanParser#retorno.
    def exitRetorno(self, ctx:jauanParser.RetornoContext):
        pass


    # Enter a parse tree produced by jauanParser#main.
    def enterMain(self, ctx:jauanParser.MainContext):
        pass

    # Exit a parse tree produced by jauanParser#main.
    def exitMain(self, ctx:jauanParser.MainContext):
        pass


    # Enter a parse tree produced by jauanParser#var.
    def enterVar(self, ctx:jauanParser.VarContext):
        pass

    # Exit a parse tree produced by jauanParser#var.
    def exitVar(self, ctx:jauanParser.VarContext):
        pass


    # Enter a parse tree produced by jauanParser#declaracao.
    def enterDeclaracao(self, ctx:jauanParser.DeclaracaoContext):
        pass

    # Exit a parse tree produced by jauanParser#declaracao.
    def exitDeclaracao(self, ctx:jauanParser.DeclaracaoContext):
        pass


    # Enter a parse tree produced by jauanParser#comando.
    def enterComando(self, ctx:jauanParser.ComandoContext):
        pass

    # Exit a parse tree produced by jauanParser#comando.
    def exitComando(self, ctx:jauanParser.ComandoContext):
        pass


    # Enter a parse tree produced by jauanParser#comando_atribuicao.
    def enterComando_atribuicao(self, ctx:jauanParser.Comando_atribuicaoContext):
        pass

    # Exit a parse tree produced by jauanParser#comando_atribuicao.
    def exitComando_atribuicao(self, ctx:jauanParser.Comando_atribuicaoContext):
        pass


    # Enter a parse tree produced by jauanParser#break.
    def enterBreak(self, ctx:jauanParser.BreakContext):
        if not self.inLoop(ctx):
            print("Erro: O comando 'break' deve estar dentro de um loop.")

    # Exit a parse tree produced by jauanParser#break.
    def exitBreak(self, ctx:jauanParser.BreakContext):
        pass

    def inLoop(self, ctx):
        parent = ctx.parentCtx
        while parent is not None:
            if isinstance(parent, jauanParser.WhileContext):
                return True
            parent = parent.parentCtx
        return False

    # Enter a parse tree produced by jauanParser#op_algebrico.
    def enterOp_algebrico(self, ctx:jauanParser.Op_algebricoContext):
        pass

    # Exit a parse tree produced by jauanParser#op_algebrico.
    def exitOp_algebrico(self, ctx:jauanParser.Op_algebricoContext):
        pass


    # Enter a parse tree produced by jauanParser#e1.
    def enterE1(self, ctx:jauanParser.E1Context):
        pass

    # Exit a parse tree produced by jauanParser#e1.
    def exitE1(self, ctx:jauanParser.E1Context):
        pass


    # Enter a parse tree produced by jauanParser#t.
    def enterT(self, ctx:jauanParser.TContext):
        pass

    # Exit a parse tree produced by jauanParser#t.
    def exitT(self, ctx:jauanParser.TContext):
        pass


    # Enter a parse tree produced by jauanParser#t1.
    def enterT1(self, ctx:jauanParser.T1Context):
        pass

    # Exit a parse tree produced by jauanParser#t1.
    def exitT1(self, ctx:jauanParser.T1Context):
        pass


    # Enter a parse tree produced by jauanParser#g.
    def enterG(self, ctx:jauanParser.GContext):
        pass

    # Exit a parse tree produced by jauanParser#g.
    def exitG(self, ctx:jauanParser.GContext):
        pass


    # Enter a parse tree produced by jauanParser#ifElse.
    def enterIfElse(self, ctx:jauanParser.IfElseContext):
        pass

    # Exit a parse tree produced by jauanParser#ifElse.
    def exitIfElse(self, ctx:jauanParser.IfElseContext):
        pass


    # Enter a parse tree produced by jauanParser#while.
    def enterWhile(self, ctx:jauanParser.WhileContext):
        pass

    # Exit a parse tree produced by jauanParser#while.
    def exitWhile(self, ctx:jauanParser.WhileContext):
        pass


    # Enter a parse tree produced by jauanParser#scanf.
    def enterScanf(self, ctx:jauanParser.ScanfContext):
        pass

    # Exit a parse tree produced by jauanParser#scanf.
    def exitScanf(self, ctx:jauanParser.ScanfContext):
        pass


    # Enter a parse tree produced by jauanParser#print.
    def enterPrint(self, ctx:jauanParser.PrintContext):
        pass

    # Exit a parse tree produced by jauanParser#print.
    def exitPrint(self, ctx:jauanParser.PrintContext):
        pass


    # Enter a parse tree produced by jauanParser#inst_funcao.
    def enterInst_funcao(self, ctx:jauanParser.Inst_funcaoContext):
        pass

    # Exit a parse tree produced by jauanParser#inst_funcao.
    def exitInst_funcao(self, ctx:jauanParser.Inst_funcaoContext):
        pass


    # Enter a parse tree produced by jauanParser#args_real.
    def enterArgs_real(self, ctx:jauanParser.Args_realContext):
        pass

    # Exit a parse tree produced by jauanParser#args_real.
    def exitArgs_real(self, ctx:jauanParser.Args_realContext):
        pass


    # Enter a parse tree produced by jauanParser#expr.
    def enterExpr(self, ctx:jauanParser.ExprContext):
        pass

    # Exit a parse tree produced by jauanParser#expr.
    def exitExpr(self, ctx:jauanParser.ExprContext):
        pass


    # Enter a parse tree produced by jauanParser#expr1.
    def enterExpr1(self, ctx:jauanParser.Expr1Context):
        pass

    # Exit a parse tree produced by jauanParser#expr1.
    def exitExpr1(self, ctx:jauanParser.Expr1Context):
        pass


    # Enter a parse tree produced by jauanParser#value.
    def enterValue(self, ctx:jauanParser.ValueContext):
        pass

    # Exit a parse tree produced by jauanParser#value.
    def exitValue(self, ctx:jauanParser.ValueContext):
        pass


    # Enter a parse tree produced by jauanParser#num.
    def enterNum(self, ctx:jauanParser.NumContext):
        pass

    # Exit a parse tree produced by jauanParser#num.
    def exitNum(self, ctx:jauanParser.NumContext):
        pass



del jauanParser