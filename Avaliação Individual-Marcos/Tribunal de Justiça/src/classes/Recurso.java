package Avaliação Individual-Marcos.Tribunal de Justiça.src.classes;

public class Recurso:
    privado Processo processoOrigem
    privado Processo novoProcesso
    privado boolean aceito

    // Construtor e outros métodos...

    // Getter
    método Processo obterProcessoOrigem():
        retornar processoOrigem

    // Setter
    método void definirProcessoOrigem(Processo processoOrigem):
        this.processoOrigem = processoOrigem

    // Getter
    método Processo obterNovoProcesso():
        retornar novoProcesso

    // Setter
    método void definirNovoProcesso(Processo novoProcesso):
        this.novoProcesso = novoProcesso

    // Getter
    método boolean isAceito():
        retornar aceito

    // Setter
    método void definirAceito(boolean aceito):
        this.aceito = aceito
