/**
 * Função matemática que calcula a potência usando somas.
 * 
 * @param {number} x Número natural a ser elevado.
 * @param {number} y Potência do número.
 * 
 * @returns {number} Retorna o resultado da potência.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} x e y devem ser maiores ou igual a 0.
 */
function potenciaUsandoSomas(x, y) {

    if (typeof x != "number" || typeof y != "number") {
        throw new TypeError("Este parâmetro não é um número.");
    }

    if (Math.trunc(x) != x || Math.trunc(y) != y) {
        throw new TypeError("Um(ou mais) parâmetro(s) não é um inteiro.");
    }

    if (x < 0 || y < 0) {
        throw new RangeError("x e y devem ser maiores ou igual a 0");
    }

    let potencia = 1;

    for (let i = 1; i <= y; i++) {
        potencia = produtoUsandoSomas(potencia, x);
    }

    return potencia;
}

module.exports = potenciaUsandoSomas;

console.log(potenciaUsandoSomas(2, 5));