class ErroVariavelNaoDeclarada(Exception):
    def __init__(self, line, id):
        mensagem = 'Linha {}: ID não foi declarado: {}'.format(line, id)
        super().__init__(mensagem)