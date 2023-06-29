# Generated from C:/Users/victo/Desktop/Projetos/Jauan\jauan.g4 by ANTLR 4.12.0
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,11,35,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,1,0,5,0,12,8,0,
        10,0,12,0,15,9,0,1,0,1,0,1,1,1,1,1,2,1,2,1,2,1,2,1,2,1,3,1,3,1,3,
        4,3,29,8,3,11,3,12,3,30,1,4,1,4,1,4,0,0,5,0,2,4,6,8,0,0,31,0,13,
        1,0,0,0,2,18,1,0,0,0,4,20,1,0,0,0,6,25,1,0,0,0,8,32,1,0,0,0,10,12,
        3,2,1,0,11,10,1,0,0,0,12,15,1,0,0,0,13,11,1,0,0,0,13,14,1,0,0,0,
        14,16,1,0,0,0,15,13,1,0,0,0,16,17,3,4,2,0,17,1,1,0,0,0,18,19,5,1,
        0,0,19,3,1,0,0,0,20,21,5,2,0,0,21,22,5,3,0,0,22,23,3,6,3,0,23,24,
        5,4,0,0,24,5,1,0,0,0,25,26,5,5,0,0,26,28,5,3,0,0,27,29,5,7,0,0,28,
        27,1,0,0,0,29,30,1,0,0,0,30,28,1,0,0,0,30,31,1,0,0,0,31,7,1,0,0,
        0,32,33,5,6,0,0,33,9,1,0,0,0,2,13,30
    ]

class jauanParser ( Parser ):

    grammarFileName = "jauan.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'funcao'", "'main'", "':'", "'end'", 
                     "'var'", "'comando'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "DECLARACAO", 
                      "VALUE", "ID", "OPERADOR", "WS" ]

    RULE_prog = 0
    RULE_funcao = 1
    RULE_main = 2
    RULE_var = 3
    RULE_comando = 4

    ruleNames =  [ "prog", "funcao", "main", "var", "comando" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    DECLARACAO=7
    VALUE=8
    ID=9
    OPERADOR=10
    WS=11

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.12.0")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def main(self):
            return self.getTypedRuleContext(jauanParser.MainContext,0)


        def funcao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jauanParser.FuncaoContext)
            else:
                return self.getTypedRuleContext(jauanParser.FuncaoContext,i)


        def getRuleIndex(self):
            return jauanParser.RULE_prog

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProg" ):
                listener.enterProg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProg" ):
                listener.exitProg(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProg" ):
                return visitor.visitProg(self)
            else:
                return visitor.visitChildren(self)




    def prog(self):

        localctx = jauanParser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_prog)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 13
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==1:
                self.state = 10
                self.funcao()
                self.state = 15
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 16
            self.main()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FuncaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return jauanParser.RULE_funcao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFuncao" ):
                listener.enterFuncao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFuncao" ):
                listener.exitFuncao(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFuncao" ):
                return visitor.visitFuncao(self)
            else:
                return visitor.visitChildren(self)




    def funcao(self):

        localctx = jauanParser.FuncaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_funcao)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 18
            self.match(jauanParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MainContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def var(self):
            return self.getTypedRuleContext(jauanParser.VarContext,0)


        def getRuleIndex(self):
            return jauanParser.RULE_main

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMain" ):
                listener.enterMain(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMain" ):
                listener.exitMain(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMain" ):
                return visitor.visitMain(self)
            else:
                return visitor.visitChildren(self)




    def main(self):

        localctx = jauanParser.MainContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_main)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 20
            self.match(jauanParser.T__1)
            self.state = 21
            self.match(jauanParser.T__2)
            self.state = 22
            self.var()
            self.state = 23
            self.match(jauanParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VarContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DECLARACAO(self, i:int=None):
            if i is None:
                return self.getTokens(jauanParser.DECLARACAO)
            else:
                return self.getToken(jauanParser.DECLARACAO, i)

        def getRuleIndex(self):
            return jauanParser.RULE_var

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVar" ):
                listener.enterVar(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVar" ):
                listener.exitVar(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVar" ):
                return visitor.visitVar(self)
            else:
                return visitor.visitChildren(self)




    def var(self):

        localctx = jauanParser.VarContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_var)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 25
            self.match(jauanParser.T__4)
            self.state = 26
            self.match(jauanParser.T__2)
            self.state = 28 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 27
                self.match(jauanParser.DECLARACAO)
                self.state = 30 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==7):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ComandoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return jauanParser.RULE_comando

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComando" ):
                listener.enterComando(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComando" ):
                listener.exitComando(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComando" ):
                return visitor.visitComando(self)
            else:
                return visitor.visitChildren(self)




    def comando(self):

        localctx = jauanParser.ComandoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_comando)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 32
            self.match(jauanParser.T__5)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





