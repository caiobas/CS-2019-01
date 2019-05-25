/**
 * Função matemática que confere se o número é primo.
 * 
 * @param {number} numero Número para conferir se é número primo.
 * 
 * @returns {boolean} Retorna booleano se é número primo.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} numero deve ser maior ou igual a 1.
 */
function numeroPrimo(numero) {

    if (typeof numero != "number") {
        throw new TypeError("Este parâmetro não é um número.");
    }

    if (Math.trunc(numero) != numero) {
        throw new TypeError("Este parâmetro não é um inteiro.");
    }

    if (numero < 2) {
        throw new RangeError("numero deve ser maior ou igual a 2.");
    }

    for (let contador = 2; contador < numero; contador++) {
        if ((numero % contador) == 0) {
            return false;
        }
    }

    return true;
}

module.exports = numeroPrimo;