package com.github.caiobas.es.cs.aula07.domain;

import java.util.Arrays;

/**
 * Retorna a soma de números ímpares
 * contidos em um vetor de inteiros.
 */
public final class SomaImparUtils {

    private SomaImparUtils() {

    }
    /**
     * Retornar a soma de números ímpares
     * contidos em um vetor de inteiros.
     *
     * @param vetor Vetor que contém os inteiros.
     *
     * @return Retorna a soma dos números ímpares de um vetor.
     */
    public static int obterSomaImpar(final int[] vetor) {

        return Arrays.stream(vetor).filter(v -> v % 2 != 0).sum();
    }

}
