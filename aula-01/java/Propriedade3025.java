public class Propriedade3025 {

    public static boolean Exercicio1(int numero) {

        int resultado, primDez, segDez;

        // TODO use o modelo empregado no Exercicio3 (que é muito mais simples)
        // TODO vários comentários para JavaScript valem aqui
        if (numero >= 0 && numero <= 9999) {
            primDez = numero / 100;
            segDez = numero % 100;

            resultado = (primDez + segDez);
            resultado = (int) Math.pow(resultado, 2);

            if (resultado == numero)
                return true;
            return false;
        }
        throw new IllegalArgumentException("Número fora da exigência:" + numero + " Esperado número entre 0 e 9999.");

    }

    public static boolean Exercicio2(int numero) {

        int resultado, centena, dezena, dezenaAux, unidade;

        if (numero >= 100 && numero <= 999) {
            centena = numero / 100;
            dezenaAux = numero % 100;
            dezena = dezenaAux / 10;
            unidade = numero % 10;

            resultado = ((int) Math.pow(centena, 3)) + ((int) Math.pow(dezena, 3)) + ((int) Math.pow(unidade, 3));

            if (resultado == numero)
                return true;
            return false;
        }
        throw new IllegalArgumentException("Número fora da exigência:" + numero + " Esperado número entre 100 e 999.");

    }

    public static double Exercicio3(int dia, int mes, int ano) {

        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Dia fora da exigência:" + dia + " Esperado dia entre 1 e 31.");
        }

        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês fora da exigência:" + mes + " Esperado mês entre 1 e 12.");
        }

        if (ano <= 1953) {
            throw new IllegalArgumentException("Ano fora da exigência:" + ano + " Esperado ano maior ou igual a 1953.");
        }

        if (mes == 1 && mes == 2) {
            mes = mes + 12;
            ano = ano - 1;
        }

        double resultado;
        resultado = dia + (2 * mes) + (3 * (mes + 1) / 5) + ano + (ano / 4) - (ano / 100) + (ano / 400);

        return (resultado % 7);

    }

    public static int Exercicio4(int dividendo, int divisor) {

        if (dividendo < 0) {
            throw new IllegalArgumentException("Dividendo fora da exigência:" + dividendo + " Esperado dividendo maior ou igual a 0.");
        }
        if (divisor <= 0) {
            throw new IllegalArgumentException("Divisor fora da exigência:" + divisor + " Esperado divisor maior que 0.");
        }

        // TODO unir próxima linha com a seguinte (mesma observação feita em js)
        int resto;

        resto = dividendo;

        while (divisor <= resto) {
            resto = resto - divisor;
        }

        return resto;
    }

    public static int Exercicio5(int numero) {

        if (numero < 1) {
            throw new IllegalArgumentException("Número fora da exigência:" + numero + " Esperado numero maior que 0.");
        }

        int i = 2;
        int s = 1;

        while (i <= numero) {
            s = s + i;
            i = i + 1;
        }

        return s;
    }

    public static int Exercicio6(int numero) {

        if (numero < 1) {
            throw new IllegalArgumentException("Número fora da exigência:" + numero + " Esperado numero maior que 0.");
        }

        int i = 2;
        int f = 1;

        while (i <= numero) {
            f = f * i;
            i = i + 1;
        }

        return f;
    }

    public static int Exercicio7(int a, int b) {

        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Número fora da exigência. Esperado numero maior ou igual a 0.");
        }

        int totalParcelas;
        int parcela;

        totalParcelas = a;
        parcela = b;

        if (b < a) {
            totalParcelas = b;
            parcela = a;
        }

        int i;
        int s;

        i = 1;
        s = 0;

        while (i <= totalParcelas) {
            s = s + parcela;
            i = i + 1;
        }

        return s;
    }

    public static int Exercicio8(int x, int y) {

        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Número fora da exigência. Esperado numero maior ou igual a 0.");
        }

        int potencia;
        int i;

        potencia = 1;
        i = 1;

        while (i <= y) {
            potencia = Exercicio7(potencia, x);
            i = i + 1;
        }

        return potencia;
    }

    public static double Exercicio9(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("Número fora da exigência. Esperado numero maior ou igual a 1.");
        }

        int i = 1;
        double s = -1;
        double d = -1;
        double p = 0;

        while (i <= n) {
            d = d + 2;
            s = -1 * s;
            p = p + ((4 * s) / d);
            i = i + 1;
        }

        return p;
    }

    public static double Exercicio10(int n, int k) {

        if (n < 1 || k < 2) {
            throw new IllegalArgumentException("Número fora da exigência. Esperado n maior ou igual a 1 e k maior ou igual a 2.");
        }

        int i = 2;
        double e = (i + n);
        double numerador = n;
        double denominador = 1;

        while (i <= k) {
            numerador = (numerador * numerador);
            denominador = (denominador * i);
            e = e + (numerador / denominador);
            i = i + 1;
        }

        return e;
    }

    public static double Exercicio11(int x, int y, int k) {

        if (x < 0 || y < x || k <= 0) {
            throw new IllegalArgumentException("Número fora da exigência. Esperado x maior ou igual a 0, y maior que x e k maior que 0.");
        }

        double c = y;
        double a = x;
        int i = 1;
        double t;

        while (i <= k) {
            t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return (c / a);
    }

    public static boolean Exercicio12(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("Número fora da exigência. Esperado n maior ou igual a 1.");
        }

        int i = 1;
        int s = 1;

        while (s < n) {
            i = i + 2;
            s = s + i;
        }

        return (s == n);
    }

    public static double Exercicio13(int n, int i) {

        if (n < 1) {
            throw new IllegalArgumentException("Número fora da exigência. Esperado n maior que 0.");
        }

        double r = 1;

        while (0 <= i) {
            r = (r + n / r) / 2;
            i = i - 1;
        }

        return r;
    }

    public static boolean Exercicio14(int n) {

        if (n < 2) {
            throw new IllegalArgumentException("Número fora da exigência. Esperado n maior que 1.");
        }

        int i = 2;

        while (i < n) {
            if ((n % i) == 0) {
                return false;
            }
            i = i + 1;
        }

        return true;
    }

    public static boolean Exercicio15(int n) {

        if (n < 2) {
            throw new IllegalArgumentException("Número fora da exigência. Esperado n que 1.");
        }

        int a[] = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            a[i] = 0;
        }

        int i = 2;
        double limite = Math.floor((Math.sqrt(n)));

        while (i <= limite) {
            if (a[i] == 0) {
                int multiplo = i + i;
                while (multiplo <= n) {
                    a[multiplo] = 1;
                    multiplo = multiplo + i;
                }
            }
            i = i + 1;
        }

        if (a[n] == 1)
            return false;
        return true;
    }

    public static int Exercicio16(int a, int b) {
        //Falta aqui pra frente.
        // TODO comentário iniciado por TODO é a recomendação para dizer isso
        if (a < b || b < 1) {
            throw new IllegalArgumentException("Número fora da exigência. Esperado numero maior ou igual a 0.");
        }
        int m;

        while (b != 0) {
            m = a % b;
            a = b;
            b = m;
        }

        return a;
    }

    public static int Exercicio17(int a, int b) {

        if (a < b || b < 1) {
            throw new IllegalArgumentException("Número não está dentro da exigência pedida");
        }

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        return a;
    }

    public static double Exercicio18(double x, int g) {

        if (g < 1) {
            throw new IllegalArgumentException("Número não está dentro da exigência pedida");
        }

        int a[] = new int[g + 1];

        // TODO remover entrada fornecida pelo usuário (não há interação)
        Scanner sc = new Scanner(System.in);

        // TODO você deve definitivamente remover comentários como abaixo.
		/*for(int i=g; i >= 0; i--) {
			a[g] = sc.nextInt();
		}*/

        double p = a[g];
        int i = g - 1;

        while (0 <= i) {
            p = p * (x + a[i]);
            i = i - 1;
        }

        return p;
    }

    public static int Exercicio19(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Número não está dentro da exigência pedida");
        }

        if (n == 0 || n == 1) {
            return n;
        }

        int a = 0;
        int c = 1;
        int i = 2;

        while (i <= n) {
            int t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return c;
    }

    public static boolean Exercicio20(int d[]) {

        // TODO verificar se null
        // TODO verificar se possui exatamente 11 elementos

        for (int i = 0; i < 11; i++) {
            if (d[i] < 0 || d[i] > 9) {
                throw new IllegalArgumentException("Número não está dentro da exigência pedida");
            }
        }

        int j = d[1] + 2 * (d[2]) + 3 * (d[3]) + 4 * (d[4]) + 5 * (d[5]) + 6 * (d[6]) + 7 * (d[7]) + 8 * (d[8]) + 9 * (d[9]);
        int k = d[2] + 2 * (d[3]) + 3 * (d[4]) + 4 * (d[5]) + 5 * (d[6]) + 6 * (d[7]) + 7 * (d[8]) + 8 * (d[9]) + 9 * (d[10]);
        int dj = Math.floorMod(Math.floorMod(j, 11), 10);
        int dk = Math.floorMod(Math.floorMod(k, 11), 10);

        return ((dj == d[10]) && (dk == d[11]));
    }

    public static boolean Exercicio21(int d[]) {

        // TODO as mesmas atividades para o exercício anterior
        
        for (int i = 1; i <= 11; i++) {
            if (d[i] < 0 || d[i] > 9) {
                throw new IllegalArgumentException("Número não está dentro da exigência pedida");
            }
        }

        int c = 8;
        int p = d[9];
        int s = d[9];

        while (1 <= c) {
            p = p + d[c];
            s = s + p;
            c = c - 1;
        }

        int j = Math.floorMod(Math.floorMod(s, 11), 10);
        int k = Math.floorMod(Math.floorMod((s - p + (9 * d[10])), 11), 10);

        return ((j == d[10]) && (k == d[11]));
    }
}
