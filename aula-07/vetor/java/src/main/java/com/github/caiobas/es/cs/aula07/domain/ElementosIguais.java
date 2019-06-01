package com.github.caiobas.es.cs.aula07.domain;

import java.util.Arrays;

/**
 * Classe com o objetivo de localizar a palavra mais frequente em uma sequência
 * de caracteres.
 */
public final class ElementosIguais {

    private ElementosIguais() {

    }
    /**
     * Classe com o objetivo de localizar a palavra
     * mais frequente em uma sequência de caracteres.
     * 
     * @param frase String contendo palavras.
     * 
     * @return Retorna a palavra mais frequente em uma frase.
     */
    public static int obterElementosIguais(final int[] vetor1, final int[] vetor2) {
        int[] vetor1Aux = vetor1;
        int[] vetor2Aux = vetor2;
        
        Arrays.sort(vetor1Aux);
        Arrays.sort(vetor2Aux);

        int[] vetorFinal = new int[vetor1.length];
        int contadorFinal = 0;

        for(int contador = 0; contador < vetor1.length; contador++){
            for(int contador1 = 0; contador1 < vetor2.length; contador1++){
                if(vetor1Aux[contador] == vetor2Aux[contador1] && contadorFinal == 0){
                    contadorFinal++;
                    vetorFinal[contadorFinal] = vetor1Aux[contador];
                }
                else if(vetor1Aux[contador] == vetor2Aux[contador1] && vetor1Aux[contador] != vetorFinal[contadorFinal]){
                    contadorFinal++;
                    vetorFinal[contadorFinal] = vetor1Aux[contador];
                }
            }
        }
        
        return contadorFinal;
    }

}
