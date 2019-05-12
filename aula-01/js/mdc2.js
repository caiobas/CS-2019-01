/**
 * Função matemática que calcula maior divisor comum.
 * 
 * @param {number} a Número para cálculo do maior divisor comum.
 * @param {number} b Número para cálculo do maior divisor comum.
 * 
 * @returns {number} Retorna maior divisor comum.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} a deve ser maior ou igual a b e b deve ser maior que 0.
 */
function mdc2(a, b) {

    if (typeof a != "number" || typeof b != "number") {
        throw new TypeError("Este parâmetro não é um número.");
    }

    if (Math.trunc(a) != a || Math.trunc(b) != b) {
        throw new TypeError("Um(ou mais) parâmetro(s) não é um inteiro.");
    }

    if (a < b || b < 1) {
        throw new RangeError("a deve ser maior ou igual a b e b deve ser maior que 0.");
    }

    while (a != b) {
        if (a > b) {
            a = a - b;
        }
        else {
            b = b - a;
        }
    }

    return a;
}

module.exports = mdc2;