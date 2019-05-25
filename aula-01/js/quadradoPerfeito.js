/**
 * Função matemática que confere se o número é quadrado perfeito.
 * 
 * @param {number} numero Número para conferir se é quadrado perfeito.
 * 
 * @returns {boolean} Retorna booleano se é quadrado perfeito.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} numero deve ser maior ou igual a 1.
 */
function quadradoPerfeito(numero) {

    if (typeof numero != "number") {
        throw new TypeError("Este parâmetro não é um número.");
    }

    if (numero < 1) {
        throw new RangeError("numero deve ser maior ou igual a 1.");
    }

    let incremental = 1;
    let resultado = 1;

    while (resultado < numero) {
        incremental = incremental + 2;
        resultado = resultado + incremental;
    }

    return resultado == numero;
}

module.exports = quadradoPerfeito;