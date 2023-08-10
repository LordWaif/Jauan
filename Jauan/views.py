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
    context["saidaLog"] = dados
    template = loader.get_template("Jauan/index.html")
    return HttpResponse(template.render(context, request))


@csrf_exempt
def minha_view(request):
    # context = {}
    # if request.method == 'POST':
    #     uploaded_file = request.POST['file']
    #     print('ff\n\n', uploaded_file)
    #     file = uploaded_file.read().decode('utf-8')
    #     with open("input.txt", "w") as f:
    #         f.write(file)
    #     context['conteudo'] = file
    return 0

@csrf_exempt
def save_text_file(request):
    if request.method == "POST":
        content = request.POST.get("content")
        with open("input.jauan", "w") as f:
            f.write(content)
            chamaJasmin()
        return HttpResponse(content)
    return HttpResponse("Erro: método não permitido.")

def chamaJasmin():
    args = ArgumentParser()
    args.add_argument('-f', '--file', help='File to compile', default='input.jauan')
    args = args.parse_args(['-f', 'input.jauan'])  # Fornecendo argumentos simulados
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