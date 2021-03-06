package com.github.caiobas.es.cs.aula01.domain;

/**
 * Implementação de código referente a aula de Construção de Software,
 * que possui várias funções matemáticas como logaritmo,
 * fatorial, calculo de numero primo, entre outras, com o
 * objetivo de aprender a codificar com boas práticas.
 */
public final class AlgoritmosUtils {

    /**
     * Construtor privado da classe para evitar instanciação.
     */
    private AlgoritmosUtils() {

    }

    /**
     * Função matemática que verifica se o quadrado da soma dos 2 primeiros
     * números com os 2 ultimos é o próprio número.
     *
     * @param numero Número a ser verificado.
     * @return Retorna o valor {@code true} caso satisfaça a
     * propriedade 3025 e o valor {@code false} caso não a satisfaça.
     * @throws IllegalArgumentException Se o número não está entre 0 e 9999.
     */
    public static boolean propriedade3025(final int numero) {
        final int limiteMaximo = 9999;
        if (numero < 0 || numero > limiteMaximo) {
            throw new IllegalArgumentException(
                "Esperado numero entre 0 e 9999.");
        }
        final int auxiliar = 100;
        final int primeiraDezena = numero / auxiliar;
        final int segundaDezena = numero % auxiliar;
        final int resultado = (int) Math.pow(primeiraDezena
                                + segundaDezena, 2);

        return resultado == numero;
    }

    /**
     * Função matemática que verifica se a soma do cubo
     * dos digitos do número é o próprio número.
     *
     * @param numero Número a ser verificado.
     * @return Retorna o valor {@code true} caso satisfaça a
     * propriedade 153 e o valor {@code false} caso não a satisfaça.
     * @throws IllegalArgumentException Se o número não
     * está entre 100 e 999.
     */
    public static boolean propriedade153(final int numero) {
        final int limiteMinimo = 100;
        final int limiteMaximo = 999;
        if (numero < limiteMinimo || numero > limiteMaximo) {
            throw new IllegalArgumentException(
                    "Esperado numero entre 100 e 999.");
        }
        final int auxiliar1 = 100;
        final int auxiliar2 = 10;
        final int auxiliar3 = 3;
        final int centena = numero / auxiliar1;
        final int dezenaAux = numero % auxiliar1;
        final int dezena = dezenaAux / auxiliar2;
        final int unidade = numero % auxiliar2;
        final int resultado = (int) Math.pow(centena, auxiliar3)
        + (int) Math.pow(dezena, auxiliar3)
        + (int) Math.pow(unidade, auxiliar3);

        return resultado == numero;
    }

    /**
     * Função matemática que verifica o
     * dia da semana de uma determinada data.
     *
     * @param dia Dia a ser verificado.
     * @param mes Mês a ser verificado.
     * @param ano Ano a ser verificado.
     * @return Retorna dia da semana.
     */
    public static String diaDaSemana(final int dia,
    final int mes, final int ano) {

        geraExcecaoSeDataInvalida(dia, mes, ano);

        int mesAuxiliar = mes;
        int anoAuxiliar = ano;
        final int janeiro = 1;
        final int fevereiro = 2;
        if (mes == janeiro || mes == fevereiro) {
            final int mesMais = 12;
            final int anoMenos = 1;
            mesAuxiliar = mes + mesMais;
            anoAuxiliar = ano - anoMenos;
        }

        final int auxiliar3 = 3;
        final int auxiliar4 = 4;
        final int auxiliar5 = 5;
        final int auxiliar100 = 100;
        final int auxiliar400 = 400;
        final int resultado = dia + (2 * mesAuxiliar)
        + (auxiliar3 * (mesAuxiliar + 1) / auxiliar5)
        + anoAuxiliar + (anoAuxiliar / auxiliar4)
        - (anoAuxiliar / auxiliar100) + (anoAuxiliar / auxiliar400);

        final int auxiliaResultado = 7;
        return nomeDiaDaSemana(resultado % auxiliaResultado);
    }

    /**
     * Função que gera exceção se a data
     * fornecida estiver invalida.
     *
     * @param dia Dia a ser verificado.
     * @param mes Mês a ser verificado.
     * @param ano Ano a ser verificado.
     *
     * @throws IllegalArgumentException Se qualquer um dos
     * argumentos não estiver dentro dos parâmetros de data.
     */
    private static void geraExcecaoSeDataInvalida(final int dia,
    final int mes, final int ano) {

        confereDiaMaximo30(dia, mes);

        confereDiaMaximoFevereiro(dia, mes, ano);

        final int diaMaximo31 = 31;
        if (dia < 1 || dia > diaMaximo31) {
            throw new IllegalArgumentException(
                "Esperado dia entre 1 e 31.");
        }

        final int mesMaximo = 12;
        if (mes < 1 || mes > mesMaximo) {
            throw new IllegalArgumentException(
                "Esperado mes entre 1 e 12.");
        }

        final int anoMaximo = 1754;
        if (ano < anoMaximo) {
            throw new IllegalArgumentException(
                "Esperado ano maior ou igual a 1953.");
        }
    }

    /**
     * Método que confere os meses que terminam no dia 30.
     *
     * @param dia Contém o dia a ser analisado.
     * @param mes Contém o mês a ser analisado.
     *
     * @throws IllegalArgumentException Se o dia não estiver
     * entre 1 e 30 no mês analisado.
     */
    private static void confereDiaMaximo30(final int dia,
    final int mes) {
        final int diaMaximo30 = 30;
        final int abril = 4;
        final int junho = 6;
        final int setembro = 9;
        final int novembro = 11;
        if (mes == abril || mes == junho || mes == setembro
        || mes == novembro && dia > diaMaximo30) {
            throw new IllegalArgumentException(
                "Dia deve ser entre 1 e 30 neste mes.");
        }
    }

    /**
     * Método que confere os meses que terminam no dia 30.
     *
     * @param dia Contém o dia a ser analisado.
     * @param mes Contém o mês a ser analisado.
     * @param ano Contém o ano a ser analisado.
     *
     * @throws IllegalArgumentException Se o dia  em fevereiro não estiver
     * entre 1 e 29 em ano bissesto, e entre 1 e 28 em ano não bissesto.
     */
    private static void confereDiaMaximoFevereiro(final int dia,
    final int mes, final int ano) {
        final int fevereiro = 2;
        final int diaMaximo29 = 29;
        final int confereBissesto = 4;
        if (dia > diaMaximo29 && mes == fevereiro && ano % confereBissesto == 0) {
            throw new IllegalArgumentException(
                "Esperado dia entre 1 e 29"
                + " no mês de Fevereiro deste ano.");
        }

        final int diaMaximo28 = 28;
        if (dia > diaMaximo28 && mes == fevereiro && ano % confereBissesto != 0) {
            throw new IllegalArgumentException(
                "Esperado dia entre 1 e 28"
                + " no mês de Fevereiro deste ano.");
        }
    }

    /**
     * Função que retorna o dia da semana baseado no resultado da função
     * {@link #diaDaSemana(int, int, int)}.
     * @see #diaDaSemana(int, int, int)
     *
     * @param dia utilizado para identificar dia da semana.
     * @return Retorna dia da semana.
     */
    public static String nomeDiaDaSemana(final int dia) {
        final String[] nomeDoDiaDaSemana = {"Segunda-feira", "Terca-feira",
        "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sabado",
        "Domingo"};
         return nomeDoDiaDaSemana[dia];
    }

    /**
     * Função matemática que calcula resto de divisão inteira.
     *
     * @param dividendo Dividendo a ser verificado.
     * @param divisor   Divisor a ser verificado.
     * @return Retorna resto da divisão inteira.
     * @throws IllegalArgumentException Se o divisor não for maior que 0
     * e dividendo não for maior ou igual a 0.
     */
    public static int restoDivisao(final int dividendo, final int divisor) {

        if (dividendo < 0) {
            throw new IllegalArgumentException(
                    "Divisor não pode ser menor que 0.");
        }
        if (divisor <= 0) {
            throw new IllegalArgumentException(
                    "Divisor não pode ser maior que 0.");
        }

        int resto = dividendo;

        while (resto >= divisor) {
            resto = resto - divisor;
        }

        return resto;
    }

    /**
     * Função matemática que calcula a soma
     * dos números naturais até o parâmetro.
     *
     * @param numero Número limite para a soma.
     * @return Retorna a soma dos números naturais até o parâmetro.
     * @throws IllegalArgumentException Se o número não for maior que 1.
     */
    public static int somaPrimeirosNaturais(final int numero) {
        final int limiteMinimo = 1;

        if (numero < limiteMinimo) {
            throw new IllegalArgumentException(
                "Esperado numero maior que 0.");
        }

        int soma = 1;

        for (int contador = 2; contador <= numero; contador++) {
            soma = soma + contador;
        }

        return soma;
    }

    /**
     * Função matemática que calcula o fatorial de um número natural.
     *
     * @param numero Número limite para o fatorial.
     * @return Retorna o fatorial do parâmetro.
     * @throws IllegalArgumentException Se o número não for maior que 1.
     */
    public static int fatorial(final int numero) {
        final int limiteMinimo = 1;

        if (numero < limiteMinimo) {
            throw new IllegalArgumentException(
                "Esperado numero maior que 0.");
        }

        int fatorial = 1;

        for (int contador = 2; contador <= numero; contador++) {
            fatorial = fatorial * contador;
        }

        return fatorial;
    }

    /**
     * Função matemática que calcula o produto de inteiro usando somas.
     *
     * @param multiplicador Número usado para calcular produto.
     * @param multiplicando Número usado para calcular produto.
     * @return Retorna o produto dos números.
     * @throws IllegalArgumentException Se multiplicador e multiplicando
     * não forem maiores ou iguais a 0.
     */
    public static int produtoUsandoSomas(final int multiplicador,
    final int multiplicando) {

        if (multiplicador < 0 || multiplicando < 0) {
            throw new IllegalArgumentException(
                "Esperado numero maior ou igual a 0.");
        }

        int totalParcelas = multiplicador;
        int parcela = multiplicando;

        if (multiplicando < multiplicador) {
            totalParcelas = multiplicando;
            parcela = multiplicador;
        }

        int produto = 0;

        for (int contador = 1; contador <= totalParcelas; contador++) {
            produto = produto + parcela;
        }

        return produto;
    }

    /**
     * Função matemática que calcula a potência usando somas.
     *
     * @param base Número natural a ser elevado.
     * @param expoente Potência do número.
     * @return Retorna o resultado da potência.
     * @throws IllegalArgumentException Se base e expoente
     * não forem maiores ou igual a 0.
     */
    public static int potenciaUsandoSomas(final int base,
    final int expoente) {

        if (base < 0 || expoente < 0) {
            throw new IllegalArgumentException(
                "Esperado numero maior ou igual a 0.");
        }

        int potencia = 1;

        for (int contador = 1; contador <= expoente; contador++) {
            potencia = produtoUsandoSomas(potencia, base);
        }

        return potencia;
    }

    /**
     * Função matemática que calcula o valor com mais proximidade
     * de PI de acordo com quanto maior for o parâmetro.
     *
     * @param precisao Número utilizado para determinar maior
     * proximidade do valor de PI.
     * @return Retorna valor aproximado de PI.
     * @throws IllegalArgumentException Se a precisao
     * não for maior ou igual a 1.
     */
    public static double valorPI(final int precisao) {
        final int limiteMinimo = 1;

        if (precisao < limiteMinimo) {
            throw new IllegalArgumentException(
            "Esperado numero maior ou igual a 1.");
        }

        double sinal = -1;
        double divisor = -1;
        double piValor = 0;

        for (int contador = 1; contador <= precisao; contador++) {
            final int auxiliar = 4;
            divisor = divisor + 2;
            sinal = -1 * sinal;
            piValor = piValor + ((auxiliar * sinal) / divisor);
        }

        return piValor;
    }

    /**
     * Função matemática que calcula a proximidade do logaritmo natural.
     *
     * @param log n Numerador do logaritmo.
     * @param limite Número utilizado para proximidade do logaritmo natural.
     * @return Retorna valor mais próximo do logaritmo natural.
     * @throws IllegalArgumentException Se log não for
     * maior ou igual a 1 ou limite não for maior ou igual a 2.
     */
    public static double logaritmo(final int log, final int limite) {

        if (log < 1 || limite < 2) {
            throw new IllegalArgumentException(
                    "Esperado log maior ou igual a 1"
                    + " e limite maior ou igual a 2.");
        }

        int contador = 2;
        double euler = contador + log;
        double numerador = log;
        double denominador = 1;

        for (; contador <= limite; contador++) {
            numerador = numerador * numerador;
            denominador = denominador * contador;
            euler = euler + (numerador / denominador);
        }

        return euler;
    }

    /**
     * Função matemática que calcula a razão áurea.
     *
     * @param anterior Número para calcular razão áurea.
     * @param posterior Número para calcular razão áurea.
     * @param limite Precisão da razão áurea.
     * @return Retorna valor da razão áurea.
     * @throws IllegalArgumentException Se anterior não for
     * maior ou igual a 0, se posterior não for
     * maior que anterior ou se limite não for maior que 0.
     */
    public static double razaoAurea(final int anterior,
    final int posterior, final int limite) {

        if (anterior < 0 || posterior < anterior || limite <= 0) {
            throw new IllegalArgumentException(
                    "Esperado anterior maior ou igual"
                    + " a 0, posterior maior que anterior"
                    + " e limite maior que 0.");
        }

        double auxiliarPosterior = posterior;
        double auxiliarAnterior = anterior;

        for (int contador = 1; contador <= limite; contador++) {
            final double troca = auxiliarPosterior;
            auxiliarPosterior = auxiliarPosterior
                    + auxiliarAnterior;
            auxiliarAnterior = troca;
        }

        return auxiliarPosterior / auxiliarAnterior;
    }

    /**
     * Função matemática que confere se o número é quadrado perfeito.
     *
     * @param numero Número para conferir se é quadrado perfeito.
     * @return Retorna o valor {@code true} se for um quadrado
     * perfeito, e o valor {@code false} caso não seja.
     * @throws IllegalArgumentException Se numero não
     * for maior ou igual a 1.
     */
    public static boolean quadradoPerfeito(final int numero) {
        final int limiteMinimo = 1;

        if (numero < limiteMinimo) {
            throw new IllegalArgumentException(
                "Esperado numero maior ou igual a 1.");
        }

        int incremental = 1;
        int resultado = 1;

        while (resultado < numero) {
            incremental = incremental + 2;
            resultado = resultado + incremental;
        }

        return resultado == numero;
    }

    /**
     * Função matemática que calcula o valor mais próximo da raiz quadrada.
     *
     * @param numero Número para calculo da raiz quadrada.
     * @param precisao Número para proximidade de raiz quadrada.
     * @return Retorna número mais próximo da raiz quadrada.
     * @throws IllegalArgumentException Se numero
     * não for maior ou igual a 1.
     */
    public static double raizQuadrada(final int numero,
    final int precisao) {
        final int limiteMinimo = 1;

        if (numero < limiteMinimo) {
            throw new IllegalArgumentException(
                "Esperado numero maior que 0.");
        }

        double raiz = 1;

        int auxiliarPrecisao = precisao;
        while (auxiliarPrecisao >= 0) {
            raiz = (raiz + numero / raiz) / 2;
            auxiliarPrecisao = auxiliarPrecisao - 1;
        }

        return raiz;
    }

    /**
     * Função matemática que confere se o número é primo.
     *
     * @param numero Número para conferir se é número primo.
     * @return Retorna o valor {@code true} se for um número
     * primo e o valor {@code false} caso não seja.
     * @throws IllegalArgumentException Se numero
     * não for maior ou igual a 1.
     */
    public static boolean numeroPrimo(final int numero) {
        final int limiteMinimo = 2;

        if (numero < limiteMinimo) {
            throw new IllegalArgumentException(
                "Esperado numero maior que 1.");
        }

        for (int contador = 2; contador < numero; contador++) {
            if (numero % contador == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Função matemática que verifica se o número é primo.
     *
     * @param numero Número para conferir se é número primo.
     * @return Retorna o valor {@code true} se for um número
     * primo e o valor {@code false} caso não seja.
     * @throws IllegalArgumentException Se numero
     * não for maior ou igual a 2.
     */
    public static boolean crivoErastotenes(final int numero) {
        final int limiteMinimo = 2;

        if (numero < limiteMinimo) {
            throw new IllegalArgumentException(
                "Esperado numero maior que 1.");
        }

        int[] vetor = new int[numero + 1];

        for (int contador = 1; contador < numero + 1; contador++) {
            vetor[contador] = 0;
        }

        final double limite = Math.floor(Math.sqrt(numero));

        for (int contador = 2; contador <= limite; contador++) {
            if (vetor[contador] == 0) {
                int multiplo = contador + contador;
                while (multiplo <= numero) {
                    vetor[multiplo] = 1;
                    multiplo = multiplo + contador;
                }
            }
        }

        return vetor[numero] == 1;
    }

    /**
     * Função matemática que calcula maior divisor comum.
     *
     * @param numeroUm Número para cálculo do maior divisor comum.
     * @param numeroDois Número para cálculo do maior divisor comum.
     * @return Retorna maior divisor comum.
     * @throws IllegalArgumentException Se numeroUm não for
     * maior ou igual a numeroDois ou se numeroDois não for maior que 0.
     */
    public static int mdc1(final int numeroUm, final int numeroDois) {

        if (numeroUm < numeroDois || numeroDois < 1) {
            throw new IllegalArgumentException(
                    "Esperado numeroUm maior ou"
                    + " igual a numeroDois e"
                    + " numeroDois maior que 0.");
        }

        int auxiliarUm = numeroUm;
        int auxiliarDois = numeroDois;
        while (auxiliarDois != 0) {
            final int troca = auxiliarUm % auxiliarDois;
            auxiliarUm = auxiliarDois;
            auxiliarDois = troca;
        }

        return auxiliarUm;
    }

    /**
     * Função matemática que calcula maior divisor comum.
     *
     * @param numeroUm Número para cálculo do maior divisor comum.
     * @param numeroDois Número para cálculo do maior divisor comum.
     * @return Retorna maior divisor comum.
     * @throws IllegalArgumentException Se numeroUm não for
     * maior ou igual a numeroDois ou se numeroDois não for maior que 0.
     */
    public static int mdc2(final int numeroUm, final int numeroDois) {

        if (numeroUm < numeroDois || numeroDois < 1) {
            throw new IllegalArgumentException(
                    "Esperado numeroUm maior"
                    + " ou igual a numeroDois"
                    + " e numeroDois maior que 0.");
        }

        int auxiliarUm = numeroUm;
        int auxiliarDois = numeroDois;
        while (auxiliarUm != auxiliarDois) {
            if (auxiliarUm > auxiliarDois) {
                auxiliarUm = auxiliarUm
                        - auxiliarDois;
            } else {
                auxiliarDois = auxiliarDois
                        - auxiliarUm;
            }
        }

        return auxiliarUm;
    }

    /**
     * Função matemática com a regra de Horner para avaliação de polinômio.
     *
     * @param valor Número para cálculo da regra de Horner.
     * @param total Número para cálculo da regra de Horner.
     * @param vetor Vetor para cálculo da regra de Horner.
     * @return Retorna regra de Horner.
     * @throws IllegalArgumentException Se total não for maior ou igual a 1.
     */
    public static double regraHorner(final double valor,
    final int total, final int[] vetor) {
        final int limiteMinimo = 1;

        if (total < limiteMinimo) {
            throw new IllegalArgumentException(
                "Esperado total maior ou igual a 1.");
        }

        double polinomio = vetor[total];

        for (int contador = total - 1; contador >= 0; contador--) {
            polinomio = polinomio * (valor + vetor[contador]);
        }

        return polinomio;
    }

    /**
     * Função matemática para o cálculo de Fibonacci.
     *
     * @param numero Número para cálculo de Fibonacci.
     * @return Retorna número de Fibonacci.
     * @throws IllegalArgumentException Se numero não
     * for maior ou igual a 0.
     */
    public static int fibonacci(final int numero) {

        if (numero < 0) {
            throw new IllegalArgumentException(
                "Esperado numero maior ou igual a 0.");
        }

        if (numero == 0 || numero == 1) {
            return numero;
        }

        int auxiliar = 0;
        int resultado = 1;

        for (int contador = 2; contador <= numero; contador++) {
            final int troca = resultado;
            resultado = resultado + auxiliar;
            auxiliar = troca;
        }

        return resultado;
    }

    /**
     * Função matemática para conferir CPF.
     *
     * @param vetor Array com digitos para conferir.
     * @return Retorna o valor {@code true} se for um cpf válido
     * e o valor {@code false} caso não seja.
     */
    public static boolean cpf1(final int[] vetor) {

        geraExcecaoSeCpfInvalido(vetor);

        final int auxiliar3 = 3;
        final int auxiliar4 = 4;
        final int auxiliar5 = 5;
        final int auxiliar6 = 6;
        final int auxiliar7 = 7;
        final int auxiliar8 = 8;
        final int auxiliar9 = 9;
        final int auxiliar10 = 10;
        final int auxiliar11 = 11;

        final int comparaUm = vetor[0]
        + 2 * (vetor[1])
        + auxiliar3 * (vetor[2])
        + auxiliar4 * (vetor[auxiliar3])
        + auxiliar5 * (vetor[auxiliar4])
        + auxiliar6 * (vetor[auxiliar5])
        + auxiliar7 * (vetor[auxiliar6])
        + auxiliar8 * (vetor[auxiliar7])
        + auxiliar9 * (vetor[auxiliar8]);
        final int comparaDois = vetor[1]
        + 2 * (vetor[2])
        + auxiliar3 * (vetor[auxiliar3])
        + auxiliar4 * (vetor[auxiliar4])
        + auxiliar5 * (vetor[auxiliar5])
        + auxiliar6 * (vetor[auxiliar6])
        + auxiliar7 * (vetor[auxiliar7])
        + auxiliar8 * (vetor[auxiliar8])
        + auxiliar9 * (vetor[auxiliar9]);
        final int vetorComparaUm = Math.floorMod(
            Math.floorMod(comparaUm, auxiliar11), auxiliar10);
        final int vetorComparaDois = Math.floorMod(
            Math.floorMod(comparaDois, auxiliar11), auxiliar10);

        return vetorComparaUm == vetor[auxiliar9]
            && vetorComparaDois == vetor[auxiliar10];
    }

    /**
     * Função matemática para conferir CPF.
     *
     * @param vetor Array com digitos para conferir.
     * @return Retorna o valor {@code true} se for um cpf válido
     * e o valor {@code false} caso não seja.
     */
    public static boolean cpf2(final int[] vetor) {

        geraExcecaoSeCpfInvalido(vetor);

        final int auxiliar7 = 7;
        final int auxiliar8 = 8;
        final int auxiliar9 = 9;
        final int auxiliar10 = 10;
        final int auxiliar11 = 11;

        int auxiliaValorUm = vetor[auxiliar8];
        int auxiliaValorDois = vetor[auxiliar8];

        for (int contador = auxiliar7; 0 <= contador; contador--) {
            auxiliaValorUm = auxiliaValorUm + vetor[contador];
            auxiliaValorDois = auxiliaValorDois + auxiliaValorUm;
        }

        final int comparaUm = Math.floorMod(
            Math.floorMod(auxiliaValorDois, auxiliar11),
            auxiliar10);
        final int comparaDois = Math.floorMod(
            Math.floorMod(auxiliaValorDois - auxiliaValorUm
            + (auxiliar9 * vetor[auxiliar9]), auxiliar11),
            auxiliar10);

        return comparaUm == vetor[auxiliar9]
        && comparaDois == vetor[auxiliar10];
    }

    /**
     * Função matemática para conferir CPF.
     *
     * @param vetor Array com digitos para conferir.
     * @throws IllegalArgumentException Se o parâmetro
     * não for um vetor ou se o vetor tiver tamanho incorreto.
     */
    public static void geraExcecaoSeCpfInvalido(final int[] vetor) {

        if (vetor == null) {
            throw new IllegalArgumentException("Argumento null");
        }

        final int auxiliar11 = 11;

        if (vetor.length != auxiliar11) {
            throw new IllegalArgumentException(
                "CPF deve ter exatos 11 digitos");
        }

        final int auxiliar9 = 9;

        for (int contador = 0; contador < auxiliar11; contador++) {
            if (vetor[contador] < 0
            || vetor[contador] > auxiliar9) {
                throw new IllegalArgumentException(
                    "Dados fora de exigencia pedida.");
            }
        }
    }
}
