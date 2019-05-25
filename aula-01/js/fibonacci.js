/**
 * Função matemática para o cálculo de Fibonacci.
 * 
 * @param {number} numero Número para cálculo de Fibonacci.
 * 
 * @returns {number} Retorna número de Fibonacci.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} numero deve ser maior ou igual a 0.
 */
function fibonacci(numero) {

    if (typeof numero != "number") {
        throw new TypeError("Este parâmetro não é um número.");
    }

    if (Math.trunc(numero) != numero) {
        throw new TypeError("Este parâmetro não é um inteiro.");
    }

    if (numero < 0) {
        throw new RangeError("numero deve ser maior ou igual a 0.");
    }

    if (numero == 0 || numero == 1) {
        return numero;
    }

    let auxiliar = 0;
    let resultado = 1;

    for (let contador = 2; contador <= numero; contador++) {
        var troca = resultado;
        resultado = resultado + auxiliar;
        auxiliar = troca;
    }

    return resultado;
}

module.exports = fibonacci;