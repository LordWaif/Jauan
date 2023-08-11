from django.http import HttpResponse
from django.template import loader
import subprocess
from django.views.decorators.csrf import csrf_exempt
from antlr4 import *

from gen.jauanLexer import jauanLexer
from gen.jauanParser import jauanParser
from gen.MyListener import MyListener
from jasmin import execute,compile

from argparse import ArgumentParser

@csrf_exempt
def index(request):
    context = {}
    dados = ""
    dados = chamaJasmin()
    context["saidaLog"] = dados
    template = loader.get_template("Jauan/index.html")
    return HttpResponse(template.render(context, request))


@csrf_exempt
def minha_view(request):
    return 0

@csrf_exempt
def save_text_file(request):
    if request.method == "POST":
        content = request.POST.get("content")
        with open("input.txt", "w") as f:
            f.write(content)
        dados = chamaJasmin()
        return HttpResponse(dados)
    return HttpResponse("Erro: método não permitido.")

def chamaJasmin():
    args = ArgumentParser()
    args.add_argument('-f', '--file', help='File to compile', default='input.txt')
    args = args.parse_args(['-f', 'input.txt'])
    data = FileStream(args.file, encoding='utf8')
    lexer = jauanLexer(data)
    tokens = CommonTokenStream(lexer)
    parser = jauanParser(tokens)
    tree = parser.prog()
    walker = ParseTreeWalker()
    l = MyListener()
    walker.walk(l, tree)
    compile('programaJasmin')
    execute('programaJasmin')