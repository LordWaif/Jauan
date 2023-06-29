# Generated from C:/Users/victo/Desktop/Projetos/Jauan\jauan.g4 by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .jauanParser import jauanParser
else:
    from jauanParser import jauanParser

# This class defines a complete generic visitor for a parse tree produced by jauanParser.

class jauanVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by jauanParser#prog.
    def visitProg(self, ctx:jauanParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jauanParser#funcao.
    def visitFuncao(self, ctx:jauanParser.FuncaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jauanParser#main.
    def visitMain(self, ctx:jauanParser.MainContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jauanParser#var.
    def visitVar(self, ctx:jauanParser.VarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by jauanParser#comando.
    def visitComando(self, ctx:jauanParser.ComandoContext):
        return self.visitChildren(ctx)



del jauanParser