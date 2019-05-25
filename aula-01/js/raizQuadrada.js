/**
 * Função matemática que calcula o valor mais próximo da raiz quadrada.
 * 
 * @param {number} numero Número para calculo da raiz quadrada.
 * @param {number} precisao Número para proximidade de raiz quadrada.
 * 
 * @returns {number} Retorna número mais próximo da raiz quadrada.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} numero deve ser maior ou igual a 1.
 */
function raizQuadrada(numero, precisao) {

    if (typeof numero != "number" || typeof precisao != "number") {
        throw new TypeError("Este parâmetro não é um número.");
    }

    if (numero < 1) {
        throw new RangeError("numero deve ser maior ou igual a 1.");
    }

    let raiz = 1;

    while (0 <= precisao) {
        raiz = (raiz + numero / raiz) / 2;
        precisao = precisao - 1;
    }

    return raiz;
}

module.exports = raizQuadrada;