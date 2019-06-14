package com.github.caiobas.es.cs.aula07.domain;

import java.util.Arrays;

/**
 * Classe com o objetivo de retornar a quantidade de elementos
 * do vetor recebido como primeiro argumento cujos valores são
 * iguais ao valor do segundo argumento fornecido.
 */
public final class ElementosIguaisUtils {

    private ElementosIguaisUtils() {

    }
    /**
     * Classe com o objetivo de retornar a quantidade de elementos
     * do vetor recebido como primeiro argumento cujos valores são
     * iguais ao valor do segundo argumento fornecido.
     *
     * @param vetor1 Vetor contendo elementos para conferir valores.
     * @param vetor2 Vetor contendo elementos para conferir valores.
     *
     * @return Retorna a quantidade de elementos iguais entre os vetores.
     */
    public static int obterElementosIguais(final int[] vetor1, final int[] vetor2) {
        final int[] vetor1Aux = vetor1;
        final int[] vetor2Aux = vetor2;

        Arrays.sort(vetor1Aux);
        Arrays.sort(vetor2Aux);

        int[] vetorFinal = new int[vetor1.length];
        int contadorFinal = 0;

        for (int contador = 0; contador < vetor1.length; contador++) {
            for (int contador1 = 0; contador1 < vetor2.length; contador1++) {
                if (vetor1Aux[contador] == vetor2Aux[contador1] && contadorFinal == 0) {
                    contadorFinal++;
                    vetorFinal[contadorFinal] = vetor1Aux[contador];
                } else if (vetor1Aux[contador] == vetor2Aux[contador1]
                            && vetor1Aux[contador] != vetorFinal[contadorFinal]) {
                    contadorFinal++;
                    vetorFinal[contadorFinal] = vetor1Aux[contador];
                }
            }
        }

        return contadorFinal;
    }

}
