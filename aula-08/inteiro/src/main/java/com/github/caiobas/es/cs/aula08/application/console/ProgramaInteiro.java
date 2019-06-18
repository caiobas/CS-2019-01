package com.github.caiobas.es.cs.aula08.application.console;

import java.io.IOException;
import java.util.logging.Logger;

import com.github.caiobas.es.cs.aula08.domain.InteiroUtils;

/**
 * Classe criada para a execução da classe InteiroUtils.
 */
public final class ProgramaInteiro {

    /**
     * Vai mandar a mensagem de retorno do programa.
     */
    private static Logger log = Logger.getLogger(ProgramaInteiro.class.getName());

    /**
     * Construtor privado da classe para evitar instanciação.
     */
    private ProgramaInteiro() {

    }

    /**
     * Execução do programa para mostrar os
     * 4 primeiros bytes de um arquivo.
     *
     * @param args Caminho do arquivo que deve ser informado.
     *
     * @throws IOException Se houver problema ao ler o caminho do arquivo.
     * @throws IllegalArgumentException Se não for passado nenhum parâmetro.
     */
    public static void main(final String[] args) throws IOException {
        if (args.length == 0) {
            throw new IllegalArgumentException(
                "Nenhum argumento foi fornecido.");
        }

        System.out.println(InteiroUtils.imprimeHexa(args[0]));
    }
}
