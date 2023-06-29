from django.http import HttpResponse
from django.template import loader
import subprocess
from django.views.decorators.csrf import csrf_exempt


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
        with open("input.txt", "w") as f:
            f.write(content)
        return HttpResponse(content)
    return HttpResponse("Erro: método não permitido.")