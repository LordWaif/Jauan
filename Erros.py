class ErroDeSintaxe(Exception):
    def __init__(self, msg):
        mensagem = '{}'.format(msg)
        super().__init__(mensagem)