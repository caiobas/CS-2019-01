/**
 * Função com o objetivo de analisar um Array de
 * 1.000.000 números no intervalo de 0 a 1.000 gerados
 * aleatoriamente e retornar um Array com o(s) número(s) mais frequentes.
 * 
 * @param {number} quantidade Quantidade de números gerados.
 * @param {number} intervalo Intervalo dos números gerados.
 * 
 * @returns {Array} Retorna um Array de inteiros com o(s)
 * número(s) mais frequentes do Array de aleatórios.
 * 
 * @throws {TypeError} Se quantidade não for um número.
 * @throws {TypeError} Se intervalo não for um número.
 * @throws {RangeError} Se quantidade não for 1.000.000.
 * @throws {RangeError} Se intervalo não for 1.000.
 */
function numeroFrequente(quantidade, intervalo) {

    if(typeof quantidade != "number") {
        throw new TypeError("Quantidade deve ser número.");
    }

    if(typeof intervalo != "number") {
        throw new TypeError("Intervalo deve ser número.");
    }
    
    if(quantidade != 1000000) {
        throw new RangeError("Quantidade deve ter valor de 1.000.000.");
    }

    if(intervalo != 1000) {
        throw new RangeError("Intervalo deve ter valor de 1000.");
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

module.exports = numeroFrequente;