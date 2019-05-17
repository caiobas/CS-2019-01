package com.github.caiobas.es.cs.aula01.domain;

/**
 * Implementação de código referente a aula de Construção de Software.
 */
public class Algoritmos {
	/**
	 * Apenas para fim de cobertura.
	 */
	protected Algoritmos() {

	}

	/**
	 * Função matemática que verifica se o quadrado da soma dos 2 primeiros
	 * números com os 2 ultimos é o próprio número.
	 *
	 * @param numero Número a ser verificado.
	 * @return Retorna booleano para verificação.
	 * @throws IllegalArgumentException Se o número não está entre 0 e 9999.
	 */
    public static boolean propriedade3025(final int numero) {
		final int limiteMaximo = 9999;
		if (numero < 0 || numero > limiteMaximo) {
			throw new IllegalArgumentException(
				"Numero fora da exigencia:" + numero
				+ " Esperado numero entre 0 e 9999.");
		}
		final int auxiliar = 100;
		final int primDez = numero / auxiliar;
		final int segDez = numero % auxiliar;
		final int resultado = (int) Math.pow(primDez + segDez, 2);

		return resultado == numero;
	}

	/**
	 * Função matemática que verifica se a soma do cubo
	 * dos digitos do número é o próprio número.
	 *
	 * @param numero Número a ser verificado.
	 * @return Retorna booleano para verificação.
	 * @throws IllegalArgumentException Se o número não
	 * está entre 100 e 999.
	 */
	public static boolean propriedade153(final int numero) {
		final int limiteMinimo = 100;
		final int limiteMaximo = 999;
		if (numero < limiteMinimo || numero > limiteMaximo) {
			throw new IllegalArgumentException(
					"Numero fora da exigencia:" + numero
					+ " Esperado numero entre 100 e 999.");
		}
		final int auxiliar1 = 100;
		final int auxiliar2 = 10;
		final int centena = numero / auxiliar1;
		final int dezenaAux = numero % auxiliar1;
		final int dezena = dezenaAux / auxiliar2;
		final int unidade = numero % auxiliar2;
		final int resultado = (int) Math.pow(centena, 3)
		+ (int) Math.pow(dezena, 3) + (int) Math.pow(unidade, 3);

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
	 * @throws IllegalArgumentException Se qualquer um dos
	 * argumentos não estiver dentro dos parâmetros de data.
	 */
	public static String diaDaSemana(final int dia,
	final int mes, final int ano) {

		final int diaMaximo = 31;
		if (dia < 1 || dia > diaMaximo) {
			throw new IllegalArgumentException(
				"Dia fora da exigencia:" + dia
				+ " Esperado dia entre 1 e 31.");
		}

		final int mesMaximo = 12;
		if (mes < 1 || mes > mesMaximo) {
			throw new IllegalArgumentException(
				"Mes fora da exigencia:" + mes
				+ " Esperado mes entre 1 e 12.");
		}

		final int anoMaximo = 1754;
		if (ano < anoMaximo) {
			throw new IllegalArgumentException(
				"Ano fora da exigencia:" + ano
				+ " Esperado ano maior ou igual a 1953.");
		}

		int mesAuxiliar = mes;
		int anoAuxiliar = ano;
		if (mes == 1 || mes == 2) {
			final int mesMais = 12;
			final int anoMenos = 1;
			mesAuxiliar = mes + mesMais;
			anoAuxiliar = ano - anoMenos;
		}

		final int resultado = dia + (2 * mesAuxiliar)
		+ (3 * (mesAuxiliar + 1) / 5) + anoAuxiliar + (anoAuxiliar / 4)
		- (anoAuxiliar / 100) + (anoAuxiliar / 400);

		final int auxiliaResultado = 7;
		return nomeDiaDaSemana(resultado % auxiliaResultado);
	}

	/**
	 * Função que retorna o dia da semana baseado no resultado da função
	 * diaDaSemana.
	 *
	 * @param resultado utilizado para identificar dia da semana.
	 * @return Retorna dia da semana.
	 * @throws IllegalArgumentException Se o argumento conter
	 * valor incorreto para análise.
	 */
	public static String nomeDiaDaSemana(final int resultado) {
		final int auxiliarSegunda = 0;
		final int auxiliarTerca = 1;
		final int auxiliarQuarta = 2;
		final int auxiliarQuinta = 3;
		final int auxiliarSexta = 4;
		final int auxiliarSabado = 5;
		final int auxiliarDomingo = 6;
		switch (resultado) {
		case auxiliarSegunda:
			return "Segunda-feira";
		case auxiliarTerca:
			return "Terca-feira";
		case auxiliarQuarta:
			return "Quarta-feira";
		case auxiliarQuinta:
			return "Quinta-feira";
		case auxiliarSexta:
			return "Sexta-feira";
		case auxiliarSabado:
			return "Sabado";
		case auxiliarDomingo:
			return "Domingo";
		default:
			throw new IllegalArgumentException(
				"Valor incorreto para analise de dia.");
		}
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
					"Dividendo fora da exigencia:"
					+ dividendo
					+ " Não pode ser menor que 0.");
		}
		if (divisor <= 0) {
			throw new IllegalArgumentException(
					"Divisor fora da exigencia:" + divisor
					+ " Esperado divisor maior que 0.");
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

		if (numero < 1) {
			throw new IllegalArgumentException(
				"Numero fora da exigencia:" + numero
				+ " Esperado numero maior que 0.");
		}

		int s = 1;

		for (int i = 2; i <= numero; i++) {
			s = s + i;
		}

		return s;
	}

	/**
	 * Função matemática que calcula o fatorial de um número natural.
	 *
	 * @param numero Número limite para o fatorial.
	 * @return Retorna o fatorial do parâmetro.
	 * @throws IllegalArgumentException Se o número não for maior que 1.
	 */
	public static int fatorial(final int numero) {

		if (numero < 1) {
			throw new IllegalArgumentException(
				"Numero fora da exigencia:" + numero
				+ " Esperado numero maior que 0.");
		}

		int f = 1;

		for (int i = 2; i <= numero; i++) {
			f = f * i;
		}

		return f;
	}

	/**
	 * Função matemática que calcula o produto de inteiro usando somas.
	 *
	 * @param a Número usado para calcular produto.
	 * @param b Número usado para calcular produto.
	 * @return Retorna o produto dos números.
	 * @throws IllegalArgumentException Se a e bs
	 * não forem maiores ou iguais a 0.
	 */
	public static int produtoUsandoSomas(final int a, final int b) {

		if (a < 0 || b < 0) {
			throw new IllegalArgumentException(
				"Numero fora da exigencia. "
				+ " Esperado numero maior ou igual a 0.");
		}

		int totalParcelas = a;
		int parcela = b;

		if (b < a) {
			totalParcelas = b;
			parcela = a;
		}

		int s = 0;

		for (int i = 1; i <= totalParcelas; i++) {
			s = s + parcela;
		}

		return s;
	}

	/**
	 * Função matemática que calcula a potência usando somas.
	 *
	 * @param x Número natural a ser elevado.
	 * @param y Potência do número.
	 * @return Retorna o resultado da potência.
	 * @throws IllegalArgumentException Se x e y
	 * não forem maiores ou igual a 0.
	 */
	public static int potenciaUsandoSomas(final int x, final int y) {

		if (x < 0 || y < 0) {
			throw new IllegalArgumentException(
				"Numero fora da exigencia."
				+ " Esperado numero maior ou igual a 0.");
		}

		int potencia = 1;

		for (int i = 1; i <= y; i++) {
			potencia = produtoUsandoSomas(potencia, x);
		}

		return potencia;
	}

	/**
	 * Função matemática que calcula o valor com mais proximidade
	 * de PI de acordocom quanto maior for o parâmetro.
	 *
	 * @param n Número utilizado para determinar maior
	 * proximidade do valor de PI.
	 * @return Retorna valor aproximado de PI.
	 * @throws IllegalArgumentException Se o numero
	 * não for maior ou igual a 1.
	 */
	public static double valorPI(final int n) {

		if (n < 1) {
			throw new IllegalArgumentException(
				"Numero fora da exigencia."
			+ " Esperado numero maior ou igual a 1.");
		}

		double s = -1;
		double d = -1;
		double p = 0;

		for (int i = 1; i <= n; i++) {
			final int auxiliar = 4;
			d = d + 2;
			s = -1 * s;
			p = p + ((auxiliar * s) / d);
		}

		return p;
	}

	/**
	 * Função matemática que calcula a proximidade do logaritmo natural.
	 *
	 * @param n n Numerador do logaritmo.
	 * @param k Número utilizado para proximidade do logaritmo natural.
	 * @return Retorna valor mais próximo do logaritmo natural.
	 * @throws IllegalArgumentException Se n não for
	 * maior ou igual a 1 ou k não for maior ou igual a 2.
	 */
	public static double logaritmo(final int n, final int k) {

		if (n < 1 || k < 2) {
			throw new IllegalArgumentException(
					"Numero fora da exigencia."
					+ " Esperado n maior ou igual a 1"
					+ " e k maior ou igual a 2.");
		}

		int i = 2;
		double e = (i + n);
		double numerador = n;
		double denominador = 1;

		for (; i <= k; i++) {
			numerador = numerador * numerador;
			denominador = denominador * i;
			e = e + (numerador / denominador);
		}

		return e;
	}

	/**
	 * Função matemática que calcula a razão áurea.
	 *
	 * @param x Número para calcular razão áurea.
	 * @param y Número para calcular razão áurea.
	 * @param k Precisão da razão áurea.
	 * @return Retorna valor da razão áurea.
	 * @throws IllegalArgumentException Se x não for
	 * maior ou igual a 0, se y não for
	 * maior que x ou se k não for maior que 0.
	 */
	public static double razaoAurea(final int x, final int y, final int k) {

		if (x < 0 || y < x || k <= 0) {
			throw new IllegalArgumentException(
					"Numero fora da exigencia."
					+ " Esperado x maior ou igual a 0,"
					+ " y maior que x e k maior que 0.");
		}

		double c = y;
		double a = x;

		for (int i = 1; i <= k; i++) {
			double t = c;
			c = c + a;
			a = t;
		}

		return c / a;
	}

	/**
	 * Função matemática que confere se o número é quadrado perfeito.
	 *
	 * @param n Número para conferir se é quadrado perfeito.
	 * @return Retorna booleano se é quadrado perfeito.
	 * @throws IllegalArgumentException Se n não for maior ou igual a 1.
	 */
	public static boolean quadradoPerfeito(final int n) {

		if (n < 1) {
			throw new IllegalArgumentException(
				"Numero fora da exigencia."
				+ " Esperado n maior ou igual a 1.");
		}

		int i = 1;
		int s = 1;

		while (s < n) {
			i = i + 2;
			s = s + i;
		}

		return s == n;
	}

	/**
	 * Função matemática que calcula o valor mais próximo da raiz quadrada.
	 *
	 * @param n Número para calculo da raiz quadrada.
	 * @param i Número para proximidade de raiz quadrada.
	 * @return Retorna número mais próximo da raiz quadrada.
	 * @throws IllegalArgumentException Se n não for maior ou igual a 1.
	 */
	public static double raizQuadrada(final int n, final int i) {

		if (n < 1) {
			throw new IllegalArgumentException(
				"Numero fora da exigencia."
				+ " Esperado n maior que 0.");
		}

		double r = 1;

		int auxiliari = i;
		while (auxiliari >= 0) {
			r = (r + n / r) / 2;
			auxiliari = auxiliari - 1;
		}

		return r;
	}

	/**
	 * Função matemática que confere se o número é primo.
	 *
	 * @param n Número para conferir se é número primo.
	 * @return Retorna booleano se é número primo.
	 * @throws IllegalArgumentException Se n não for maior ou igual a 1.
	 */
	public static boolean numeroPrimo(final int n) {

		if (n < 2) {
			throw new IllegalArgumentException(
				"Numero fora da exigencia."
				+ " Esperado n maior que 1.");
		}

		for (int i = 2; i < n; i++) {
			if ((n % i) == 0) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Função matemática que verifica se o número é primo.
	 *
	 * @param n Número para conferir se é número primo.
	 * @return Retorna booleano se é número primo.
	 * @throws IllegalArgumentException Se n não for maior ou igual a 2.
	 */
	public static boolean crivoErastotenes(final int n) {

		if (n < 2) {
			throw new IllegalArgumentException(
				"Numero fora da exigencia."
				+ " Esperado n maior que 1.");
		}

		int[] a = new int[n + 1];

		for (int i = 1; i < n + 1; i++) {
			a[i] = 0;
		}

		double limite = Math.floor(Math.sqrt(n));

		for (int i = 2; i <= limite; i++) {
			if (a[i] == 0) {
				int multiplo = i + i;
				while (multiplo <= n) {
					a[multiplo] = 1;
					multiplo = multiplo + i;
				}
			}
		}

		return a[n] == 1;
	}

	/**
	 * Função matemática que calcula maior divisor comum.
	 *
	 * @param a Número para cálculo do maior divisor comum.
	 * @param b Número para cálculo do maior divisor comum.
	 * @return Retorna maior divisor comum.
	 * @throws IllegalArgumentException Se a não for
	 * maior ou igual a b ou se b não for maior que 0.
	 */
	public static int mdc1(final int a, final int b) {

		if (a < b || b < 1) {
			throw new IllegalArgumentException(
					"Numero fora da exigencia."
					+ " Esperado a maior ou"
					+ " igual a b e b maior que 0.");
		}

		int auxiliara = a;
		int auxiliarb = b;
		while (auxiliarb != 0) {
			int m = auxiliara % auxiliarb;
			auxiliara = auxiliarb;
			auxiliarb = m;
		}

		return a;
	}

	/**
	 * Função matemática que calcula maior divisor comum.
	 *
	 * @param a Número para cálculo do maior divisor comum.
	 * @param b Número para cálculo do maior divisor comum.
	 * @return Retorna maior divisor comum.
	 * @throws IllegalArgumentException Se a não for
	 * maior ou igual a b ou se b não for maior que 0.
	 */
	public static int mdc2(final int a, final int b) {

		if (a < b || b < 1) {
			throw new IllegalArgumentException(
					"Numero fora da exigencia."
					+ " Esperado a maior ou igual a b"
					+ " e b maior que 0.");
		}

		int auxiliara = a;
		int auxiliarb = b;
		while (auxiliara != b) {
			if (auxiliara > auxiliarb) {
				auxiliara = auxiliara - auxiliarb;
			} else {
				auxiliarb = auxiliarb - auxiliara;
			}
		}

		return a;
	}

	/**
	 * Função matemática com a regra de Horner para avaliação de polinômio.
	 *
	 * @param x Número para cálculo da regra de Horner.
	 * @param g Número para cálculo da regra de Horner.
	 * @param a Vetor para cálculo da regra de Horner.
	 * @return Retorna regra de Horner.
	 * @throws IllegalArgumentException Se g não for maior ou igual a 1.
	 */
	public static double regraHorner(final double x,
	final int g, final int[] a) {

		if (g < 1) {
			throw new IllegalArgumentException(
				"Numero fora da exigencia."
				+ " Esperado g maior ou igual a 1.");
		}

		double p = a[g];

		for (int i = (g - 1); i >= 0; i--) {
			p = p * (x + a[i]);
		}

		return p;
	}

	/**
	 * Função matemática para o cálculo de Fibonacci.
	 *
	 * @param n Número para cálculo de Fibonacci.
	 * @return Retorna número de Fibonacci.
	 * @throws IllegalArgumentException Se n não
	 * for maior ou igual a 0.
	 */
	public static int fibonacci(final int n) {

		if (n < 0) {
			throw new IllegalArgumentException(
				"Numero fora da exigencia."
				+ " Esperado n maior ou igual a 0.");
		}

		if (n == 0 || n == 1) {
			return n;
		}

		int a = 0;
		int c = 1;

		for (int i = 2; i <= n; i++) {
			int t = c;
			c = c + a;
			a = t;
		}

		return c;
	}

	/**
	 * Função matemática para conferir CPF.
	 *
	 * @param d Array com digitos para conferir.
	 * @return Retorna booleano se é CPF.
	 */
	public static boolean cpf1(final int[] d) {

		geraExcecaoSeCpfInvalido(d);

		final int auxiliar3 = 3;
		final int auxiliar4 = 4;
		final int auxiliar5 = 5;
		final int auxiliar6 = 6;
		final int auxiliar7 = 7;
		final int auxiliar8 = 8;
		final int auxiliar9 = 9;
		final int auxiliar10 = 10;
		final int auxiliar11 = 11;

		final int j = d[0] + 2 * (d[1]) + auxiliar3 * (d[2])
		+ auxiliar4 * (d[auxiliar3]) + auxiliar5 * (d[auxiliar4])
		+ auxiliar6 * (d[auxiliar5]) + auxiliar7 * (d[auxiliar6])
		+ auxiliar8 * (d[auxiliar7]) + auxiliar9 * (d[auxiliar8]);
		final int k = d[1] + 2 * (d[2]) + auxiliar3 * (d[auxiliar3])
		+ auxiliar4 * (d[auxiliar4]) + auxiliar5 * (d[auxiliar5])
		+ auxiliar6 * (d[auxiliar6]) + auxiliar7 * (d[auxiliar7])
		+ auxiliar8 * (d[auxiliar8]) + auxiliar9 * (d[auxiliar9]);
		final int dj = Math.floorMod(
			Math.floorMod(j, auxiliar11), auxiliar10);
		final int dk = Math.floorMod(
			Math.floorMod(k, auxiliar11), auxiliar10);

		return (dj == d[auxiliar9]) && (dk == d[auxiliar10]);
	}

	/**
	 * Função matemática para conferir CPF.
	 *
	 * @param d Array com digitos para conferir.
	 * @return Retorna booleano se é CPF.
	 */
	public static boolean cpf2(final int[] d) {

		geraExcecaoSeCpfInvalido(d);

		final int auxiliar7 = 7;
		final int auxiliar8 = 8;
		final int auxiliar9 = 9;
		final int auxiliar10 = 10;
		final int auxiliar11 = 11;

		int p = d[auxiliar8];
		int s = d[auxiliar8];

		for (int c = auxiliar7; 0 <= c; c--) {
			p = p + d[c];
			s = s + p;
		}

		final int j = Math.floorMod(
			Math.floorMod(s, auxiliar11), auxiliar10);
		final int k = Math.floorMod(
			Math.floorMod((s - p + (auxiliar9 * d[auxiliar9])),
			 auxiliar11), auxiliar10);

		return (j == d[auxiliar9]) && (k == d[auxiliar10]);
	}

	/**
	 * Função matemática para conferir CPF.
	 *
	 * @param d Array com digitos para conferir.
	 * @throws IllegalArgumentException Se o parâmetro
	 * não for um vetor ou se o vetor tiver tamanho incorreto.
	 */
	public static void geraExcecaoSeCpfInvalido(final int[] d) {

		final int auxiliar9 = 9;
		final int auxiliar11 = 11;

		if (d == null) {
			throw new IllegalArgumentException("Argumento null");
		}

		if (d.length != auxiliar11) {
			throw new IllegalArgumentException(
				"CPF deve ter exatos 11 digitos");
		}

		for (int i = 0; i < auxiliar11; i++) {
			if (d[i] < 0 || d[i] > auxiliar9) {
				throw new IllegalArgumentException(
					"Dados fora de exigencia pedida.");
			}
		}
	}
}
