package com.github.caiobas.es.cs.aula08.domain;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Classe com a função de receber um arquivo e
 * conferir se o mesmo é um arquivo do tipo jpeg.
 */
public final class ConfereArquivoUtils {

    /**
     * Primeiro byte de arquivo jpeg.
     */
    private static final int PRIMEIROBYTE = 0xffd8ffe0;

    /**
     * Ultimo byte de arquivo jpeg.
     */
    private static final int ULTIMOBYTE = 0xffffffd9;

    /**
     * Tamanho de vetor que armazena as linhas de um arquivo.
     */
    private static final int LINHA = 1024;

    /**
     * Construtor privado da classe para evitar instanciação.
     */
    private ConfereArquivoUtils() {

    }

    /**
     * Método que tem como função conferir se o
     * arquivo passado é um arquivo do tipo jpeg.
     *
     * @param caminho Caminho do arquivo que deve
     * ser analisado para saber se é jpeg.
     *
     * @return Retorna {@code true} se o arquivo for jpeg,
     * ou {@code false} se o arquivo não for jpeg.
     *
     * @throws IOException Se houver problema ao ler o caminho do arquivo.
     * @throws IllegalArgumentException Se o arquivo não existir
     * ou se houverem dados insuficientes no arquivo.
     */
    public static boolean confereByte(final String caminho)
    throws IOException {
        final File arquivo = new File(caminho);

        if (!arquivo.exists()) {
            throw new IllegalArgumentException(
                "O arquivo não existe.");
        }

        if (arquivo.length() == 0) {
            throw new IllegalArgumentException(
                "Dados insuficientes no arquivo.");
        }

        final InputStream fis = Files.newInputStream(Paths.get(caminho));
        final DataInputStream dis = new DataInputStream(fis);
        final InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        final BufferedReader br = new BufferedReader(isr);

        boolean jpeg = false;
        final int valor = dis.readInt();

        if (valor == PRIMEIROBYTE) {
            jpeg = true;
        }

        int lerByte;
        int byteFinal = 0;
        final byte[] dado = new byte[LINHA];

        lerByte = fis.read(dado);
        while (lerByte != -1) {
            byteFinal = lerByte - 1;
            lerByte = fis.read(dado);
        }

        if (dado[byteFinal] == ULTIMOBYTE && !jpeg) {
            jpeg = false;
        }
        br.close();
        dis.close();

        return jpeg;
    }

    /**
     * Método com função de retornar string confirmando
     * se o arquivo passado como parâmetro é ou não jpeg.
     *
     * @param jpeg Boolean contendo {@code true} se for jpeg,
     *             ou {@code false} se não for jpeg.
     * @return Retorna string contendo mensagem de
     *         confirmação se o arquivo é ou não jpeg.
     */
    public static String arquivoJpeg(final boolean jpeg) {
        if (jpeg) {
            return "O arquivo passado é um jpeg.";
        } else {
            return "O arquivo passado não é um jpeg.";
        }
    }
}
