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
function numeroFrequente(quantidade, intervalo) {

    if(typeof quantidade != 'number' || quantidade != 1000000) {
        throw new TypeError("Quantidade deve ser número com valor de 1.000.000.");
    }

    if(typeof intervalo != 'number' || intervalo != 1000) {
        throw new TypeError("Intervalo deve ser número com valor de 1000.");
    }

    let vetor = new Array();

    for(let contador = 0; contador < quantidade; contador++){
        vetor[contador] = Math.floor(Math.random() * (intervalo + 1));
    }
    vetor.sort();

    let numeros = new Map();

    for(let contador of vetor){
        if(numeros.get(contador)){
            numeros.set(contador, numeros.get(contador) + 1);
        } else {
            numeros.set(contador, 1);
        }
    }

    let compara = 0;

    for(let contador of vetor){
        if(numeros.get(contador) > compara){
            compara = numeros.get(contador);
        }
    }

    let frequentes = new Array();
    let contador1 = 0;
    
    for(let contador of vetor){
        if(numeros.get(contador) == compara && frequentes[contador1 - 1] != contador){
            frequentes[contador1] = contador;
            contador1++;
        }
    }

    frequentes.sort();
    console.log(frequentes);
    return frequentes;
}
console.log(numeroFrequente(1000000, 1000))
module.exports = numeroFrequente;