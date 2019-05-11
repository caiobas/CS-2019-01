package com/github/caiobas/es/cs/aula01;

public class Algoritmos {

	public static boolean propriedade3025(int numero) {
		
 		if(numero < 0 || numero > 9999) {
 			throw new IllegalArgumentException("Numero fora da exigencia:" + numero + " Esperado numero entre 0 e 9999.");
 		}
 			
		final int primDez = numero / 100;
		final int segDez = numero % 100;
		final int resultado = (int) Math.pow(primDez + segDez, 2);
		
		return resultado == numero;
	}

	public static boolean propriedade153(int numero) {
		
		if(numero < 100 || numero > 999) {
			throw new IllegalArgumentException("Numero fora da exigencia:" + numero + " Esperado numero entre 100 e 999.");
		}
		final int centena = numero / 100;
		final int dezenaAux = numero % 100;
		final int dezena = dezenaAux / 10;
		final int unidade = numero % 10;
		final int resultado = (int) Math.pow(centena, 3) + (int) Math.pow(dezena, 3) + (int) Math.pow(unidade, 3);
		
		return resultado == numero;
	}

	public static double diaDaSemana(int dia, int mes, int ano) {
		
		if(dia < 1 || dia > 31) {
			throw new IllegalArgumentException("Dia fora da exigencia:" + dia + " Esperado dia entre 1 e 31.");
		}
		
		if(mes < 1 || mes > 12) {
			throw new IllegalArgumentException("Mes fora da exigencia:" + mes + " Esperado mes entre 1 e 12.");
		}
		
		if(ano <= 1953) {
			throw new IllegalArgumentException("Ano fora da exigencia:" + ano + " Esperado ano maior ou igual a 1953.");
		}
		
		if(mes == 1 && mes == 2) {
			mes = mes + 12;
			ano = ano - 1;
		}
		
		final int resultado = dia + (2 * mes) + (3 * (mes + 1) / 5) + ano + (ano / 4) - (ano / 100) + (ano / 400);
		
		return resultado % 7;
	}

	public static int restoDivisao(int dividendo, int divisor) {
		
		if(dividendo < 0) {
			throw new IllegalArgumentException("Dividendo fora da exigencia:" + dividendo + " Esperado dividendo maior ou igual a 0.");
		}
		if(divisor <= 0) {
			throw new IllegalArgumentException("Divisor fora da exigencia:" + divisor + " Esperado divisor maior que 0.");
		}
		
		int resto = dividendo;
		
		while(resto >= divisor) {
			resto = resto - divisor;
		}
		
		return resto;
	}

	public static int somaPrimeirosNaturais(int numero) {
		
		if(numero < 1) {
			throw new IllegalArgumentException("Numero fora da exigencia:" + numero + " Esperado numero maior que 0.");
		}
		
		int s = 1;
		
		for(int i = 2; i <= numero; i++){
			s = s + i;
		}
		
		return s;
	}

	public static int fatorial(int numero) {
		
		if(numero < 1) {
			throw new IllegalArgumentException("Numero fora da exigencia:" + numero + " Esperado numero maior que 0.");
		}
		
		int f = 1;
		
		for(int i = 2; i <= numero; i++){
			f = f * i;
		}
		
		return f;
	}

	public static int produtoUsandoSomas(int a, int b) {
		
		if(a < 0 || b < 0) {
			throw new IllegalArgumentException("Numero fora da exigencia. Esperado numero maior ou igual a 0.");
		}

		int totalParcelas = a;
		int parcela = b;
		
		if(b < a) {
			totalParcelas = b;
			parcela = a;
		}
		
		int s = 0;
		
		for(int i = 1; i <= totalParcelas; i++){
			s = s + parcela;
		}
		
		return s;
	}

	public static int potenciaUsandoSomas(int x, int y) {
		
		if(x < 0 || y < 0) {
			throw new IllegalArgumentException("Numero fora da exigencia. Esperado numero maior ou igual a 0.");
		}
		
		int potencia = 1;
		
		for(int i = 1; i <= y; i++){
			potencia = Exercicio7(potencia, x);
		}
		
		return potencia;
	}

	public static double valorPI(int n) {
		
		if(n < 1) {
			throw new IllegalArgumentException("Numero fora da exigencia. Esperado numero maior ou igual a 1.");
		}
		
		double s = -1;
		double d = -1;
		double p = 0;
		
		for(int i = 1; i <= n; i++){
			d = d + 2;
			s = -1 * s;
			p = p + ((4 * s) / d);
		}
		
		return p;
	}

	public static double logaritmo(int n, int k) {
		
		if(n < 1 || k < 2) {
			throw new IllegalArgumentException("Numero fora da exigencia. Esperado n maior ou igual a 1 e k maior ou igual a 2.");
		}
		
		int i = 2;
		double e = (i + n);
		double numerador = n;
		double denominador = 1;
		
		for(; i <= k; i++){
			numerador = numerador * numerador;
			denominador = denominador * i;
			e = e + (numerador / denominador);
		}
		
		return e;
	}

	public static double razaoAurea(int x, int y, int k) {
		
		if(x < 0 || y < x || k <= 0) {
			throw new IllegalArgumentException("Numero fora da exigencia. Esperado x maior ou igual a 0, y maior que x e k maior que 0.");
		}
		
		double c = y;
		double a = x;
		
		for(int i = 1; i <= k; i++){
			double t = c;
			c = c + a;
			a = t;
		}
		
		return c / a;
	}

	public static boolean quadradoPerfeito(int n) {
		
		if(n < 1) {
			throw new IllegalArgumentException("Numero fora da exigencia. Esperado n maior ou igual a 1.");
		}
		
		int i = 1;
		int s = 1;
		
		while(s < n) {
			i = i + 2;
			s = s + i;
		}
		
		return s == n;
	}

	public static double raizQuadrada(int n, int i) {
		
		if(n < 1) {
			throw new IllegalArgumentException("Numero fora da exigencia. Esperado n maior que 0.");
		}
		
		double r = 1;
		
		while(i >= 0) {
			r = (r + n/r) / 2;
			i = i - 1;
		}
		
		return r;
	}

	public static boolean numeroPrimo(int n) {
		
		if(n < 2) {
			throw new IllegalArgumentException("Numero fora da exigencia. Esperado n maior que 1.");
		}
		
		for(int i = 2; i < n; i++){
			if((n % i) == 0) {
				return false;
			}
		}
		
		return true;
	}

	public static boolean crivoErastotenes(int n) {
		
		if(n < 2) {
			throw new IllegalArgumentException("Numero fora da exigencia. Esperado n maior que 1.");
		}
		
		int a[] = new int[n+1];
		
		for(int i = 1; i < n+1; i++) {
			a[i] = 0;
		}
		
		double limite = Math.floor(Math.sqrt(n));
		
		for(int i = 2; i <= limite; i ++){
			if(a[i] == 0) {
				int multiplo = i + i;
				while(multiplo <= n) {
					a[multiplo] = 1;
					multiplo = multiplo + i;
				}
			}
		}

		return a[n] == 1;
	}

	public static int mdc1(int a, int b) {
		
		if(a < b || b < 1) {
			throw new IllegalArgumentException("Numero fora da exigencia. Esperado a maior ou igual a b e b maior que 0.");
		}
		
		while(b != 0) {
			int m = a % b;
			a = b;
			b = m;
		}
		
		return a;
	}

	public static int mdc2(int a, int b) {
		
		if(a < b || b < 1) {
			throw new IllegalArgumentException("Numero fora da exigencia. Esperado a maior ou igual a b e b maior que 0.");
		}
		
		while(a != b) {
			if(a > b) {
				a = a - b;
			}
			else {
				b = b - a;
			}
		}
		
		return a;
	}

	public static double regraHorner(double x, int g) {
		
		if(g < 1) {
			throw new IllegalArgumentException("Numero fora da exigencia. Esperado g maior ou igual a 1.");
		}
		
		int a[] = new int[g+1];
		Scanner sc = new Scanner(System.in);
		
		/*for(int i=g; i >= 0; i--) {
			a[g] = sc.nextInt();
		}*/
		
		double p = a[g];
		
		for(int i = (g-1); 0 <= i; i--){
			p = p * (x + a[i]);
		}

		return p;
	}

	public static int fibonacci(int n) {
		
		if(n < 0) {
			throw new IllegalArgumentException("Numero fora da exigencia. Esperado n maior ou igual a 0.");
		}
		
		if(n == 0 || n == 1) {
			return n;
		}
		
		int a = 0;
		int c = 1;
		
		for(int i = 2; i <= n; i++){
			int t = c;
			c = c + a;
			a = t;
		}
		
		return c;
	}

	public static boolean cpf1(int d[]) {
		
		geraExcecaoSeCpfInvalido(d);
		
		final int j = d[0] + 2*(d[1]) + 3*(d[2]) + 4*(d[3]) + 5*(d[4]) + 6*(d[5]) + 7*(d[6]) + 8*(d[7]) + 9*(d[8]);   
		final int k = d[1] + 2*(d[2]) + 3*(d[3]) + 4*(d[4]) + 5*(d[5]) + 6*(d[6]) + 7*(d[7]) + 8*(d[8]) + 9*(d[9]);
		final int dj = Math.floorMod(Math.floorMod(j,  11), 10);
		final int dk = Math.floorMod(Math.floorMod(k,  11), 10);
		
		return (dj == d[9]) && (dk == d[10]);
	}

	public static boolean cpf2(int d[]) {
		
		geraExcecaoSeCpfInvalido(d);
		
		int p = d[8];
		int s = d[8];
		
		for(int c = 7; 0 <= c; c--) {
			p = p + d[c];
			s = s + p;
		}
		
		final int j = Math.floorMod(Math.floorMod(s,  11), 10);
		final int k = Math.floorMod(Math.floorMod((s - p + (9 * d[9])),  11), 10);
		
		return (j == d[9]) && (k == d[10]);
	}

	private static void geraExcecaoSeCpfInvalido(int[] d) {
		
        if (d == null) {
            throw new IllegalArgumentException("Argumento null");
        }

         if (d.length != 11) {
            throw new IllegalArgumentException("CPF deve ter exatos 11 digitos");
        }

         for (int i = 0; i < 11; i++) {
            if (d[i] < 0 || d[i] > 9) {
                throw new IllegalArgumentException("N�mero n�o est� dentro da exig�ncia pedida");
            }
        }
    }

}