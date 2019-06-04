/**
 * Função com o objetivo de retornar a quantidade de cada
 * uma das letras presentes em uma sequência de caracteres.
 * 
 * @param {String} string String contendo caracteres.
 * 
 * @returns {String} Retorna a quantidade de cada uma das letras presentes em uma string.
 * 
 * @throws {TypeError} Se o parâmetro não for uma string.
 */
function quantidadeLetras(string) {

    if(typeof string != "string") {
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