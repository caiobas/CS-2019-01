package com.github.caiobas.es.cs.aula07.domain;

import java.util.Random;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Classe com o objetivo de retornar o número com a
 * maior quantidade de repetições de 1.000.000 de números
 * sorteados aleatoriamente entre o intervalo de 0 a 1.000.
 */
public final class NumeroFrequenteUtils {

    private NumeroFrequenteUtils() {

    }
    /**
     * Classe com o objetivo de gerar 1.000.000 de números
     * no intervalo de 0 a 1.000 aleatoriamente.
     *
     * @param quantidade Quantidade de números gerados.
     * @param intervalo Intervalo dos números gerados.
     *
     * @return Retorna um ArrayList de inteiro com
     * todos os números gerados aleatoriamente.
     *
     * @throws IllegalArgumentException Se a quantidade não for 1.000.000.
     * @throws IllegalArgumentException Se o intervalo não for 1.000.
     */
    public static ArrayList<Integer> numerosAleatorios(final int quantidade, final int intervalo) {
        final int limiteQuantidade = 1_000_000;
        if (quantidade != limiteQuantidade) {
            throw new IllegalArgumentException("Quantidade deve ser 1000000.");
        }
        final int limiteIntervalo = 1000;
        if (intervalo != limiteIntervalo) {
            throw new IllegalArgumentException("Intervalo deve ser entre 0 e 1000.");
        }

        final Random random = new Random();

        final ArrayList<Integer> vetor = new ArrayList<Integer>();

        final int intervaloFinal = intervalo + 1;

        for (int contador = 1; contador <= quantidade; contador++) {
            vetor.add(random.nextInt(intervaloFinal));
        }

        return vetor;
    }

    /**
     * Classe com o objetivo de analisar o ArrayList de
     * números gerados aleatoriamente e retornar um
     * ArrayList com o(s) número(s) mais frequentes.
     *
     * @param vetor Vetor com números gerados aleatoriamente.
     *
     * @return Retorna um ArrayList de inteiro com o(s)
     * número(s) mais frequentes do ArrayList de aleatórios.
     */
    public static ArrayList<Integer> obterNumeroFrequente(final ArrayList<Integer> vetor) {
        final HashMap<Integer, Integer> numeros = new HashMap<Integer, Integer>();

        for (final int inteiro : vetor) {
            if (numeros.containsKey(inteiro)) {
                numeros.put(inteiro, numeros.get(inteiro) + 1);
            } else {
                numeros.put(inteiro, 1);
            }
        }

        int compara = 0;
        Set<Map.Entry<Integer, Integer>> entries = numeros.entrySet();
        for (Map.Entry<Integer, Integer> entrada : entries) {
            if (entrada.getValue() > compara) {
                compara = entrada.getValue();
            }
        }
        final ArrayList<Integer> frequentes = new ArrayList<Integer>();
        for (Map.Entry<Integer, Integer> entrada : entries) {
            if (entrada.getValue() == compara) {
                frequentes.add(entrada.getKey());
            }
        }

        Collections.sort(frequentes);
        return frequentes;

    }

}
