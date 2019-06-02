package com.github.caiobas.es.cs.aula07.domain;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Classe com o objetivo de etornar a quantidade de elementos
 * do vetor recebido como primeiro argumento cujos valores são
 * iguais ao valor do segundo argumento fornecido.
 */
public final class NumeroFrequente {

    private NumeroFrequente() {

    }
    /**
     * Classe com o objetivo de etornar a quantidade de elementos
     * do vetor recebido como primeiro argumento cujos valores são
     * iguais ao valor do segundo argumento fornecido.
     * 
     * @param vetor1 Vetor contendo elementos para conferir valores.
     * @param vetor2 Vetor contendo elementos para conferir valores.
     * 
     * @return Retorna a quantidade de elementos iguais entre os vetores.
     */
    public static ArrayList<Integer> numerosAleatorios(final int quantidade,final int intervalo){
        final int limiteQuantidade = 1000000;
        if(quantidade != limiteQuantidade){
            throw new IllegalArgumentException("Quantidade deve ser 1000000.");
        }
        final int limiteIntervalo = 1000;
        if(intervalo != limiteIntervalo){
            throw new IllegalArgumentException("Intervalo deve ser 1000.");
        }

        Random random = new Random();

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        final int intervaloFinal = intervalo + 1;

        for(int contador = 1; contador <= quantidade; contador++){
            vetor.add(random.nextInt(intervaloFinal));
        }

        return vetor;
    }
    
    public static ArrayList<Integer> obterNumeroFrequente(ArrayList<Integer> vetor) {
        HashMap<Integer, Integer> numeros = new HashMap<Integer, Integer>();
        
        for(int inteiro : vetor) {
            if(numeros.containsKey(inteiro)){
                numeros.put(inteiro, numeros.get(inteiro) + 1);
            }
            else{
                numeros.put(inteiro, 1);
            }
        }

        int compara = 0;
        for(int inteiro : numeros.keySet()){
            if(numeros.get(inteiro) > compara) {
                compara = numeros.get(inteiro);
            }
        }

        ArrayList<Integer> frequentes = new ArrayList<Integer>();
        for(int inteiro : numeros.keySet()){
            if(numeros.get(inteiro) == compara) {
                frequentes.add(inteiro);
            }
        }

        Collections.sort(frequentes);
		return frequentes;

    }

}
