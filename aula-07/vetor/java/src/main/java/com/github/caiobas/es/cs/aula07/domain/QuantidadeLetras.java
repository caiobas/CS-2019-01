package com.github.caiobas.es.cs.aula07.domain;

/**
 * Classe com o objetivo de retornar a quantidade de cada
 * uma das letras presentes em uma sequência de caracteres.
 */
public final class QuantidadeLetras {

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
    public static String obterQuantidadeLetras(final String string) {
        int[] letras = new int[26];
        for(int contador = 0; contador < letras.length; contador++){
            letras[contador] = 0;
        }
        char[] stringAuxiliar = string.toCharArray();

        for(int contador = 0; contador < stringAuxiliar.length; contador++){
            if(stringAuxiliar[contador] - 65 >= 0  && stringAuxiliar[contador] - 65 < 26){
                letras[stringAuxiliar[contador] - 65]++;
            }
            else if(stringAuxiliar[contador] - 97 >= 0  && stringAuxiliar[contador] - 97 < 26){
                letras[stringAuxiliar[contador] - 97]++;
            }
        }

        String letrasFinal = "";

        for(int contador = 0; contador < letras.length; contador++){
            if(letras[contador] != 0){
                char letra = (char) (contador + 65);
                letrasFinal = letrasFinal + letra + "" +  " = " + letras[contador] + "\n";
            }
        }
        return letrasFinal;
    }

}
