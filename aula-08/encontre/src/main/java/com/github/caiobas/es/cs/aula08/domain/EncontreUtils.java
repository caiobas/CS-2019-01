package com.github.caiobas.es.cs.aula08.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class EncontreUtils {

    /**
     * Construtor privado da classe para evitar instanciação.
     */
    private EncontreUtils() {

    }

    public static String Ocorrencias(final String caminho,
    final String palavraChave) throws IOException{
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

    public static String LinhasEColunas(final String caminho,
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

    public static String retornaResultado(final String caminho,
    final String palavraChave) throws IOException {

        final StringBuilder resultado = new StringBuilder();
        resultado.append(Ocorrencias(caminho, palavraChave)).
        append(LinhasEColunas(caminho, palavraChave));

        return resultado.toString();
    }
}
