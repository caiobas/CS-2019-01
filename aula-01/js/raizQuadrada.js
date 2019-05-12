/**
 * Função matemática que calcula o valor mais próximo da raiz quadrada.
 * 
 * @param {number} n Número para calculo da raiz quadrada.
 * @param {number} i Número para proximidade de raiz quadrada.
 * 
 * @returns {number} Retorna número mais próximo da raiz quadrada.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} n deve ser maior ou igual a 1.
 */
function raizQuadrada(n, i) {

    if (typeof n != "number" || typeof i != "number") {
        throw new TypeError("Este parâmetro não é um número.");
    }

    if (n < 1) {
        throw new RangeError("n deve ser maior ou igual a 1.");
    }

    let r = 1;

    while (0 <= i) {
        r = (r + n / r) / 2;
        i = i - 1;
    }

    return r;
}

module.exports = raizQuadrada;