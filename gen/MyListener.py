from antlr4 import *

from .jauanListener import jauanListener

if __name__ is not None and "." in __name__:
    from .jauanParser import jauanParser
else:
    from jauanParser import jauanParser

# This class defines a complete listener for a parse tree produced by jauanParser.
class MyListener(jauanListener):
    def __init__(self):
        self.stack = []

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
        print(ctx.args_real().val)

    # Exit a parse tree produced by jauanParser#unario.
    def exitUnario(self, ctx:jauanParser.UnarioContext):
        ctx.val = -ctx.op_algebrico().val
        self.stack.append(ctx.val)

    # Exit a parse tree produced by jauanParser#parenteses.
    def exitParenteses(self, ctx:jauanParser.ParentesesContext):
        ctx.val = ctx.op_algebrico().val
        self.stack.append(ctx.val)

    # Exit a parse tree produced by jauanParser#multDiv.
    def exitMultDiv(self, ctx:jauanParser.MultDivContext):
        if ctx.op.text == 'MUL':
            ctx.val = ctx.op_algebrico(0).val * ctx.op_algebrico(1).val
        elif ctx.op.text == 'DIV':
            ctx.val = ctx.op_algebrico(0).val / ctx.op_algebrico(1).val
        self.stack.append(ctx.val)

    # Exit a parse tree produced by jauanParser#addSub.
    def exitAddSub(self, ctx:jauanParser.AddSubContext):
        if ctx.op.text == '+':
            ctx.val = ctx.op_algebrico(0).val + ctx.op_algebrico(1).val
        elif ctx.op.text == '-':
            ctx.val = ctx.op_algebrico(0).val - ctx.op_algebrico(1).val

    # Exit a parse tree produced by jauanParser#operando.
    def exitOperando(self, ctx:jauanParser.OperandoContext):
        if ctx.ID():
            ctx.val = ctx.ID().getText()
        elif ctx.num():
            ctx.val = ctx.num().val

    # Exit a parse tree produced by jauanParser#args_real.
    def exitArgs_real(self, ctx: jauanParser.Args_realContext):
        if ctx.value():
            ctx.val = ctx.value().val
        elif ctx.expr():
            ctx.val = ctx.expr()[0].val

    # Exit a parse tree produced by jauanParser#expr.
    def exitExpr(self, ctx: jauanParser.ExprContext):
        if ctx.op_algebrico():
            ctx.val = ctx.op_algebrico().val

    # Exit a parse tree produced by jauanParser#value.
    def exitValue(self, ctx: jauanParser.ValueContext):
        if ctx.num():
            ctx.val = ctx.num().val

    # Exit a parse tree produced by jauanParser#num.
    def exitNum(self, ctx: jauanParser.NumContext):
        if ctx.INT():
            ctx.val = int(ctx.INT().getText())
        elif ctx.FLOAT():
            ctx.val = float(ctx.FLOAT().getText())
