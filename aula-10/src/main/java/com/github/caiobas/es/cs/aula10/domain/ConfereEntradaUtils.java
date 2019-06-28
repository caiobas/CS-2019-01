package com.github.caiobas.es.cs.aula10.domain;

/**
 * Tem a função de conferir os parâmetros para
 * calculo do dia da semana da data desejada.
 */
public final class ConfereEntradaUtils {

    /**
     * Quantidade de argumentos que devem ser passados como parâmetro.
     */
    private static final int QTD_ARGUMENTOS = 4;
    /**
     * Dia da semana máximo que pode ser passado como parâmetro.
     */
    private static final int DIA_SEMANA_MAXIMO = 6;
    /**
     * Menor ano bissexto que pode ser passado como parâmetro.
     */
    private static final int MENOR_BISSEXTO = 1;
    /**
     * Tamanho da data que deve ser passada como parâmetro.
     */
    private static final int TAMANHO_DATA = 8;
    /**
     * Mês máximo que pode ser passado como parâmetro.
     */
    private static final int MES_MAXIMO = 12;

    /**
     * Construtor privado da classe para evitar instanciação.
     */
    private ConfereEntradaUtils() {

    }

    /**
     * Confere a quantidade de argumentos recebidos.
     *
     * @param args Vetor de string contendo argumentos.
     *
     * @return Retorna 1 para quantidade correta e
     *         -1 para quantidade incorreta.
     */
    public static int confereQtdArgumentos(final String[] args) {
        //return (args.length != QTD_ARGUMENTOS) ? -1 : 1;
        if (args.length != QTD_ARGUMENTOS) {
            return -1;
        }
        return 1;
    }

    /**
     * Confere se os argumentos são positivos.
     *
     * @param args Vetor de string contendo argumentos.
     *
     * @return Retorna 1 para argumentos positivos e
     *         -1 para argumentos negativos.
     */
    public static int confereArgumentos(final String[] args) {
        int confereInteiro = -1;
        int conferePositivo = 0;

        for (int contaArgs = 0; contaArgs < args.length; contaArgs++) {
            try {
                conferePositivo = Integer.parseInt(args[contaArgs]);
                confereInteiro = 1;
            } catch (NumberFormatException ex) {
                return -1;
            }

            if (conferePositivo < 0) {
                return -1;
            }
        }

        return confereInteiro;
    }

    /**
     * Confere se o dia da semana é passado corretamente.
     *
     * @param diaDaSemanaRef Dia da semana a ser analisado.
     *
     * @return Retorna 1 para dia da semana correto e
     *         -1 para dia da semana incorreto.
     */
    public static int confereDiaSemana(final int diaDaSemanaRef) {
        if (diaDaSemanaRef > DIA_SEMANA_MAXIMO) {
            return -1;
        } else {
            return 1;
        }
    }

    /**
     * Confere se o ano bissexto é passado corretamente.
     *
     * @param anoBissexto Ano bissexto a ser analisado.
     *
     * @return Retorna 1 para ano bissexto correto e
     *         -1 para ano bissexto incorreto.
     */
    public static int confereAnoBissexto(final int anoBissexto) {
        if (anoBissexto < MENOR_BISSEXTO) {
            return -1;
        } else {
            return 1;
        }
    }

    /**
     * Confere se a data foi passada corretamente.
     *
     * @param args String contendo data a ser analisada.
     * @param stringBissexto Ano bissexto usado para analise de data.
     *
     * @return Retorna 1 para data correta e
     *         -1 para data incorreta.
     */
    public static int confereData(final String args, final String stringBissexto) {

        if (args.length() != TAMANHO_DATA) {
            return -1;
        }

        final char zero = '0';
        if (args.charAt(0) == zero) {
            return -1;
        }

        final int mes = EncontraDiaDaSemanaUtils.getMes(args);
        if (mes == 0) {
            return -1;
        }

        if (mes > MES_MAXIMO) {
            return -1;
        }

        final int dia = EncontraDiaDaSemanaUtils.getDia(args);
        if (dia == 0) {
            return -1;
        }

        final int anoBissexto = Integer.parseInt(stringBissexto);
        final int ano = EncontraDiaDaSemanaUtils.getAno(args);
        if (dia > EncontraDiaDaSemanaUtils.getUltimoDiaMes(mes, ano, anoBissexto)) {
            return -1;
        }

        return 1;
    }

    /**
     * Executa todos os métodos desta classe com finalidade de conferir todos
     * os argumentos passados como parâmetro para obter dia da semana da
     * data desejada em relação ao dia da semana da data referência.
     *
     * @param args Argumentos a ser conferidos.
     *
     * @return Retorna 1 para argumentos conferidos corretamente e
     *         -1 para argumentos conferidos incorretamente.
     */
    public static int executaConfere(final String[] args) {
        final int um = 1;
        if (confereQtdArgumentos(args) != um) {
            return -1;
        }

        if (confereArgumentos(args) != um) {
            return -1;
        }

        if (confereAnoBissexto(Integer.parseInt(args[um])) != um) {
            return -1;
        }

        if (confereData(args[0], args[um]) != um) {
            return -1;
        }

        if (confereData(args[2], args[um]) != um) {
            return -1;
        }

        final int tres = 3;
        if (confereDiaSemana(Integer.parseInt(args[tres])) != um) {
            return -1;
        }

        return 1;
    }
}
