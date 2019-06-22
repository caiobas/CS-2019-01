package com.github.caiobas.es.cs.aula07.domain;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

/**
 * Retorna a quantidade de cada uma das letras
 * presentes em uma sequência de caracteres.
 */
public final class QuantidadeLetrasUtils {

    /**
     * Construtor privado da classe para evitar instanciação.
     */
    private QuantidadeLetrasUtils() {

    }
    /**
     * Retorna a quantidade de cada uma das letras
     * presentes em uma sequência de caracteres.
     *
     * @param string String contendo caracteres.
     *
     * @return Retorna a quantidade de cada uma das
     * letras presentes em uma string.
     */
    public static StringBuilder obterQuantidadeLetras(final String string) {
        final char[] stringAuxiliar = string.toCharArray();

        final HashMap<Character, Integer> letras = new HashMap<Character, Integer>();

        final int maiusculaInicio = 65;
        final int maiusculaFim = 90;
        final int minusculaInicio = 97;
        final int minusculaFim = 122;

        for (final char character : stringAuxiliar) {
            if (character > maiusculaInicio && character < maiusculaFim
            || character > minusculaInicio && character < minusculaFim) {
                if (letras.containsKey(character)) {
                    letras.put(character, letras.get(character) + 1);
                } else {
                    letras.put(character, 1);
                }
            }
        }

        final StringBuilder letrasFinal = new StringBuilder();

        final Set<Map.Entry<Character, Integer>> entries = letras.entrySet();
        for (final Map.Entry<Character, Integer> entrada : entries) {
            letrasFinal.append(entrada.getKey() +  " = " + entrada.getValue() + "\n");
        }

        return letrasFinal;
    }

}
