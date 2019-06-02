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
function somaImpar(vetor) {

    if(!Array.isArray(vetor)) {
        throw new TypeError("Parâmetro deve ser um vetor.");
    }
    let somaImpares = 0;
    for(let contador = 0; contador < vetor.length; contador++) {
        if (typeof vetor[contador] != 'number'){
            throw new TypeError("O vetor deve conter apenas números.");
        } else if (Math.trunc(vetor[contador]) != vetor[contador]){
            throw new TypeError("Os números contidos no vetor devem ser inteiros.");
        } else if (vetor[contador] % 2 != 0) {
            somaImpares = somaImpares + vetor[contador];
        }
    }

    return somaImpares;
}

module.exports = somaImpar;