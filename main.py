from antlr4 import *

from gen.jauanLexer import jauanLexer
from gen.jauanParser import jauanParser
from gen.MyListener import MyListener
from jasmin import execute,compile

from argparse import ArgumentParser
args = ArgumentParser()
args.add_argument('-f', '--file', help='File to compile',default='input.jauan')
args = args.parse_args()
if __name__ == '__main__':
    data = FileStream(args.file, encoding='utf8')
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

    compile('programaJasmin')
    execute('programaJasmin')
