/**
 * Função matemática que calcula o produto de inteiro usando somas.
 * 
 * @param {number} a Número usado para calcular produto.
 * @param {number} b Número usado para calcular produto.
 * 
 * @returns {number} Retorna o produto dos números.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} multiplicador e b devem ser maior ou igual a 0.
 */
function produtoUsandoSomas(multiplicador, multiplicando) {

    if (typeof multiplicador != "number" || typeof multiplicando != "number") {
        throw new TypeError("Este(s) parâmetro(s) não é um número.");
    }

    if (Math.trunc(multiplicador) != multiplicador || Math.trunc(multiplicando) != multiplicando) {
        throw new TypeError("Um(ou mais) parâmetro(s) não é um inteiro.");
    }

    if (multiplicador < 0 || multiplicando < 0) {
        throw new RangeError("multiplicador e multiplicando devem ser maior ou igual a 0.");
    }

    let totalParcelas = multiplicador;
    let parcela = multiplicando;

    if (multiplicando < multiplicador) {
        totalParcelas = multiplicando;
        parcela = multiplicador;
    }

    let produto = 0;

    for (let contador = 1; contador <= totalParcelas; contador++) {
        produto = produto + parcela;
    }

    return produto;
}

module.exports = produtoUsandoSomas;