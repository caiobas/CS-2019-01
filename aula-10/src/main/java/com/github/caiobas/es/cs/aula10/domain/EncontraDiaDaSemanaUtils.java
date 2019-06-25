package com.github.caiobas.es.cs.aula10.domain;

/**
 * Tem a função de encontrar o dia da semana de uma data desejada
 * com base em uma data referência, um ano a ser considerado
 * bissexto e o dia da semana da data referência.
 */
public final class EncontraDiaDaSemanaUtils {

    /**
     * Construtor privado da classe para evitar instanciação.
     */
    private EncontraDiaDaSemanaUtils() {

    }

    /**
     * Tem a função de retirar o dia de uma string de data
     * contendo exatamento 8 caracteres no formato aaaammdd.
     *
     * @param data String contendo 8 caracteres no formato aaaammdd.
     *
     * @return Retorna o dia da data em questão.
     */
    public static int getDia(final String data) {
        final int inicioDia = 6;
        final int finalDia = 8;
        return Integer.parseInt(data.substring(inicioDia, finalDia));
    }

    /**
     * Tem a função de retirar o mês de uma string de data
     * contendo exatamento 8 caracteres no formato aaaammdd.
     *
     * @param data String contendo 8 caracteres no formato aaaammdd.
     *
     * @return Retorna o mês da data em questão.
     */
    public static int getMes(final String data) {
        final int inicioMes = 4;
        final int finalMes = 6;
        return Integer.parseInt(data.substring(inicioMes, finalMes));
    }

    /**
     * Tem a função de retirar o ano de uma string de data
     * contendo exatamento 8 caracteres no formato aaaammdd.
     *
     * @param data String contendo 8 caracteres no formato aaaammdd.
     *
     * @return Retorna o ano da data em questão.
     */
    public static int getAno(final String data) {
        final int inicioAno = 0;
        final int finalAno = 4;
        return Integer.parseInt(data.substring(inicioAno, finalAno));
    }

    /**
     * Confere se o ano passado como parâmetro é ano bissexto
     * de acordo com o parâmetro do ano bissexto confirmado.
     *
     * @param ano Ano conferido para saber se é ou não bissexto.
     * @param anoBissexto Ano bissexto confirmado.
     *
     * @return Retorna um booleano confirmando se o ano é ou não bissexto.
     */
    public static boolean confereBissexto(final int ano,
    final int anoBissexto) {
        final int multiploDeQuatro = 4;
        final int cem = 100;
        final int quatrocentos = 400;

        if (ano == anoBissexto) {
            return true;
        } else if (ano - anoBissexto % multiploDeQuatro == 0
                && (ano % cem != 0 || ano % quatrocentos == 0)) {
            return true;
        }
        return false;
    }

    /**
     * Tem a função de calcular o último dia do mês em questão.
     *
     * @param mes Mês para se calcular último dia.
     * @param ano Ano para conferir se é bissexto.
     * @param anoBissexto Ano bissexto para conferir corretamente
     *                    o último dia do mês de fevereiro.
     *
     * @return Retorna o último dia do mês em questão.
     */
    public static int getUltimoDiaMes(final int mes, final int ano,
    final int anoBissexto) {
        final boolean confereBissexto = confereBissexto(ano, anoBissexto);
        final int janeiro = 1;
        final int fevereiro = 2;
        final int marco = 3;
        final int abril = 4;
        final int maio = 5;
        final int junho = 6;
        final int julho = 7;
        final int agosto = 8;
        final int setembro = 9;
        final int outubro = 10;
        final int novembro = 11;
        final int dezembro = 12;
        final int diaTrintaEUm = 31;
        final int diaTrinta = 30;
        final int diaVinteNove = 29;
        final int diaVinteOito = 28;

        switch (mes) {
            case janeiro:
            case marco:
            case maio:
            case julho:
            case agosto:
            case outubro:
            case dezembro:
                return diaTrintaEUm;
            case abril:
            case junho:
            case setembro:
            case novembro:
                return diaTrinta;
            case fevereiro:
                if (confereBissexto) {
                    return diaVinteNove;
                } else {
                    return diaVinteOito;
                }
            default:
                return 0;
        }
    }

    /**
     * Compara duas datas com a finalidade de saber se são iguais ou não.
     *
     * @param diaUm Dia da primeira data analisada.
     * @param mesUm Mês da primeira data analisada.
     * @param anoUm Ano da primeira data analisada.
     * @param diaDois Dia da segunda data analisada.
     * @param mesDois Mês da segunda data analisada.
     * @param anoDois Ano da segunda data analisada.
     *
     * @return Retorna booleano confirmando se são iguais ou não.
     */
    public static boolean comparaDatas(final int diaUm, final int mesUm,
    final int anoUm, final int diaDois, final int mesDois,
    final int anoDois) {
        return anoUm == anoDois && mesUm == mesDois && diaUm == diaDois;
    }

    /**
     * Tem a função de avançar a data referência até a data desejada fazendo
     * uma contagem de dias para calcular o dia da semana da data desejada.
     *
     * @param dataDesejada Data em que se deseja chegar.
     * @param dataRef Data base para avançar e obter contagem de dias.
     * @param anoBissexto Ano bissexto para conferir corretamente
     *                    o último dia do mês de fevereiro.
     *
     * @return Retorna um int contendo a quantidade
     *         de dias avançados até a data desejada.
     */
    public static int avancaData(final String dataDesejada,
    final String dataRef, final int anoBissexto) {
        final int diaDesejado = getDia(dataDesejada);
        final int mesDesejado = getMes(dataDesejada);
        final int anoDesejado = getAno(dataDesejada);
        int diaRef = getDia(dataRef);
        int mesRef = getMes(dataRef);
        int anoRef = getAno(dataRef);
        int contadorDias = 0;

        final int mesLimite = 12;
        while (!comparaDatas(diaDesejado, mesDesejado, anoDesejado,
        diaRef, mesRef, anoRef)) {
            for (int contaMes = mesRef; contaMes <= mesLimite; contaMes++) {
                for (int contaDia = diaRef;
                    contaDia <= getUltimoDiaMes(mesRef, anoRef, anoBissexto);
                    contaDia++) {
                    if (comparaDatas(diaDesejado, mesDesejado, anoDesejado,
                        diaRef, mesRef, anoRef)) {
                        break;
                    }
                    diaRef++;
                    contadorDias++;
                }
                if (comparaDatas(diaDesejado, mesDesejado, anoDesejado,
                    diaRef, mesRef, anoRef)) {
                    break;
                }
                diaRef = 1;
                mesRef++;
            }
            if (comparaDatas(diaDesejado, mesDesejado, anoDesejado,
                diaRef, mesRef, anoRef)) {
                break;
            }
            mesRef = 1;
            anoRef++;
        }

        return contadorDias;
    }

    /**
     * Possui finalidade de subtrair o dia corretamente
     * conferindo corretamente o último dia do mês.
     *
     * @param dia Dia para subtrair.
     * @param mes Mês do dia a ser subtraído.
     * @param ano Ano do dia a ser subtraído.
     * @param anoBissexto Ano bissexto para conferir corretamente
     *                    o último dia do mês de fevereiro.
     *
     * @return Retorna dia subtraído.
     */
    public static int subtraiDia(final int dia, final int mes, final int ano,
    final int anoBissexto) {
        int diaAux = dia;
        final int um = 1;
        if (dia == um) {
            diaAux = getUltimoDiaMes(mes - 1, ano, anoBissexto);
        } else {
            diaAux--;
        }
        return diaAux;
    }

    /**
     * Possui finalidade de subtrair o mês corretamente.
     *
     * @param mes Mês para subtrair.
     *
     * @return Retorna mês subtraído.
     */
    public static int subtraiMes(final int mes) {
        int mesAux = mes;
        final int ultimoMes = 12;
        final int um = 1;
        if (mes == um) {
            mesAux = ultimoMes;
        } else {
            mesAux--;
        }
        return mesAux;
    }

    /**
     * Tem a função de recuar a data referência até a data desejada fazendo
     * uma contagem de dias para calcular o dia da semana da data desejada.
     *
     * @param dataDesejada Data em que se deseja chegar.
     * @param dataRef Data base para recuar e obter contagem de dias.
     * @param anoBissexto Ano bissexto para conferir corretamente
     *                    o último dia do mês de fevereiro.
     *
     * @return Retorna um int contendo a quantidade
     *         de dias recuados até a data desejada.
     */
    public static int recuaData(final String dataDesejada,
    final String dataRef, final int anoBissexto) {
        final int diaDesejado = getDia(dataDesejada);
        final int mesDesejado = getMes(dataDesejada);
        final int anoDesejado = getAno(dataDesejada);
        int diaRef = getDia(dataRef);
        int mesRef = getMes(dataRef);
        int anoRef = getAno(dataRef);
        int contadorDias = 0;

        while (!comparaDatas(diaDesejado, mesDesejado, anoDesejado,
        diaRef, mesRef, anoRef)) {
            for (int contaMes = mesRef; contaMes > 0; contaMes--) {
                for (int contaDia = diaRef; contaDia > 0; contaDia--) {
                    if (comparaDatas(diaDesejado, mesDesejado, anoDesejado,
                        diaRef, mesRef, anoRef)) {
                        break;
                    }
                    diaRef = subtraiDia(diaRef, mesRef, anoRef, anoBissexto);
                    contadorDias++;
                }
                if (comparaDatas(diaDesejado, mesDesejado, anoDesejado,
                    diaRef, mesRef, anoRef)) {
                    break;
                }
                mesRef = subtraiMes(mesRef);
                diaRef = getUltimoDiaMes(mesRef, anoRef, anoBissexto);
            }
            if (comparaDatas(diaDesejado, mesDesejado, anoDesejado,
                diaRef, mesRef, anoRef)) {
                break;
            }
            anoRef--;
        }

        return contadorDias;
    }

    /**
     * Possui finalidade de avançar o dia da semana com base no
     * dia de referência e a quantidade de dias a se avançar.
     *
     * @param dias Quantidade de dias a ser avançado.
     * @param diaDaSemanaRef Dia da semana da data de referência.
     *
     * @return Retorna dia da semana calculado.
     */
    public static int avancaDiaSemana(final int dias,
    final int diaDaSemanaRef) {
        int diaDaSemana = diaDaSemanaRef;
        final int diaMaxInvalido = 7;

        for (int contaDias = 0; contaDias < dias; contaDias++) {
            diaDaSemana++;
            if (diaDaSemana == diaMaxInvalido) {
                diaDaSemana = 0;
            }
        }

        return diaDaSemana;
    }

    /**
     * Possui finalidade de recuar o dia da semana com base no
     * dia de referência e a quantidade de dias a se recuar.
     *
     * @param dias Quantidade de dias a ser recuado.
     * @param diaDaSemanaRef Dia da semana da data de referência.
     *
     * @return Retorna dia da semana calculado.
     */
    public static int recuaDiaSemana(final int dias,
    final int diaDaSemanaRef) {
        int diaDaSemana = diaDaSemanaRef;
        final int diaMaxValido = 6;

        for (int contaDias = 0; contaDias < dias; contaDias++) {
            diaDaSemana--;
            if (diaDaSemana == -1) {
                diaDaSemana = diaMaxValido;
            }
        }

        return diaDaSemana;
    }

    /**
     * Define a maior data entre duas datas passadas como parâmetro.
     *
     * @param dataDesejada Primeira data para ser comparada.
     * @param dataRef Segunda data para ser comparada.
     *
     * @return Retorna 1 para a primeira data maior que a segunda,
     * 0 para as datas iguais e -1 para a segunda data maior que a primeira.
     */
    public static int defineDataMaior(final String dataDesejada, final String dataRef) {
        final int diaDesejado = getDia(dataDesejada);
        final int mesDesejado = getMes(dataDesejada);
        final int anoDesejado = getAno(dataDesejada);
        final int diaRef = getDia(dataRef);
        final int mesRef = getMes(dataRef);
        final int anoRef = getAno(dataRef);

        if (anoDesejado == anoRef) {
            if (mesDesejado == mesRef) {
                if (diaDesejado > diaRef) {
                    return 1;
                } else if (diaDesejado == diaRef) {
                    return 0;
                } else {
                    return -1;
                }
            } else if (mesDesejado > mesRef) {
                return 1;
            } else {
                return -1;
            }
        } else if (anoDesejado > anoRef) {
            return 1;
        } else {
            return -1;
        }
    }

    /**
     * Executa todos os métodos anteriores com finalidade
     * de se obter o dia da semana da data desejada.
     *
     * @param args Argumentos contendo todas as informações necessárias
     *             para se obter dia da semana da data desejada.
     *
     * @return Retorna dia da semana da data desejada
     *         ou -1 caso ocorra algum erro.
     */
    public static int executaEncontraDia(final String[] args) {
        final int um = 1;
        if (ConfereEntradaUtils.executaConfere(args) != um) {
            return -1;
        }

        int resultado = -1;

        final int tres = 3;
        if (defineDataMaior(args[0], args[2]) == 0) {
            resultado = Integer.parseInt(args[tres]);
        }

        if (defineDataMaior(args[0], args[2]) == um) {
            resultado = avancaDiaSemana(avancaData(args[0], args[2],
                                        Integer.parseInt(args[1])), Integer.parseInt(args[tres]));
        }

        if (defineDataMaior(args[0], args[2]) == -1) {
            resultado = recuaDiaSemana(recuaData(args[0], args[2],
                                       Integer.parseInt(args[1])), Integer.parseInt(args[tres]));
        }

        return resultado;
    }
}
