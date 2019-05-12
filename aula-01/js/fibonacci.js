/**
 * Função matemática para o cálculo de Fibonacci.
 * 
 * @param {number} n Número para cálculo de Fibonacci.
 * 
 * @returns {number} Retorna número de Fibonacci.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} n deve ser maior ou igual a 0.
 */
function fibonacci(n) {

    if (typeof n != "number") {
        throw new TypeError("Este parâmetro não é um número.");
    }

    if (Math.trunc(n) != n) {
        throw new TypeError("Este parâmetro não é um inteiro.");
    }

    if (n < 0) {
        throw new RangeError("n deve ser maior ou igual a 0.");
    }

    if (n == 0 || n == 1) {
        return n;
    }

    let a = 0;
    let c = 1;

    for (let i = 2; i <= n; i++) {
        var t = c; //Mesma duvida referente ao Exercicio11 e 16
        c = c + a;
        a = t;
    }

    return c;
}

module.exports = fibonacci;