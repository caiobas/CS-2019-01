package com.github.caiobas.es.cs.aula07.domain;

import java.util.Arrays;

/**
 * Classe com o objetivo de encontrar a menor temperatura
 * em um vetor de valores recebido como argumento.
 */
public final class MenorTemperatura {

    private MenorTemperatura() {

    }
    /**
     * Função com o objetivo de encontrar a menor temperatura
     * em um vetor de valores recebido como argumento.
     *
     * @param vetor Vetor que contém temperaturas.
     *
     * @return Retorna a menor temperatura de um vetor.
     */
    public static double obterMenorTemperatura(final double[] vetor) {
        double[] vetorAuxiliar = vetor;
        Arrays.sort(vetorAuxiliar);

        return vetorAuxiliar[0];
    }

}
