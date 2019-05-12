/**
 * Função matemática que calcula a proximidade do logaritmo natural.
 * 
 * @param {number} n Numerador do logaritmo.
 * @param {number} k Número utilizado para proximidade do logaritmo natural.
 * 
 * @returns {number} Retorna valor mais próximo do logaritmo natural.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} n deve ser maior ou igual a 1 e k maior ou igual a 2.
 */
function logaritmo(n, k) {

    if (typeof n != "number" || typeof k != "number") {
        throw new TypeError("Este parâmetro não é um número.");
    }

    if (Math.trunc(n) != n || Math.trunc(k) != k) {
        throw new TypeError("Um(ou mais) parâmetro(s) não é um inteiro.");
    }

    if (n < 1 || k < 2) {
        throw new RangeError("n deve ser maior ou igual a 1 e k maior ou igual a 2.");
    }

    let i = 2;
    let e = (i + n);
    let numerador = n;
    let denominador = 1;

    for (; i <= k; i++) {
        numerador = numerador * numerador;
        denominador = denominador * i;
        e = e + (numerador / denominador);
    }

    return e;
}

module.exports = logaritmo;