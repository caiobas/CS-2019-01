package com.github.caiobas.es.cs.aula08.domain;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Tem finalidade de receber um nome e
 * posteriormente retornar os 4 primeiros bytes
 * (inteiro de 32 bits) em formato hexadecimal.
 */
public final class InteiroUtils {

    /**
     * Construtor privado da classe para evitar instanciação.
     */
    private InteiroUtils() {

    }

    /**
     * Retorna os quatro primeiros bytes em hexadecimal do arquivo fornecido.
     *
     * @param caminho Caminho do arquivo que deve ser
     * analisado para se obter os 4 primeiros bytes.
     *
     * @return Retorna os 4 primeiros bytes
     * do arquivo passado como parâmetro.
     *
     * @throws IllegalArgumentException Se o arquivo não existir
     * ou se houverem dados insuficientes no arquivo.
     */
    public static String imprimeHexa(final String caminho) {

        final File arquivo = new File(caminho);

        if (!arquivo.exists()) {
            throw new IllegalArgumentException(
                "O arquivo não existe.");
        }

        if (!arquivo.canRead()) {
            throw new IllegalArgumentException(
                "O arquivo não pode ser lido.");
        }

        final int bytesMinimo = 4;
        if (arquivo.length() < bytesMinimo) {
            throw new IllegalArgumentException(
                "Dados insuficientes no arquivo.");
        }

        try (final InputStream fis = Files.newInputStream(Paths.get(caminho)); 
            final DataInputStream dis = new DataInputStream(fis)) {
                
                final int[] valor = {dis.readByte(), dis.readByte(), dis.readByte(), dis.readByte()};
                final StringBuilder hexadecimal = new StringBuilder();
                hexadecimal.append(Integer.toHexString(valor[0])); 
                hexadecimal.append(Integer.toHexString(valor[1])); 
                hexadecimal.append(Integer.toHexString(valor[2])); 
                hexadecimal.append(Integer.toHexString(valor[3])); 
    
            return hexadecimal.toString();
        } catch(IOException io) {
            throw new IllegalArgumentException("Houve um problema na leitura do arquivo.");
        }

    }

}
