/**
 * Função matemática que calcula maior divisor comum.
 * 
 * @param {number} numeroUm Número para cálculo do maior divisor comum.
 * @param {number} numeroDois Número para cálculo do maior divisor comum.
 * 
 * @returns {number} Retorna maior divisor comum.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} numeroUm deve ser maior ou igual a numeroDois e numeroDois deve ser maior que 0.
 */
function mdc2(numeroUm, numeroDois) {

    if (typeof numeroUm != "number" || typeof numeroDois != "number") {
        throw new TypeError("Este parâmetro não é um número.");
    }

    if (Math.trunc(numeroUm) != numeroUm || Math.trunc(numeroDois) != numeroDois) {
        throw new TypeError("Um(ou mais) parâmetro(s) não é um inteiro.");
    }

    if (numeroUm < numeroDois || numeroDois < 1) {
        throw new RangeError("numeroUm deve ser maior ou igual a numeroDois e numeroDois deve ser maior que 0.");
    }

    while (numeroUm != numeroDois) {
        if (numeroUm > numeroDois) {
            numeroUm = numeroUm - numeroDois;
        }
        else {
            numeroDois = numeroDois - numeroUm;
        }
    }

    return numeroUm;
}

module.exports = mdc2;