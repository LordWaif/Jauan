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
        4,1,34,331,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,1,0,5,0,54,
        8,0,10,0,12,0,57,9,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,68,
        8,1,1,1,4,1,71,8,1,11,1,12,1,72,1,1,1,1,1,1,1,1,3,1,79,8,1,1,1,4,
        1,82,8,1,11,1,12,1,83,3,1,86,8,1,1,1,1,1,1,2,1,2,1,2,5,2,93,8,2,
        10,2,12,2,96,9,2,3,2,98,8,2,1,3,1,3,1,3,1,4,1,4,1,4,3,4,106,8,4,
        1,4,1,4,1,5,1,5,1,5,3,5,113,8,5,1,5,5,5,116,8,5,10,5,12,5,119,9,
        5,1,5,1,5,1,6,1,6,1,6,4,6,126,8,6,11,6,12,6,127,1,7,1,7,1,7,1,7,
        1,7,1,7,1,7,5,7,137,8,7,10,7,12,7,140,9,7,1,7,1,7,1,7,1,7,1,7,1,
        7,1,7,1,7,3,7,150,8,7,1,7,1,7,1,8,4,8,155,8,8,11,8,12,8,156,1,8,
        1,8,1,8,1,8,1,8,1,8,3,8,165,8,8,1,8,1,8,3,8,169,8,8,1,9,1,9,1,9,
        1,9,3,9,175,8,9,1,10,1,10,1,11,1,11,1,11,1,12,1,12,1,12,1,12,1,12,
        1,12,1,12,1,12,1,12,3,12,191,8,12,1,13,1,13,1,13,1,14,1,14,1,14,
        1,14,1,14,1,14,1,14,1,14,1,14,3,14,205,8,14,1,15,1,15,1,15,1,15,
        3,15,211,8,15,1,15,1,15,1,15,1,15,3,15,217,8,15,1,16,1,16,1,16,1,
        16,1,16,1,16,4,16,225,8,16,11,16,12,16,226,1,16,1,16,1,16,4,16,232,
        8,16,11,16,12,16,233,3,16,236,8,16,1,16,1,16,1,17,1,17,1,17,1,17,
        1,17,1,17,5,17,246,8,17,10,17,12,17,249,9,17,1,17,3,17,252,8,17,
        3,17,254,8,17,1,17,1,17,1,18,1,18,1,18,1,18,1,18,5,18,263,8,18,10,
        18,12,18,266,9,18,1,18,1,18,1,19,1,19,1,19,1,19,1,19,1,20,1,20,1,
        20,1,20,1,20,1,21,1,21,1,21,3,21,283,8,21,1,21,1,21,1,21,1,21,3,
        21,289,8,21,5,21,291,8,21,10,21,12,21,294,9,21,3,21,296,8,21,1,22,
        1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,
        1,22,3,22,313,8,22,1,23,1,23,1,23,1,23,1,23,3,23,320,8,23,1,24,1,
        24,1,24,1,24,1,24,3,24,327,8,24,1,25,1,25,1,25,0,0,26,0,2,4,6,8,
        10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,0,
        2,1,0,31,32,1,0,24,25,355,0,55,1,0,0,0,2,60,1,0,0,0,4,97,1,0,0,0,
        6,99,1,0,0,0,8,102,1,0,0,0,10,109,1,0,0,0,12,122,1,0,0,0,14,149,
        1,0,0,0,16,168,1,0,0,0,18,170,1,0,0,0,20,176,1,0,0,0,22,178,1,0,
        0,0,24,190,1,0,0,0,26,192,1,0,0,0,28,204,1,0,0,0,30,216,1,0,0,0,
        32,218,1,0,0,0,34,239,1,0,0,0,36,257,1,0,0,0,38,269,1,0,0,0,40,274,
        1,0,0,0,42,295,1,0,0,0,44,312,1,0,0,0,46,319,1,0,0,0,48,326,1,0,
        0,0,50,328,1,0,0,0,52,54,3,2,1,0,53,52,1,0,0,0,54,57,1,0,0,0,55,
        53,1,0,0,0,55,56,1,0,0,0,56,58,1,0,0,0,57,55,1,0,0,0,58,59,3,10,
        5,0,59,1,1,0,0,0,60,61,5,26,0,0,61,62,5,1,0,0,62,63,3,4,2,0,63,64,
        5,2,0,0,64,85,5,3,0,0,65,67,5,22,0,0,66,68,3,12,6,0,67,66,1,0,0,
        0,67,68,1,0,0,0,68,70,1,0,0,0,69,71,3,16,8,0,70,69,1,0,0,0,71,72,
        1,0,0,0,72,70,1,0,0,0,72,73,1,0,0,0,73,74,1,0,0,0,74,75,3,8,4,0,
        75,86,1,0,0,0,76,78,5,4,0,0,77,79,3,12,6,0,78,77,1,0,0,0,78,79,1,
        0,0,0,79,81,1,0,0,0,80,82,3,16,8,0,81,80,1,0,0,0,82,83,1,0,0,0,83,
        81,1,0,0,0,83,84,1,0,0,0,84,86,1,0,0,0,85,65,1,0,0,0,85,76,1,0,0,
        0,86,87,1,0,0,0,87,88,5,5,0,0,88,3,1,0,0,0,89,94,3,6,3,0,90,91,5,
        6,0,0,91,93,3,6,3,0,92,90,1,0,0,0,93,96,1,0,0,0,94,92,1,0,0,0,94,
        95,1,0,0,0,95,98,1,0,0,0,96,94,1,0,0,0,97,89,1,0,0,0,97,98,1,0,0,
        0,98,5,1,0,0,0,99,100,5,22,0,0,100,101,5,26,0,0,101,7,1,0,0,0,102,
        105,5,7,0,0,103,106,3,48,24,0,104,106,3,44,22,0,105,103,1,0,0,0,
        105,104,1,0,0,0,106,107,1,0,0,0,107,108,5,8,0,0,108,9,1,0,0,0,109,
        110,5,9,0,0,110,112,5,3,0,0,111,113,3,12,6,0,112,111,1,0,0,0,112,
        113,1,0,0,0,113,117,1,0,0,0,114,116,3,16,8,0,115,114,1,0,0,0,116,
        119,1,0,0,0,117,115,1,0,0,0,117,118,1,0,0,0,118,120,1,0,0,0,119,
        117,1,0,0,0,120,121,5,5,0,0,121,11,1,0,0,0,122,123,5,10,0,0,123,
        125,5,3,0,0,124,126,3,14,7,0,125,124,1,0,0,0,126,127,1,0,0,0,127,
        125,1,0,0,0,127,128,1,0,0,0,128,13,1,0,0,0,129,130,5,11,0,0,130,
        131,5,26,0,0,131,132,5,12,0,0,132,150,3,48,24,0,133,138,5,26,0,0,
        134,135,5,6,0,0,135,137,5,26,0,0,136,134,1,0,0,0,137,140,1,0,0,0,
        138,136,1,0,0,0,138,139,1,0,0,0,139,141,1,0,0,0,140,138,1,0,0,0,
        141,142,5,3,0,0,142,150,5,22,0,0,143,144,5,26,0,0,144,145,5,12,0,
        0,145,146,3,48,24,0,146,147,5,3,0,0,147,148,5,22,0,0,148,150,1,0,
        0,0,149,129,1,0,0,0,149,133,1,0,0,0,149,143,1,0,0,0,150,151,1,0,
        0,0,151,152,5,8,0,0,152,15,1,0,0,0,153,155,3,32,16,0,154,153,1,0,
        0,0,155,156,1,0,0,0,156,154,1,0,0,0,156,157,1,0,0,0,157,169,1,0,
        0,0,158,169,3,34,17,0,159,165,3,38,19,0,160,165,3,36,18,0,161,165,
        3,18,9,0,162,165,3,40,20,0,163,165,3,20,10,0,164,159,1,0,0,0,164,
        160,1,0,0,0,164,161,1,0,0,0,164,162,1,0,0,0,164,163,1,0,0,0,165,
        166,1,0,0,0,166,167,5,8,0,0,167,169,1,0,0,0,168,154,1,0,0,0,168,
        158,1,0,0,0,168,164,1,0,0,0,169,17,1,0,0,0,170,171,5,26,0,0,171,
        174,5,12,0,0,172,175,3,22,11,0,173,175,3,48,24,0,174,172,1,0,0,0,
        174,173,1,0,0,0,175,19,1,0,0,0,176,177,5,13,0,0,177,21,1,0,0,0,178,
        179,3,26,13,0,179,180,3,24,12,0,180,23,1,0,0,0,181,182,5,31,0,0,
        182,183,3,26,13,0,183,184,3,24,12,0,184,191,1,0,0,0,185,186,5,32,
        0,0,186,187,3,26,13,0,187,188,3,24,12,0,188,191,1,0,0,0,189,191,
        1,0,0,0,190,181,1,0,0,0,190,185,1,0,0,0,190,189,1,0,0,0,191,25,1,
        0,0,0,192,193,3,30,15,0,193,194,3,28,14,0,194,27,1,0,0,0,195,196,
        5,29,0,0,196,197,3,30,15,0,197,198,3,28,14,0,198,205,1,0,0,0,199,
        200,5,30,0,0,200,201,3,30,15,0,201,202,3,28,14,0,202,205,1,0,0,0,
        203,205,1,0,0,0,204,195,1,0,0,0,204,199,1,0,0,0,204,203,1,0,0,0,
        205,29,1,0,0,0,206,207,7,0,0,0,207,217,3,30,15,0,208,211,5,26,0,
        0,209,211,3,50,25,0,210,208,1,0,0,0,210,209,1,0,0,0,211,217,1,0,
        0,0,212,213,5,1,0,0,213,214,3,22,11,0,214,215,5,2,0,0,215,217,1,
        0,0,0,216,206,1,0,0,0,216,210,1,0,0,0,216,212,1,0,0,0,217,31,1,0,
        0,0,218,219,5,14,0,0,219,220,5,1,0,0,220,221,3,44,22,0,221,222,5,
        2,0,0,222,224,5,3,0,0,223,225,3,16,8,0,224,223,1,0,0,0,225,226,1,
        0,0,0,226,224,1,0,0,0,226,227,1,0,0,0,227,235,1,0,0,0,228,229,5,
        15,0,0,229,231,5,3,0,0,230,232,3,16,8,0,231,230,1,0,0,0,232,233,
        1,0,0,0,233,231,1,0,0,0,233,234,1,0,0,0,234,236,1,0,0,0,235,228,
        1,0,0,0,235,236,1,0,0,0,236,237,1,0,0,0,237,238,5,5,0,0,238,33,1,
        0,0,0,239,240,5,16,0,0,240,241,5,1,0,0,241,242,3,44,22,0,242,243,
        5,2,0,0,243,253,5,3,0,0,244,246,3,16,8,0,245,244,1,0,0,0,246,249,
        1,0,0,0,247,245,1,0,0,0,247,248,1,0,0,0,248,254,1,0,0,0,249,247,
        1,0,0,0,250,252,5,13,0,0,251,250,1,0,0,0,251,252,1,0,0,0,252,254,
        1,0,0,0,253,247,1,0,0,0,253,251,1,0,0,0,254,255,1,0,0,0,255,256,
        5,5,0,0,256,35,1,0,0,0,257,258,5,17,0,0,258,259,5,1,0,0,259,264,
        5,26,0,0,260,261,5,6,0,0,261,263,5,26,0,0,262,260,1,0,0,0,263,266,
        1,0,0,0,264,262,1,0,0,0,264,265,1,0,0,0,265,267,1,0,0,0,266,264,
        1,0,0,0,267,268,5,2,0,0,268,37,1,0,0,0,269,270,5,18,0,0,270,271,
        5,1,0,0,271,272,3,42,21,0,272,273,5,2,0,0,273,39,1,0,0,0,274,275,
        5,26,0,0,275,276,5,1,0,0,276,277,3,42,21,0,277,278,5,2,0,0,278,41,
        1,0,0,0,279,283,3,44,22,0,280,283,3,48,24,0,281,283,3,40,20,0,282,
        279,1,0,0,0,282,280,1,0,0,0,282,281,1,0,0,0,283,292,1,0,0,0,284,
        288,5,6,0,0,285,289,3,44,22,0,286,289,3,48,24,0,287,289,3,40,20,
        0,288,285,1,0,0,0,288,286,1,0,0,0,288,287,1,0,0,0,289,291,1,0,0,
        0,290,284,1,0,0,0,291,294,1,0,0,0,292,290,1,0,0,0,292,293,1,0,0,
        0,293,296,1,0,0,0,294,292,1,0,0,0,295,282,1,0,0,0,295,296,1,0,0,
        0,296,43,1,0,0,0,297,298,5,1,0,0,298,299,3,44,22,0,299,300,5,2,0,
        0,300,301,3,46,23,0,301,313,1,0,0,0,302,303,5,19,0,0,303,304,3,44,
        22,0,304,305,3,46,23,0,305,313,1,0,0,0,306,307,3,48,24,0,307,308,
        3,46,23,0,308,313,1,0,0,0,309,310,3,22,11,0,310,311,3,46,23,0,311,
        313,1,0,0,0,312,297,1,0,0,0,312,302,1,0,0,0,312,306,1,0,0,0,312,
        309,1,0,0,0,313,45,1,0,0,0,314,315,5,33,0,0,315,316,3,44,22,0,316,
        317,3,46,23,0,317,320,1,0,0,0,318,320,1,0,0,0,319,314,1,0,0,0,319,
        318,1,0,0,0,320,47,1,0,0,0,321,327,3,50,25,0,322,327,5,20,0,0,323,
        327,5,21,0,0,324,327,5,23,0,0,325,327,5,26,0,0,326,321,1,0,0,0,326,
        322,1,0,0,0,326,323,1,0,0,0,326,324,1,0,0,0,326,325,1,0,0,0,327,
        49,1,0,0,0,328,329,7,1,0,0,329,51,1,0,0,0,36,55,67,72,78,83,85,94,
        97,105,112,117,127,138,149,156,164,168,174,190,204,210,216,226,233,
        235,247,251,253,264,282,288,292,295,312,319,326
    ]

class jauanParser ( Parser ):

    grammarFileName = "jauan.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'('", "')'", "':'", "'void'", "'end'", 
                     "','", "'return'", "';'", "'main'", "'var'", "'const'", 
                     "'='", "'break'", "'if'", "'else'", "'while'", "'scanf'", 
                     "'print'", "'!'", "'true'", "'false'", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "'*'", "'/'", "'+'", "'-'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "TIPO", "STRING", "INT", 
                      "FLOAT", "ID", "LETRA", "DIGITO", "MUL", "DIV", "ADD", 
                      "SUB", "OPERADOR", "WS" ]

    RULE_prog = 0
    RULE_declar_funcao = 1
    RULE_args_formal = 2
    RULE_parametro = 3
    RULE_retorno = 4
    RULE_main = 5
    RULE_var = 6
    RULE_declaracao = 7
    RULE_comando = 8
    RULE_comando_atribuicao = 9
    RULE_break = 10
    RULE_op_algebrico = 11
    RULE_e1 = 12
    RULE_t = 13
    RULE_t1 = 14
    RULE_g = 15
    RULE_ifElse = 16
    RULE_while = 17
    RULE_scanf = 18
    RULE_print = 19
    RULE_inst_funcao = 20
    RULE_args_real = 21
    RULE_expr = 22
    RULE_expr1 = 23
    RULE_value = 24
    RULE_num = 25

    ruleNames =  [ "prog", "declar_funcao", "args_formal", "parametro", 
                   "retorno", "main", "var", "declaracao", "comando", "comando_atribuicao", 
                   "break", "op_algebrico", "e1", "t", "t1", "g", "ifElse", 
                   "while", "scanf", "print", "inst_funcao", "args_real", 
                   "expr", "expr1", "value", "num" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    T__18=19
    T__19=20
    T__20=21
    TIPO=22
    STRING=23
    INT=24
    FLOAT=25
    ID=26
    LETRA=27
    DIGITO=28
    MUL=29
    DIV=30
    ADD=31
    SUB=32
    OPERADOR=33
    WS=34

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


        def declar_funcao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jauanParser.Declar_funcaoContext)
            else:
                return self.getTypedRuleContext(jauanParser.Declar_funcaoContext,i)


        def getRuleIndex(self):
            return jauanParser.RULE_prog

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProg" ):
                listener.enterProg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProg" ):
                listener.exitProg(self)




    def prog(self):

        localctx = jauanParser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_prog)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 55
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==26:
                self.state = 52
                self.declar_funcao()
                self.state = 57
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 58
            self.main()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Declar_funcaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(jauanParser.ID, 0)

        def args_formal(self):
            return self.getTypedRuleContext(jauanParser.Args_formalContext,0)


        def TIPO(self):
            return self.getToken(jauanParser.TIPO, 0)

        def retorno(self):
            return self.getTypedRuleContext(jauanParser.RetornoContext,0)


        def var(self):
            return self.getTypedRuleContext(jauanParser.VarContext,0)


        def comando(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jauanParser.ComandoContext)
            else:
                return self.getTypedRuleContext(jauanParser.ComandoContext,i)


        def getRuleIndex(self):
            return jauanParser.RULE_declar_funcao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDeclar_funcao" ):
                listener.enterDeclar_funcao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDeclar_funcao" ):
                listener.exitDeclar_funcao(self)




    def declar_funcao(self):

        localctx = jauanParser.Declar_funcaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_declar_funcao)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 60
            self.match(jauanParser.ID)
            self.state = 61
            self.match(jauanParser.T__0)
            self.state = 62
            self.args_formal()
            self.state = 63
            self.match(jauanParser.T__1)
            self.state = 64
            self.match(jauanParser.T__2)
            self.state = 85
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [22]:
                self.state = 65
                self.match(jauanParser.TIPO)
                self.state = 67
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==10:
                    self.state = 66
                    self.var()


                self.state = 70 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 69
                    self.comando()
                    self.state = 72 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 67592192) != 0)):
                        break

                self.state = 74
                self.retorno()
                pass
            elif token in [4]:
                self.state = 76
                self.match(jauanParser.T__3)
                self.state = 78
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==10:
                    self.state = 77
                    self.var()


                self.state = 81 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 80
                    self.comando()
                    self.state = 83 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 67592192) != 0)):
                        break

                pass
            else:
                raise NoViableAltException(self)

            self.state = 87
            self.match(jauanParser.T__4)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Args_formalContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def parametro(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jauanParser.ParametroContext)
            else:
                return self.getTypedRuleContext(jauanParser.ParametroContext,i)


        def getRuleIndex(self):
            return jauanParser.RULE_args_formal

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArgs_formal" ):
                listener.enterArgs_formal(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArgs_formal" ):
                listener.exitArgs_formal(self)




    def args_formal(self):

        localctx = jauanParser.Args_formalContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_args_formal)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 97
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==22:
                self.state = 89
                self.parametro()
                self.state = 94
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==6:
                    self.state = 90
                    self.match(jauanParser.T__5)
                    self.state = 91
                    self.parametro()
                    self.state = 96
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametroContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TIPO(self):
            return self.getToken(jauanParser.TIPO, 0)

        def ID(self):
            return self.getToken(jauanParser.ID, 0)

        def getRuleIndex(self):
            return jauanParser.RULE_parametro

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParametro" ):
                listener.enterParametro(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParametro" ):
                listener.exitParametro(self)




    def parametro(self):

        localctx = jauanParser.ParametroContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_parametro)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 99
            self.match(jauanParser.TIPO)
            self.state = 100
            self.match(jauanParser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RetornoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def value(self):
            return self.getTypedRuleContext(jauanParser.ValueContext,0)


        def expr(self):
            return self.getTypedRuleContext(jauanParser.ExprContext,0)


        def getRuleIndex(self):
            return jauanParser.RULE_retorno

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRetorno" ):
                listener.enterRetorno(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRetorno" ):
                listener.exitRetorno(self)




    def retorno(self):

        localctx = jauanParser.RetornoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_retorno)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 102
            self.match(jauanParser.T__6)
            self.state = 105
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,8,self._ctx)
            if la_ == 1:
                self.state = 103
                self.value()
                pass

            elif la_ == 2:
                self.state = 104
                self.expr()
                pass


            self.state = 107
            self.match(jauanParser.T__7)
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


        def comando(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jauanParser.ComandoContext)
            else:
                return self.getTypedRuleContext(jauanParser.ComandoContext,i)


        def getRuleIndex(self):
            return jauanParser.RULE_main

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMain" ):
                listener.enterMain(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMain" ):
                listener.exitMain(self)




    def main(self):

        localctx = jauanParser.MainContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_main)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 109
            self.match(jauanParser.T__8)
            self.state = 110
            self.match(jauanParser.T__2)
            self.state = 112
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==10:
                self.state = 111
                self.var()


            self.state = 117
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 67592192) != 0):
                self.state = 114
                self.comando()
                self.state = 119
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 120
            self.match(jauanParser.T__4)
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

        def declaracao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jauanParser.DeclaracaoContext)
            else:
                return self.getTypedRuleContext(jauanParser.DeclaracaoContext,i)


        def getRuleIndex(self):
            return jauanParser.RULE_var

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVar" ):
                listener.enterVar(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVar" ):
                listener.exitVar(self)




    def var(self):

        localctx = jauanParser.VarContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_var)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 122
            self.match(jauanParser.T__9)
            self.state = 123
            self.match(jauanParser.T__2)
            self.state = 125 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 124
                    self.declaracao()

                else:
                    raise NoViableAltException(self)
                self.state = 127 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,11,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeclaracaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(jauanParser.ID)
            else:
                return self.getToken(jauanParser.ID, i)

        def value(self):
            return self.getTypedRuleContext(jauanParser.ValueContext,0)


        def TIPO(self):
            return self.getToken(jauanParser.TIPO, 0)

        def getRuleIndex(self):
            return jauanParser.RULE_declaracao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDeclaracao" ):
                listener.enterDeclaracao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDeclaracao" ):
                listener.exitDeclaracao(self)




    def declaracao(self):

        localctx = jauanParser.DeclaracaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_declaracao)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 149
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,13,self._ctx)
            if la_ == 1:
                self.state = 129
                self.match(jauanParser.T__10)
                self.state = 130
                self.match(jauanParser.ID)
                self.state = 131
                self.match(jauanParser.T__11)
                self.state = 132
                self.value()
                pass

            elif la_ == 2:
                self.state = 133
                self.match(jauanParser.ID)
                self.state = 138
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==6:
                    self.state = 134
                    self.match(jauanParser.T__5)
                    self.state = 135
                    self.match(jauanParser.ID)
                    self.state = 140
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 141
                self.match(jauanParser.T__2)
                self.state = 142
                self.match(jauanParser.TIPO)
                pass

            elif la_ == 3:
                self.state = 143
                self.match(jauanParser.ID)
                self.state = 144
                self.match(jauanParser.T__11)
                self.state = 145
                self.value()
                self.state = 146
                self.match(jauanParser.T__2)
                self.state = 147
                self.match(jauanParser.TIPO)
                pass


            self.state = 151
            self.match(jauanParser.T__7)
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

        def ifElse(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jauanParser.IfElseContext)
            else:
                return self.getTypedRuleContext(jauanParser.IfElseContext,i)


        def while_(self):
            return self.getTypedRuleContext(jauanParser.WhileContext,0)


        def print_(self):
            return self.getTypedRuleContext(jauanParser.PrintContext,0)


        def scanf(self):
            return self.getTypedRuleContext(jauanParser.ScanfContext,0)


        def comando_atribuicao(self):
            return self.getTypedRuleContext(jauanParser.Comando_atribuicaoContext,0)


        def inst_funcao(self):
            return self.getTypedRuleContext(jauanParser.Inst_funcaoContext,0)


        def break_(self):
            return self.getTypedRuleContext(jauanParser.BreakContext,0)


        def getRuleIndex(self):
            return jauanParser.RULE_comando

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComando" ):
                listener.enterComando(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComando" ):
                listener.exitComando(self)




    def comando(self):

        localctx = jauanParser.ComandoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_comando)
        try:
            self.state = 168
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [14]:
                self.enterOuterAlt(localctx, 1)
                self.state = 154 
                self._errHandler.sync(self)
                _alt = 1
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt == 1:
                        self.state = 153
                        self.ifElse()

                    else:
                        raise NoViableAltException(self)
                    self.state = 156 
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,14,self._ctx)

                pass
            elif token in [16]:
                self.enterOuterAlt(localctx, 2)
                self.state = 158
                self.while_()
                pass
            elif token in [13, 17, 18, 26]:
                self.enterOuterAlt(localctx, 3)
                self.state = 164
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,15,self._ctx)
                if la_ == 1:
                    self.state = 159
                    self.print_()
                    pass

                elif la_ == 2:
                    self.state = 160
                    self.scanf()
                    pass

                elif la_ == 3:
                    self.state = 161
                    self.comando_atribuicao()
                    pass

                elif la_ == 4:
                    self.state = 162
                    self.inst_funcao()
                    pass

                elif la_ == 5:
                    self.state = 163
                    self.break_()
                    pass


                self.state = 166
                self.match(jauanParser.T__7)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Comando_atribuicaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(jauanParser.ID, 0)

        def op_algebrico(self):
            return self.getTypedRuleContext(jauanParser.Op_algebricoContext,0)


        def value(self):
            return self.getTypedRuleContext(jauanParser.ValueContext,0)


        def getRuleIndex(self):
            return jauanParser.RULE_comando_atribuicao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComando_atribuicao" ):
                listener.enterComando_atribuicao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComando_atribuicao" ):
                listener.exitComando_atribuicao(self)




    def comando_atribuicao(self):

        localctx = jauanParser.Comando_atribuicaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_comando_atribuicao)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 170
            self.match(jauanParser.ID)
            self.state = 171
            self.match(jauanParser.T__11)
            self.state = 174
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,17,self._ctx)
            if la_ == 1:
                self.state = 172
                self.op_algebrico()
                pass

            elif la_ == 2:
                self.state = 173
                self.value()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BreakContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return jauanParser.RULE_break

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBreak" ):
                listener.enterBreak(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBreak" ):
                listener.exitBreak(self)




    def break_(self):

        localctx = jauanParser.BreakContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_break)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 176
            self.match(jauanParser.T__12)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Op_algebricoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def t(self):
            return self.getTypedRuleContext(jauanParser.TContext,0)


        def e1(self):
            return self.getTypedRuleContext(jauanParser.E1Context,0)


        def getRuleIndex(self):
            return jauanParser.RULE_op_algebrico

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOp_algebrico" ):
                listener.enterOp_algebrico(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOp_algebrico" ):
                listener.exitOp_algebrico(self)




    def op_algebrico(self):

        localctx = jauanParser.Op_algebricoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_op_algebrico)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 178
            self.t()
            self.state = 179
            self.e1()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class E1Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ADD(self):
            return self.getToken(jauanParser.ADD, 0)

        def t(self):
            return self.getTypedRuleContext(jauanParser.TContext,0)


        def e1(self):
            return self.getTypedRuleContext(jauanParser.E1Context,0)


        def SUB(self):
            return self.getToken(jauanParser.SUB, 0)

        def getRuleIndex(self):
            return jauanParser.RULE_e1

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterE1" ):
                listener.enterE1(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitE1" ):
                listener.exitE1(self)




    def e1(self):

        localctx = jauanParser.E1Context(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_e1)
        try:
            self.state = 190
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [31]:
                self.enterOuterAlt(localctx, 1)
                self.state = 181
                self.match(jauanParser.ADD)
                self.state = 182
                self.t()
                self.state = 183
                self.e1()
                pass
            elif token in [32]:
                self.enterOuterAlt(localctx, 2)
                self.state = 185
                self.match(jauanParser.SUB)
                self.state = 186
                self.t()
                self.state = 187
                self.e1()
                pass
            elif token in [2, 6, 8, 33]:
                self.enterOuterAlt(localctx, 3)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def g(self):
            return self.getTypedRuleContext(jauanParser.GContext,0)


        def t1(self):
            return self.getTypedRuleContext(jauanParser.T1Context,0)


        def getRuleIndex(self):
            return jauanParser.RULE_t

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterT" ):
                listener.enterT(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitT" ):
                listener.exitT(self)




    def t(self):

        localctx = jauanParser.TContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_t)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 192
            self.g()
            self.state = 193
            self.t1()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class T1Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def MUL(self):
            return self.getToken(jauanParser.MUL, 0)

        def g(self):
            return self.getTypedRuleContext(jauanParser.GContext,0)


        def t1(self):
            return self.getTypedRuleContext(jauanParser.T1Context,0)


        def DIV(self):
            return self.getToken(jauanParser.DIV, 0)

        def getRuleIndex(self):
            return jauanParser.RULE_t1

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterT1" ):
                listener.enterT1(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitT1" ):
                listener.exitT1(self)




    def t1(self):

        localctx = jauanParser.T1Context(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_t1)
        try:
            self.state = 204
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [29]:
                self.enterOuterAlt(localctx, 1)
                self.state = 195
                self.match(jauanParser.MUL)
                self.state = 196
                self.g()
                self.state = 197
                self.t1()
                pass
            elif token in [30]:
                self.enterOuterAlt(localctx, 2)
                self.state = 199
                self.match(jauanParser.DIV)
                self.state = 200
                self.g()
                self.state = 201
                self.t1()
                pass
            elif token in [2, 6, 8, 31, 32, 33]:
                self.enterOuterAlt(localctx, 3)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class GContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def g(self):
            return self.getTypedRuleContext(jauanParser.GContext,0)


        def ADD(self):
            return self.getToken(jauanParser.ADD, 0)

        def SUB(self):
            return self.getToken(jauanParser.SUB, 0)

        def ID(self):
            return self.getToken(jauanParser.ID, 0)

        def num(self):
            return self.getTypedRuleContext(jauanParser.NumContext,0)


        def op_algebrico(self):
            return self.getTypedRuleContext(jauanParser.Op_algebricoContext,0)


        def getRuleIndex(self):
            return jauanParser.RULE_g

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterG" ):
                listener.enterG(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitG" ):
                listener.exitG(self)




    def g(self):

        localctx = jauanParser.GContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_g)
        self._la = 0 # Token type
        try:
            self.state = 216
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [31, 32]:
                self.enterOuterAlt(localctx, 1)
                self.state = 206
                _la = self._input.LA(1)
                if not(_la==31 or _la==32):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 207
                self.g()
                pass
            elif token in [24, 25, 26]:
                self.enterOuterAlt(localctx, 2)
                self.state = 210
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [26]:
                    self.state = 208
                    self.match(jauanParser.ID)
                    pass
                elif token in [24, 25]:
                    self.state = 209
                    self.num()
                    pass
                else:
                    raise NoViableAltException(self)

                pass
            elif token in [1]:
                self.enterOuterAlt(localctx, 3)
                self.state = 212
                self.match(jauanParser.T__0)
                self.state = 213
                self.op_algebrico()
                self.state = 214
                self.match(jauanParser.T__1)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IfElseContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(jauanParser.ExprContext,0)


        def comando(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jauanParser.ComandoContext)
            else:
                return self.getTypedRuleContext(jauanParser.ComandoContext,i)


        def getRuleIndex(self):
            return jauanParser.RULE_ifElse

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIfElse" ):
                listener.enterIfElse(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIfElse" ):
                listener.exitIfElse(self)




    def ifElse(self):

        localctx = jauanParser.IfElseContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_ifElse)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 218
            self.match(jauanParser.T__13)
            self.state = 219
            self.match(jauanParser.T__0)
            self.state = 220
            self.expr()
            self.state = 221
            self.match(jauanParser.T__1)
            self.state = 222
            self.match(jauanParser.T__2)
            self.state = 224 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 223
                self.comando()
                self.state = 226 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 67592192) != 0)):
                    break

            self.state = 235
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==15:
                self.state = 228
                self.match(jauanParser.T__14)
                self.state = 229
                self.match(jauanParser.T__2)
                self.state = 231 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 230
                    self.comando()
                    self.state = 233 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 67592192) != 0)):
                        break



            self.state = 237
            self.match(jauanParser.T__4)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class WhileContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(jauanParser.ExprContext,0)


        def comando(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jauanParser.ComandoContext)
            else:
                return self.getTypedRuleContext(jauanParser.ComandoContext,i)


        def getRuleIndex(self):
            return jauanParser.RULE_while

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhile" ):
                listener.enterWhile(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhile" ):
                listener.exitWhile(self)




    def while_(self):

        localctx = jauanParser.WhileContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_while)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 239
            self.match(jauanParser.T__15)
            self.state = 240
            self.match(jauanParser.T__0)
            self.state = 241
            self.expr()
            self.state = 242
            self.match(jauanParser.T__1)
            self.state = 243
            self.match(jauanParser.T__2)
            self.state = 253
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,27,self._ctx)
            if la_ == 1:
                self.state = 247
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 67592192) != 0):
                    self.state = 244
                    self.comando()
                    self.state = 249
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass

            elif la_ == 2:
                self.state = 251
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==13:
                    self.state = 250
                    self.match(jauanParser.T__12)


                pass


            self.state = 255
            self.match(jauanParser.T__4)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ScanfContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(jauanParser.ID)
            else:
                return self.getToken(jauanParser.ID, i)

        def getRuleIndex(self):
            return jauanParser.RULE_scanf

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterScanf" ):
                listener.enterScanf(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitScanf" ):
                listener.exitScanf(self)




    def scanf(self):

        localctx = jauanParser.ScanfContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_scanf)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 257
            self.match(jauanParser.T__16)
            self.state = 258
            self.match(jauanParser.T__0)

            self.state = 259
            self.match(jauanParser.ID)
            self.state = 264
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==6:
                self.state = 260
                self.match(jauanParser.T__5)
                self.state = 261
                self.match(jauanParser.ID)
                self.state = 266
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 267
            self.match(jauanParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PrintContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def args_real(self):
            return self.getTypedRuleContext(jauanParser.Args_realContext,0)


        def getRuleIndex(self):
            return jauanParser.RULE_print

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrint" ):
                listener.enterPrint(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrint" ):
                listener.exitPrint(self)




    def print_(self):

        localctx = jauanParser.PrintContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_print)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 269
            self.match(jauanParser.T__17)
            self.state = 270
            self.match(jauanParser.T__0)

            self.state = 271
            self.args_real()
            self.state = 272
            self.match(jauanParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Inst_funcaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(jauanParser.ID, 0)

        def args_real(self):
            return self.getTypedRuleContext(jauanParser.Args_realContext,0)


        def getRuleIndex(self):
            return jauanParser.RULE_inst_funcao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInst_funcao" ):
                listener.enterInst_funcao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInst_funcao" ):
                listener.exitInst_funcao(self)




    def inst_funcao(self):

        localctx = jauanParser.Inst_funcaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_inst_funcao)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 274
            self.match(jauanParser.ID)
            self.state = 275
            self.match(jauanParser.T__0)
            self.state = 276
            self.args_real()
            self.state = 277
            self.match(jauanParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Args_realContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jauanParser.ExprContext)
            else:
                return self.getTypedRuleContext(jauanParser.ExprContext,i)


        def value(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jauanParser.ValueContext)
            else:
                return self.getTypedRuleContext(jauanParser.ValueContext,i)


        def inst_funcao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(jauanParser.Inst_funcaoContext)
            else:
                return self.getTypedRuleContext(jauanParser.Inst_funcaoContext,i)


        def getRuleIndex(self):
            return jauanParser.RULE_args_real

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArgs_real" ):
                listener.enterArgs_real(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArgs_real" ):
                listener.exitArgs_real(self)




    def args_real(self):

        localctx = jauanParser.Args_realContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_args_real)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 295
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 6571950082) != 0):
                self.state = 282
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,29,self._ctx)
                if la_ == 1:
                    self.state = 279
                    self.expr()
                    pass

                elif la_ == 2:
                    self.state = 280
                    self.value()
                    pass

                elif la_ == 3:
                    self.state = 281
                    self.inst_funcao()
                    pass


                self.state = 292
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==6:
                    self.state = 284
                    self.match(jauanParser.T__5)
                    self.state = 288
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,30,self._ctx)
                    if la_ == 1:
                        self.state = 285
                        self.expr()
                        pass

                    elif la_ == 2:
                        self.state = 286
                        self.value()
                        pass

                    elif la_ == 3:
                        self.state = 287
                        self.inst_funcao()
                        pass


                    self.state = 294
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(jauanParser.ExprContext,0)


        def expr1(self):
            return self.getTypedRuleContext(jauanParser.Expr1Context,0)


        def value(self):
            return self.getTypedRuleContext(jauanParser.ValueContext,0)


        def op_algebrico(self):
            return self.getTypedRuleContext(jauanParser.Op_algebricoContext,0)


        def getRuleIndex(self):
            return jauanParser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)




    def expr(self):

        localctx = jauanParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_expr)
        try:
            self.state = 312
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,33,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 297
                self.match(jauanParser.T__0)
                self.state = 298
                self.expr()
                self.state = 299
                self.match(jauanParser.T__1)
                self.state = 300
                self.expr1()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 302
                self.match(jauanParser.T__18)
                self.state = 303
                self.expr()
                self.state = 304
                self.expr1()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 306
                self.value()
                self.state = 307
                self.expr1()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 309
                self.op_algebrico()
                self.state = 310
                self.expr1()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Expr1Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OPERADOR(self):
            return self.getToken(jauanParser.OPERADOR, 0)

        def expr(self):
            return self.getTypedRuleContext(jauanParser.ExprContext,0)


        def expr1(self):
            return self.getTypedRuleContext(jauanParser.Expr1Context,0)


        def getRuleIndex(self):
            return jauanParser.RULE_expr1

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr1" ):
                listener.enterExpr1(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr1" ):
                listener.exitExpr1(self)




    def expr1(self):

        localctx = jauanParser.Expr1Context(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_expr1)
        try:
            self.state = 319
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,34,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 314
                self.match(jauanParser.OPERADOR)
                self.state = 315
                self.expr()
                self.state = 316
                self.expr1()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)

                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ValueContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def num(self):
            return self.getTypedRuleContext(jauanParser.NumContext,0)


        def STRING(self):
            return self.getToken(jauanParser.STRING, 0)

        def ID(self):
            return self.getToken(jauanParser.ID, 0)

        def getRuleIndex(self):
            return jauanParser.RULE_value

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterValue" ):
                listener.enterValue(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitValue" ):
                listener.exitValue(self)




    def value(self):

        localctx = jauanParser.ValueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_value)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 326
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [24, 25]:
                self.state = 321
                self.num()
                pass
            elif token in [20]:
                self.state = 322
                self.match(jauanParser.T__19)
                pass
            elif token in [21]:
                self.state = 323
                self.match(jauanParser.T__20)
                pass
            elif token in [23]:
                self.state = 324
                self.match(jauanParser.STRING)
                pass
            elif token in [26]:
                self.state = 325
                self.match(jauanParser.ID)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NumContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self):
            return self.getToken(jauanParser.INT, 0)

        def FLOAT(self):
            return self.getToken(jauanParser.FLOAT, 0)

        def getRuleIndex(self):
            return jauanParser.RULE_num

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNum" ):
                listener.enterNum(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNum" ):
                listener.exitNum(self)




    def num(self):

        localctx = jauanParser.NumContext(self, self._ctx, self.state)
        self.enterRule(localctx, 50, self.RULE_num)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 328
            _la = self._input.LA(1)
            if not(_la==24 or _la==25):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





