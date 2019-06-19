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
     * @param valor Valor usado para conferir valores.
     *
     * @return Retorna a quantidade de elementos iguais entre os vetores.
     */
    public static int obterElementosIguais(final int[] vetor1, final int valor) {
        final int[] vetor1Aux = vetor1.clone();

        Arrays.sort(vetor1Aux);

        int contadorFinal = 0;
        for (int contador = 0; contador < vetor1.length; contador++) {
            if (vetor1Aux[contador] == valor) {
                contadorFinal++;
            }
        }

        return contadorFinal;
    }

}
