/**
 * Função matemática que calcula o valor com mais proximidade de PI de acordo com quanto maior for o parâmetro.
 * 
 * @param {number} n Número utilizado para determinar maior proximidade do valor de PI.
 * 
 * @returns {number} Retorna aproximado de PI.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} Numero não é maior ou igual a 1.
 */
function valorPI(n) {

    if (typeof n != "number") {
        throw new TypeError("Este parâmetro não é um número.");
    }

    if (Math.trunc(n) != n) {
        throw new TypeError("Este parâmetro não é um inteiro.");
    }

    if (n < 1) {
        throw new RangeError("Numero não é maior ou igual a 1.");
    }

    let s = -1;
    let d = -1;
    let p = 0;

    for (let i = 1; i <= n; i++) {
        d = d + 2;
        s = -1 * s;
        p = p + ((4 * s) / d);
    }

    return p;
}

module.exports = valorPI;