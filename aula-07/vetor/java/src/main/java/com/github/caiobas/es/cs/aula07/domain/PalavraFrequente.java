package com.github.caiobas.es.cs.aula07.domain;

import java.util.HashMap;

/**
 * Classe com o objetivo de localizar a palavra mais frequente em uma sequência
 * de caracteres.
 */
public final class PalavraFrequente {

    private PalavraFrequente() {

    }
    /**
     * Classe com o objetivo de localizar a palavra
     * mais frequente em uma sequência de caracteres.
     *
     * @param frase String contendo palavras.
     *
     * @return Retorna a palavra mais frequente em uma frase.
     */
    public static String obterPalavraFrequente(final String frase) {
        final HashMap<String, Integer> frequencia = new HashMap<String, Integer>();

        final String[] palavras = frase.split(" ");

        for (final String palavra : palavras) {
            if (frequencia.containsKey(palavra)) {
                frequencia.put(palavra, frequencia.get(palavra) + 1);
            } else {
                frequencia.put(palavra, 1);
            }
        }

        String palavra = "";
        int compara = 0;

        for (final String contador : frequencia.keySet()) {
            if (frequencia.get(contador) > compara) {
                compara = frequencia.get(contador);
                palavra = contador;
            }
        }

        return palavra;
    }

}
