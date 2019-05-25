/**
 * Função matemática que calcula a proximidade do logaritmo natural.
 * 
 * @param {number} log Numerador do logaritmo.
 * @param {number} limite Número utilizado para proximidade do logaritmo natural.
 * 
 * @returns {number} Retorna valor mais próximo do logaritmo natural.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} log deve ser maior ou igual a 1 e limite maior ou igual a 2.
 */
function logaritmo(log, limite) {

    if (typeof log != "number" || typeof limite != "number") {
        throw new TypeError("Este parâmetro não é um número.");
    }

    if (Math.trunc(log) != log || Math.trunc(limite) != limite) {
        throw new TypeError("Um(ou mais) parâmetro(s) não é um inteiro.");
    }

    if (log < 1 || limite < 2) {
        throw new RangeError("log deve ser maior ou igual a 1 e limite maior ou igual a 2.");
    }

    let contador = 2;
    let euler = (contador + log);
    let numerador = log;
    let denominador = 1;

    for (; contador <= limite; contador++) {
        numerador = numerador * numerador;
        denominador = denominador * contador;
        euler = euler + (numerador / denominador);
    }

    return euler;
}

module.exports = logaritmo;

console.log(logaritmo(2, 2))