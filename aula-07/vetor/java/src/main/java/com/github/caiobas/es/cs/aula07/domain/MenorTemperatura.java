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
        // FIXME conforme já observado, isto não clona o vetor original
        final double[] vetorAuxiliar = vetor;
        
        // TODO Esta operação é O(n.log(n)) o que é bem superior a O(n)
        // Não é necessário ordenar
        // Arrays.sort(vetorAuxiliar);

        // return vetorAuxiliar[0];
        
        // TODO sugestão para as linhas anteriores
        return Arrays.stream(vetor).min().getAsDouble();
    }

}
