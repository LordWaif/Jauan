from antlr4 import *

from gen.jauanLexer import jauanLexer
from gen.jauanParser import jauanParser
from gen.MyListener import MyListener

if __name__ == '__main__':
    data = FileStream('input.txt', encoding='utf8')
    # data = InputStream(exp)

    # Lexer
    lexer = jauanLexer(data)
    tokens = CommonTokenStream(lexer)

    # Parser
    parser = jauanParser(tokens)
    tree = parser.prog()

    # Listener
    walker = ParseTreeWalker()
    l = MyListener()
    walker.walk(l, tree)
