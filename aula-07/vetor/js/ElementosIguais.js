/**
 * Função com o objetivo de retornar a quantidade de elementos
 * do vetor recebido como primeiro argumento cujos valores são
 * iguais ao valor do segundo argumento fornecido.
 * 
 * @param {Array} vetor1 Vetor de inteiros usado como referência para encontrar elementos iguais.
 * @param {Array} vetor2 Vetor de inteiros usado como referência para encontrar elementos iguais.
 * 
 * @returns {number} Retorna número de elementos iguais.
 * 
 * @throws {TypeError} Se algum parâmetro não for um vetor.
 * @throws {TypeError} Se algum vetor não conter apenas números.
 * @throws {TypeError} Se algum vetor não conter números inteiros.
 */
function elementosIguais(vetor1, vetor2) {

    if(!Array.isArray(vetor1) || !Array.isArray(vetor2)) {
        throw new TypeError("Parâmetros devem ser vetores.");
    }

    for(let contador = 0; contador < vetor1.length; contador++) {
        if (typeof vetor1[contador] != "number"){
            throw new TypeError("Os vetores devem conter apenas números.");
        } else if (Math.trunc(vetor1[contador]) != vetor1[contador]){
            throw new TypeError("Os números contidos nos vetores devem ser inteiros.");
        }
    }
    
    for(let contador = 0; contador < vetor2.length; contador++) {
        if (typeof vetor2[contador] != "number"){
            throw new TypeError("Os vetores devem conter apenas números.");
        } else if (Math.trunc(vetor2[contador]) != vetor2[contador]){
            throw new TypeError("Os números contidos nos vetores devem ser inteiros.");
        }
    }

    vetor1.sort();
    vetor2.sort();

    let vetorFinal = [];
    let contadorFinal = 0;

    for(let contador = 0; contador < vetor1.length; contador++){
        for(let contador1 = 0; contador1 < vetor2.length; contador1++){
            if(vetor1[contador] == vetor2[contador1] && contadorFinal == 0){
                contadorFinal++;
                vetorFinal[contadorFinal] = vetor1[contador];
            } else if(vetor1[contador] == vetor2[contador1] && vetor1[contador] != vetorFinal[contadorFinal]){
                contadorFinal++;
                vetorFinal[contadorFinal] = vetor1[contador];
            }
        }
    }

    return contadorFinal;
}

module.exports = elementosIguais;