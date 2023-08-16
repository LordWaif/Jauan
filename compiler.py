from antlr4 import InputStream, CommonTokenStream, ParseTreeWalker
from gen.jauanLexer import jauanLexer
from gen.jauanParser import jauanParser
from gen.MyListener import MyListener
from jasmin import execute,compile
from argparse import ArgumentParser
from antlr4.error.ErrorListener import ErrorListener

class MyLexerErrorListener(ErrorListener):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        raise Exception(f"Erro lexico: linha {line}:{column} {msg}")


def executaCompilacao(expressao):
    input_stream = InputStream(expressao)
    lexer = jauanLexer(input_stream)
        
    tokens = CommonTokenStream(lexer)
    parser = jauanParser(tokens)

    parser.removeErrorListeners()
    parser.addErrorListener(MyLexerErrorListener())

    tree = parser.prog()
    walker = ParseTreeWalker()
    l = MyListener()
    walker.walk(l, tree)
    compile('programaJasmin')
    execute('programaJasmin')


if __name__ == '__main__':
    with open('input.txt', 'r') as f:
        expressao = f.read()
    executaCompilacao(expressao)
