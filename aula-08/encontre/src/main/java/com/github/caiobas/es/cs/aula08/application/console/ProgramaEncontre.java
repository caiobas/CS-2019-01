package com.github.caiobas.es.cs.aula08.application.console;

import java.io.IOException;

import com.github.caiobas.es.cs.aula08.domain.EncontreUtils;

/**
 * Tem a finalidade de execução da classe EncontreUtils.
 */
public final class ProgramaEncontre {

    /**
     * Construtor privado da classe para evitar instanciação.
     */
    private ProgramaEncontre() {

    }

    /**
     * Execução do programa que procura uma palavra chave num
     * arquivo e imprime a quantidade e locais das ocorrências.
     *
     * @param args Contém caminho do arquivo e palavra a serem analisados.
     *
     * @throws IOException Se houver problema ao ler o caminho do arquivo.
     */
    public static void main(final String[] args) throws IOException {
        System.out.println(EncontreUtils.retornaResultado(args[0], args[1]));
    }
}
