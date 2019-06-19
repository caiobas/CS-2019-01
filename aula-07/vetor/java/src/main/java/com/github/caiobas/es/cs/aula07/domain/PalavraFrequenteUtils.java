package com.github.caiobas.es.cs.aula07.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Localiza a palavra mais frequente em uma sequência de caracteres.
 */
public final class PalavraFrequenteUtils {

    private PalavraFrequenteUtils() {

    }
    /**
     * Localiza a palavra mais frequente em uma sequência de caracteres.
     *
     * @param frase String contendo palavras.
     *
     * @return Retorna a palavra mais frequente em uma frase.
     */
    public static String obterPalavraFrequente(final String frase) {
        final HashMap<String, Integer> frequencia = new HashMap<String, Integer>();

        final String[] palavras = frase.split("\\P{L}+");

        for (final String palavra : palavras) {
            if (frequencia.containsKey(palavra)) {
                frequencia.put(palavra, frequencia.get(palavra) + 1);
            } else {
                frequencia.put(palavra, 1);
            }
        }

        String palavra = "";
        int compara = 0;

        Set<Map.Entry<String, Integer>> entries = frequencia.entrySet();
        for (Map.Entry<String, Integer> entrada : entries) {
            if (entrada.getValue() > compara) {
                compara = entrada.getValue();
                palavra = entrada.getKey();
            }
        }

        return palavra;
    }

}
