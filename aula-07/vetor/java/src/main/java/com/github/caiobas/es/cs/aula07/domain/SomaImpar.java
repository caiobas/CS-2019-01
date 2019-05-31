package com.github.caiobas.es.cs.aula07.domain;

/**
 * Classe com o objetivo de encontrar a menor temperatura
 * em um vetor de valores recebido como argumento.
 */
public final class SomaImpar {

    private SomaImpar() {

    }
    /**
     * Função com o objetivo de encontrar a menor temperatura
     * em um vetor de valores recebido como argumento.
     * 
     * @param vetor Vetor que contém temperaturas.
     * 
     * @return Retorna a menor temperatura de um vetor.
     */
    public static int obterSomaImpar(final int[] vetor) {
        int somaImpares = 0;

        for(int contador = 0; contador < vetor.length; contador++){
            if(vetor[contador] % 2 != 0){
                somaImpares = somaImpares + vetor[contador];
            }
        }

        return somaImpares;
    }

}
