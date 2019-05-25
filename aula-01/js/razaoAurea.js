/**
 * Função matemática que calcula a razão áurea.
 * 
 * @param {number} anterior Número para calcular razão áurea.
 * @param {number} posterior Número para calcular razão áurea.
 * @param {number} limite Precisão da razão áurea.
 * 
 * @returns {number} Retorna valor da razão áurea.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} anterior deve ser maior ou igual a 0, posterior deve ser maior que anterior e limite maior que 0.
 */
function razaoAurea(anterior, posterior, limite) {

    if (typeof anterior != "number" || typeof posterior != "number" || typeof limite != "number") {
        throw new TypeError("Este parâmetro não é um número.");
    }

    if (Math.trunc(anterior) != anterior || Math.trunc(posterior) != posterior || Math.trunc(limite) != limite) {
        throw new TypeError("Um(ou mais) parâmetro(s) não é um inteiro.");
    }

    if (anterior < 0 || posterior < anterior || limite <= 0) {
        throw new RangeError("anterior deve ser maior ou igual a 0, posterior deve ser maior que anterior e limite maior que 0.");
    }

    let auxiliarPosterior = posterior;
    let auxiliarAnterior = anterior;

    for (let contador = 1; contador <= limite; contador++) {
        let troca = auxiliarPosterior;
        auxiliarPosterior = auxiliarPosterior + auxiliarAnterior;
        auxiliarAnterior = troca;
    }

    return auxiliarPosterior / auxiliarAnterior;
}

module.exports = razaoAurea;

console.log(razaoAurea(1, 2, 1000))