/**
 * Função com o objetivo de encontrar a menor temperatura
 * em um vetor de valores recebido como argumento.
 * 
 * @param {Array} vetor Vetor usado para análise de menor temperatura.
 * 
 * @returns {number} Retorna menor temperatura de um vetor.
 * 
 * @throws {TypeError} Se o parâmetro não for um vetor.
 * @throws {TypeError} Se o vetor não conter apenas números.
 */
function menorTemperatura(vetor) {

    if(!Array.isArray(vetor)) {
        throw new TypeError("Parâmetro deve ser um vetor.")
    }

    for(let contador = 0; contador < vetor.length; contador++) {
        if(typeof vetor[contador] != 'number'){
            throw new TypeError("O vetor deve conter apenas números.")
        }
    }

    vetor.sort();

    return vetor[0];
}

module.exports = menorTemperatura;