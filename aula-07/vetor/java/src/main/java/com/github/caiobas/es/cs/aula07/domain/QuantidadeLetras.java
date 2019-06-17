package com.github.caiobas.es.cs.aula07.domain;

/**
 * Classe com o objetivo de retornar a quantidade de cada
 * uma das letras presentes em uma sequência de caracteres.
 */
public final class QuantidadeLetras {

    /**
     * Construtor privado da classe para evitar instanciação.
     */
    private QuantidadeLetras() {

    }
    /**
     * Classe com o objetivo de retornar a quantidade de cada
     * uma das letras presentes em uma sequência de caracteres.
     *
     * @param string String contendo caracteres.
     *
     * @return Retorna a quantidade de cada uma das
     * letras presentes em uma string.
     */
    public static StringBuilder obterQuantidadeLetras(final String string) {
        final int quantidadeLetras = 26;
        int[] letras = new int[quantidadeLetras];
        for (int contador = 0; contador < letras.length; contador++) {
            letras[contador] = 0;
        }
        final char[] stringAuxiliar = string.toCharArray();

        final int letraMaiuscula = 65;
        final int letraMinuscula = 97;
        for (int contador = 0; contador < stringAuxiliar.length; contador++) {
            if (stringAuxiliar[contador] - letraMaiuscula >= 0
                    && stringAuxiliar[contador] - letraMaiuscula < quantidadeLetras) {
                letras[stringAuxiliar[contador] - letraMaiuscula]++;
            } else if (stringAuxiliar[contador] - letraMinuscula >= 0
                    && stringAuxiliar[contador] - letraMinuscula < quantidadeLetras) {
                letras[stringAuxiliar[contador] - letraMinuscula]++;
            }
        }

        final StringBuilder letrasFinal = new StringBuilder();

        for (int contador = 0; contador < letras.length; contador++) {
            if (letras[contador] != 0) {
                final char letra = (char) (contador + letraMaiuscula);
                letrasFinal.append(letra +  " = " + letras[contador] + "\n");
            }
        }
        return letrasFinal;
    }

}
