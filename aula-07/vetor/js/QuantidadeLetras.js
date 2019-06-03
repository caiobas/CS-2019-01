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
function quantidadeLetras(string) {

    if(typeof string != 'string') {
        throw new TypeError("Parâmetro deve ser string.");
    }

    let letras = [];
    for(let contador = 0; contador < 26; contador++){
        letras[contador] = 0;
    }

    for(let contador = 0; contador < string.length; contador++){
        if(string.charCodeAt(contador) - 65 >= 0 && string.charCodeAt(contador) - 65 < 26){
            letras[string.charCodeAt(contador) - 65]++;
        } else if (string.charCodeAt(contador) - 97 >= 0 && string.charCodeAt(contador) - 97 < 26) {
            letras[string.charCodeAt(contador) - 97]++;
        }
    }  

    let letrasFinal = "";
    
    
    for(let contador = 0; contador < letras.length; contador++){
        if(letras[contador] != 0){
            letrasFinal = letrasFinal + String.fromCharCode(contador + 65) + " = " + letras[contador] + "\n";
        }
    }

    return letrasFinal;
}

module.exports = quantidadeLetras;