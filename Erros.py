class Erro:
    def __init__(self):
        pass

    def erroTipagemAtribuicao(nomeVariavel: str, tipoVariavel, valorAtribuido, tipoValor, linha, coluna) -> Exception:
        return Exception("Erro na linha {}, coluna {}. A variável '{}' do tipo '{}' não é do mesmo tipo do valor atribuído '{}', que é do tipo '{}'.".format(linha, coluna, nomeVariavel, tipoVariavel, valorAtribuido, tipoValor))
    
    def erroTipagemVariavelEConstante(nomeVariavel: str, tipoEsperado, tipoRecebido, linha, coluna) -> Exception:
        return Exception("Erro na linha {}, coluna {}. '{}' é uma '{}', era esperado uma '{}'.".format(linha, coluna, nomeVariavel, tipoRecebido, tipoEsperado))
    
    def erroTiposIncompatíveis(nomePrimeiraVariavel, nomeSegundaVariavel, tipoPrimeiraVariavel, tipoSegundaVariavel, linha, coluna) -> Exception:
        return Exception("Erro na linha {}, coluna {}. '{}' é do tipo '{}' e '{}' é do tipo '{}', os tipos são incompatíveis.".format(linha, coluna, nomePrimeiraVariavel, tipoPrimeiraVariavel, nomeSegundaVariavel, tipoSegundaVariavel))
    
    def erroTipoOperando(nomeVariavel, tipoVariavel, linha, coluna) -> Exception:
        return Exception("Erro na linha {}, coluna {}. '{}' é do tipo '{}', era esperado um inteiro ou real.".format(linha, coluna, nomeVariavel, tipoVariavel))
    
    def erroBreakForaDeLoop(linha, coluna) -> Exception:
        return Exception("Erro na linha {}, coluna {}. comando 'break' fora de loop.".format(linha, coluna))

    def erroVariavelNaoDeclarada(nomeVariavel, linha, coluna) -> Exception:
        return Exception("Erro na linha {}, coluna {}. '{}' não foi declarada.".format(linha, coluna, nomeVariavel))    