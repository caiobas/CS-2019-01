package com.github.caiobas.es.cs.aula10.application.console;

import com.github.caiobas.es.cs.aula10.domain.EncontraDiaDaSemanaUtils;

/**
 * Classe para executar o programa de encontrar dia da semana de uma
 * data desejada tendo como referência um ano bissexto considerado
 * válido, uma data referência com seu respectivo dia da semana.
 */
public final class ProgramaDiaDaSemana {

    /**
     * Construtor privado da classe para evitar instanciação.
     */
    private ProgramaDiaDaSemana() {

    }

    /**
     * Executor do programa de encontrar dia da semana de uma data
     * desejada tendo como referência um ano bissexto considerado
     * válido, uma data referência com seu respectivo dia da semana.
     *
     * @param args Argumentos contendo todas as informações necessárias
     *             para se obter dia da semana da data desejada.
     */
    public static void main(final String[] args) {
        System.exit(EncontraDiaDaSemanaUtils.executaEncontraDia(args));
    }
}
