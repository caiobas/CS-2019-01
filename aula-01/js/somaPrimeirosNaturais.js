/**
 * Função matemática que calcula a soma dos números naturais até o parâmetro.
 * 
 * @param {number} numero Número limite para a soma.
 * 
 * @returns {number} Retorna a soma dos números naturais até o parâmetro. 
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} Número deve ser maior que 1.
 */
function somaPrimeirosNaturais(numero) {

    if (typeof numero != "number") {
        throw new TypeError("Este parâmetro não é um número.");
    }

    if (Math.trunc(numero) != numero) {
        throw new TypeError("Este parâmetro não é um inteiro.");
    }

    if (numero < 1) {
        throw new RangeError("Numero deve ser maior que 1.");
    }

    let soma = 1;

    for (let contador = 2; contador <= numero; contador++) {
        soma = soma + contador;
    }

    return soma;
}

module.exports = somaPrimeirosNaturais;