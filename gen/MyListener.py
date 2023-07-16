from antlr4 import *

from .jauanListener import jauanListener

if __name__ is not None and "." in __name__:
    from .jauanParser import jauanParser
else:
    from jauanParser import jauanParser

# This class defines a complete listener for a parse tree produced by jauanParser.
class MyListener(jauanListener):

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

    # Exit a parse tree produced by jauanParser#print.
    def exitPrint(self, ctx:jauanParser.PrintContext):
        #print(ctx.args_real().val)
        pass

    def avaliar_Op_algebrico(self, ctx:jauanParser.Op_algebricoContext):
        rule_index = ctx.getRuleIndex()
        print(rule_index)
        if rule_index == jauanParser.RULE_unario:
            ctx.val = ctx.unario().val
        elif rule_index == jauanParser.RULE_parenteses:
            ctx.val = ctx.parenteses().val
        elif rule_index == jauanParser.RULE_multDiv:
            ctx.val = ctx.multDiv().val
        elif rule_index == jauanParser.RULE_addSub:
            ctx.val = ctx.addSub().val
        elif rule_index == jauanParser.RULE_operando:
            ctx.val = ctx.operando().val

    # Exit a parse tree produced by jauanParser#unario.
    def exitUnario(self, ctx:jauanParser.UnarioContext):
        ctx.val = -ctx.op_algebrico().val

    # Exit a parse tree produced by jauanParser#parenteses.
    def exitParenteses(self, ctx:jauanParser.ParentesesContext):
        ctx.val = ctx.op_algebrico().val

    # Exit a parse tree produced by jauanParser#multDiv.
    def exitMultDiv(self, ctx:jauanParser.MultDivContext):
        if ctx.op.text == 'MUL':
            ctx.val = ctx.op_algebrico(0).val * ctx.op_algebrico(1).val
        elif ctx.op.text == 'DIV':
            ctx.val = ctx.op_algebrico(0).val / ctx.op_algebrico(1).val

    # Exit a parse tree produced by jauanParser#addSub.
    def exitAddSub(self, ctx:jauanParser.AddSubContext):
        if ctx.op.text == 'ADD':
            ctx.val = ctx.op_algebrico(0).val + ctx.op_algebrico(1).val
        elif ctx.op.text == 'SUB':
            ctx.val = ctx.op_algebrico(0).val - ctx.op_algebrico(1).val

    # Exit a parse tree produced by jauanParser#operando.
    def exitOperando(self, ctx:jauanParser.OperandoContext):
        if ctx.ID() is not None:
            ctx.val = int(ctx.ID().getText())
        elif ctx.num() is not None:
            ctx.val = float(ctx.num().val)

    # Exit a parse tree produced by jauanParser#args_real.
    def exitArgs_real(self, ctx: jauanParser.Args_realContext):
        if ctx.value() is not None:
            #ctx.val = ctx.value().val
            ctx.val = 2
        if ctx.expr():
            ctx.val = ctx.expr().val

    # Exit a parse tree produced by jauanParser#expr.
    def exitExpr(self, ctx: jauanParser.ExprContext):
        if ctx.op_algebrico():
            ctx.val = self.avaliar_Op_algebrico(ctx.op_algebrico())

    # Exit a parse tree produced by jauanParser#value.
    def exitValue(self, ctx: jauanParser.ValueContext):
        if ctx.num() is not None:
            ctx.val = ctx.num().val

    # Exit a parse tree produced by jauanParser#num.
    def exitNum(self, ctx: jauanParser.NumContext):
        if ctx.INT() is not None:
            ctx.val = int(ctx.INT().getText())
        elif ctx.FLOAT() is not None:
            ctx.val = float(ctx.FLOAT().getText())

del jauanParser