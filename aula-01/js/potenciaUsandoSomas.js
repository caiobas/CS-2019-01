const funcao = require("./produtoUsandoSomas.js");
/**
 * Função matemática que calcula a potência usando somas.
 * 
 * @param {number} x Número natural a ser elevado.
 * @param {number} y Potência do número.
 * 
 * @returns {number} Retorna o resultado da potência.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} base e expoente devem ser maiores ou igual a 0.
 */
function potenciaUsandoSomas(base, expoente) {

    if (typeof base != "number" || typeof expoente != "number") {
        throw new TypeError("Este parâmetro não é um número.");
    }

    if (Math.trunc(base) != base || Math.trunc(expoente) != expoente) {
        throw new TypeError("Um(ou mais) parâmetro(s) não é um inteiro.");
    }

    if (base < 0 || expoente < 0) {
        throw new RangeError("Base e expoente devem ser maiores ou igual a 0");
    }

    let potencia = 1;

    for (let contador = 1; contador <= expoente; contador++) {
        potencia = funcao(potencia, base);
    }

    return potencia;
}

module.exports = potenciaUsandoSomas;

console.log(potenciaUsandoSomas(2, 5));