/**
 * Função matemática que calcula o valor com mais proximidade de PI de acordo com quanto maior for o parâmetro.
 * 
 * @param {number} precisao Número utilizado para determinar maior proximidade do valor de PI.
 * 
 * @returns {number} Retorna aproximado de PI.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} Numero não é maior ou igual a 1.
 */
function valorPI(precisao) {

    if (typeof precisao != "number") {
        throw new TypeError("Este parâmetro não é um número.");
    }

    if (Math.trunc(precisao) != precisao) {
        throw new TypeError("Este parâmetro não é um inteiro.");
    }

    if (precisao < 1) {
        throw new RangeError("Numero não é maior ou igual a 1.");
    }

    let sinal = -1;
    let divisor = -1;
    let piValor = 0;

    for (let contador = 1; contador <= precisao; contador++) {
        divisor = divisor + 2;
        sinal = -1 * sinal;
        piValor = piValor + ((4 * sinal) / divisor);
    }

    return piValor;
}

module.exports = valorPI;