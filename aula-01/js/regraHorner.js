/**
 * Função matemática com a regra de Horner para avaliação de polinômio.
 * 
 * @param {number} valor Número para cálculo da regra de Horner.
 * @param {number} total Número para cálculo da regra de Horner.
 * @param {number} vetor Vetor para cálculo da regra de Horner.
 * 
 * @returns {number} Retorna regra de Horner.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} total deve ser maior ou igual a 1.
 */
function regraHorner(valor, total, vetor) {

    if (typeof valor != "number" || typeof total != "number") {
        throw new TypeError("valor ou total não e um numero.");
    }

    if(!Array.isArray(vetor)){
        throw new TypeError("vetor nao e um vetor.");
    }

    if (total < 1) {
        throw new RangeError("total deve ser maior ou igual a 1.");
    }

    let polinomio = vetor[total];

    for (let contador = (total - 1); 0 <= contador; contador--) {
        polinomio = polinomio * (valor + vetor[contador]);
    }

    return polinomio;
}

module.exports = regraHorner;