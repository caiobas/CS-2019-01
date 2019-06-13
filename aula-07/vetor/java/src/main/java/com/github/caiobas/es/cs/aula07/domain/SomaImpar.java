package com.github.caiobas.es.cs.aula07.domain;

/**
 * Classe com o objetivo de retornar a soma de
 * números ímpares contidos em um vetor de inteiros.
 */
public final class SomaImpar {

    private SomaImpar() {

    }
    /**
     * Classe com o objetivo de retornar a soma de
     * números ímpares contidos em um vetor de inteiros.
     *
     * @param vetor Vetor que contém os inteiros.
     *
     * @return Retorna a soma dos números ímpares de um vetor.
     */
    public static int obterSomaImpar(final int[] vetor) {
        // FIXME verifique se não null, não vaziou ou faça a documentação correspondente.
        int somaImpares = 0;

        for (int contador = 0; contador < vetor.length; contador++) {
            if (vetor[contador] % 2 != 0) {
                somaImpares = somaImpares + vetor[contador];
            }
        }

        // TODO é preciso verificar o código abaixo
        return Arrays.stream(vetor).filter(v -> v % 2 != 0).sum();
        
        // return somaImpares;
    }

}
