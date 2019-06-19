package com.github.caiobas.es.cs.aula07.domain;

import java.util.Arrays;

/**
 * Encontra a menor temperatura em um
 * vetor de valores recebido como argumento.
 */
public final class MenorTemperaturaUtils {

    private MenorTemperaturaUtils() {

    }
    /**
     * Encontra a menor temperatura em um
     * vetor de valores recebido como argumento.
     *
     * @param vetor Vetor que contém temperaturas.
     *
     * @return Retorna a menor temperatura de um vetor.
     */
    public static double obterMenorTemperatura(final double[] vetor) {

        return Arrays.stream(vetor).min().getAsDouble();
    }

}
