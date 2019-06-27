package com.github.caiobas.es.cs.aula08.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Tem a finalidade de receber um caminho de arquivo e uma palavra chave,
 * esta palavra chave serve como parâmetro para procurar dentro do arquivo.
 * Caso encontre, manda a quantidade encontrada e as linhas e
 * colunas(caso haja mais de uma, apenas a primeira ocorrência) de sua
 * ocorrência. Caso não encontre, apenas retorna que não encontrou nenhuma.
 */
public final class EncontreUtils {

    /**
     * Construtor privado da classe para evitar instanciação.
     */
    private EncontreUtils() {

    }

    /**
     * Recebe o caminho de um arquivo e uma
     * palavra chave para contar quantas ocorrências
     * dessa palavra chave contém no arquivo.
     *
     * @param caminho Caminho de um arquivo a ser analisado.
     * @param palavraChave Palavra chave a ser analisada no arquivo.
     *
     * @return Retorna uma string com a quantidade de ocorrências.
     *
     * @throws IOException Se houver problema ao ler o caminho do arquivo.
     */
    public static String ocorrencias(final String caminho,
    final String palavraChave) throws IOException {
        final File arquivo = new File(caminho);

        if (!arquivo.exists()) {
            throw new IllegalArgumentException(
                "O arquivo não existe.");
        }

        if (!arquivo.canRead()) {
            throw new IllegalArgumentException(
                "O arquivo não pode ser lido.");
        }

        if (arquivo.length() == 0) {
            throw new IllegalArgumentException(
                "Dados insuficientes no arquivo.");
        }

        final BufferedReader br = Files.newBufferedReader(Paths.get(caminho));

        int ocorrencias = 0;
        String[] palavras;
        String linhaAtual = br.readLine();

        while (linhaAtual != null) {
            palavras = linhaAtual.split(" ");

            for (int contador = 0; contador < palavras.length; contador++) {
                if (palavraChave.equals(palavras[contador])) {
                    ocorrencias++;
                }
            }

            linhaAtual = br.readLine();
        }

        br.close();
        return String.format("Encontradas: %d.", ocorrencias);
    }

    /**
     * Recebe o caminho de um arquivo e uma palavra chave para armazenar
     * as linhas e colunas(da primeira ocorrência na linha em questão)
     * das ocorrências da palavra chave no arquivo em questão.
     *
     * @param caminho Caminho de um arquivo a ser analisado.
     * @param palavraChave Palavra chave a ser analisada no arquivo.
     *
     * @return Retorna uma string contendo as linhas e colunas
     * das ocorrências da palavra chave no arquivo em questão.
     *
     * @throws IOException Se houver problema ao ler o caminho do arquivo.
     */
    public static String linhasEColunas(final String caminho,
    final String palavraChave) throws IOException {
        final File arquivo = new File(caminho);

        if (!arquivo.exists()) {
            throw new IllegalArgumentException(
                "O arquivo não existe.");
        }

        if (arquivo.length() == 0) {
            throw new IllegalArgumentException(
                "Dados insuficientes no arquivo.");
        }

        final BufferedReader br = Files.newBufferedReader(Paths.get(caminho));

        final StringBuilder formato = new StringBuilder();
        final StringBuilder linha = new StringBuilder();
        int contadorLinhas = 0;
        String linhaAtual = br.readLine();

        while (linhaAtual != null) {
            linha.append(linhaAtual);
            contadorLinhas++;

            if (linha.toString().contains(palavraChave)) {
                formato.append(String.format("%nL%d C%d: %s", contadorLinhas,
                linha.indexOf(palavraChave) + 1, linha.toString()));
            }
            linha.setLength(0);
            linhaAtual = br.readLine();
        }

        br.close();
        return formato.toString();
    }

    /**
     * Recebe o caminho de um arquivo e uma palavra chave para
     * construir uma string com a quantidade e locais das
     * ocorrências da palavra chave no arquivo em questão.
     *
     * @param caminho Caminho de um arquivo a ser analisado.
     * @param palavraChave Palavra chave a ser analisada no arquivo.
     *
     * @return Retorna uma string contendo a quantidade e locais
     * das ocorrências da palavra chave no arquivo em questão.
     *
     * @throws IOException Se houver problema ao ler o caminho do arquivo.
     */
    public static String retornaResultado(final String caminho,
    final String palavraChave) throws IOException {

        final StringBuilder resultado = new StringBuilder();
        resultado.append(ocorrencias(caminho, palavraChave)).
        append(linhasEColunas(caminho, palavraChave));

        return resultado.toString();
    }
}
