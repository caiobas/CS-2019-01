/**
 * Função matemática que calcula o produto de inteiro usando somas.
 * 
 * @param {number} a Número usado para calcular produto.
 * @param {number} b Número usado para calcular produto.
 * 
 * @returns {number} Retorna o produto dos números.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} a e b devem ser maior ou igual a 0.
 */
function produtoUsandoSomas(a, b) {

    if (typeof a != "number" || typeof b != "number") {
        throw new TypeError("Este(s) parâmetro(s) não é um número.");
    }

    if (Math.trunc(a) != a || Math.trunc(b) != b) {
        throw new TypeError("Um(ou mais) parâmetro(s) não é um inteiro.");
    }

    if (a < 0 || b < 0) {
        throw new RangeError("a e b devem ser maior ou igual a 0.");
    }

    let totalParcelas = a;
    let parcela = b;

    if (b < a) {
        totalParcelas = b;
        parcela = a;
    }

    let s = 0;

    for (let i = 1; i <= totalParcelas; i++) {
        s = s + parcela;
    }

    return s;
}

module.exports = produtoUsandoSomas;