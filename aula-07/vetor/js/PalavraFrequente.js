/**
 * Função com o objetivo de localizar a palavra
 * mais frequente em uma sequência de caracteres.
 * 
 * @param {String} string String contendo palavras.
 * 
 * @returns {String} Retorna a palavra mais frequente em uma frase.
 * 
 * @throws {TypeError} Se o parâmetro não for uma string.
 */
function palavraFrequente(string) {

    if(typeof string != "string") {
        throw new TypeError("Parâmetro deve ser string.");
    }

    let frequencia = new Map();

    let palavras = string.split(" ");

    for(let contador of palavras){
        if(frequencia.get(contador)){
            frequencia.set(contador, frequencia.get(contador) + 1);
        } else {
            frequencia.set(contador, 1);
        }
    }

    let palavra;
    let compara = 0;

    for(let contador of palavras){
        if(frequencia.get(contador) > compara){
            compara = frequencia.get(contador);
            palavra = contador;
        }
    }

    return palavra;
}

module.exports = palavraFrequente;