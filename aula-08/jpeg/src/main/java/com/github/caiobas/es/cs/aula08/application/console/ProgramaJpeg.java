package com.github.caiobas.es.cs.aula08.application.console;

import java.io.IOException;
import java.util.logging.Logger;

import com.github.caiobas.es.cs.aula08.domain.ConfereArquivoUtils;

/**
 * Classe criada para a execução da classe ConfereArquivoUtils.
 */
public final class ProgramaJpeg {

    /**
     * Vai mandar a mensagem de retorno do programa.
     */
    private static Logger log = Logger.getLogger(ProgramaJpeg.class.getName());

    /**
     * Construtor privado da classe para evitar instanciação.
     */
    private ProgramaJpeg() {

    }

    /**
     * Execução do programa que confere
     * se o arquivo é ou não jpeg.
     *
     * @param args Caminho do arquivo que deve ser informado.
     *
     * @throws IOException Se houver problema ao ler o caminho do arquivo.
     */
    public static void main(final String[] args) throws IOException {
        System.out.println(ConfereArquivoUtils.arquivoJpeg(
            ConfereArquivoUtils.confereByte(args[0])));
    }
}
