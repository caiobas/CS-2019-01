package com.github.caiobas.es.cs.aula08.domain;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * Classe com a finalidade de receber um nome de
 * e posteriormente retornar os 4 primeiros bytes
 * (inteiro de 32 bits) em formato hexadecimal.
 */
public final class InteiroUtils {

    /**
     * Construtor privado da classe para evitar instanciação.
     */
    private InteiroUtils() {

    }

    /**
     * Método que recebe um nome de arquivo e
     * mostra os 4 primeiros bytes do mesmo.
     *
     * @param caminho Caminho do arquivo que deve ser
     * analisado para se obter os 4 primeiros bytes.
     *
     * @return Retorna os 4 primeiros bytes
     * do arquivo passado como parâmetro.
     *
     * @throws IOException Se houver problema ao ler o caminho do arquivo.
     * @throws IllegalArgumentException Se o arquivo não existir
     * ou se houverem dados insuficientes no arquivo.
     */
    public static String imprimeHexa(final String caminho)
    throws IOException {

        final File arquivo = new File(caminho);

        if (!arquivo.exists()) {
            throw new IllegalArgumentException(
                "O arquivo não existe.");
        }

        final int bytesMinimo = 4;
        if (arquivo.length() < bytesMinimo) {
            throw new IllegalArgumentException(
                "Dados insuficientes no arquivo.");
        }

        final InputStream fis = Files.newInputStream(Paths.get(arquivo));
        final DataInputStream dis = new DataInputStream(fis);

        final int hexadecimal = dis.readInt();

        fis.close();
        dis.close();

        return Integer.toHexString(hexadecimal);
    }

}
