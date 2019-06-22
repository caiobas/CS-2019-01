package com.github.caiobas.es.cs.aula08.application.console;

import java.io.IOException;

import com.github.caiobas.es.cs.aula08.domain.EncontreUtils;

public final class ProgramaEncontre {

    /**
     * Construtor privado da classe para evitar instanciação.
     */
    private ProgramaEncontre() {

    }

    public static void main(String[] args) throws IOException {
        System.out.println(args[0]);
        System.out.println(EncontreUtils.retornaResultado(args[0], args[1]));
    }
}