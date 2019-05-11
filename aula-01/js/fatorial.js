/**
 * Função matemática que calcula o fatorial de um número natural.
 * 
 * @param {number} numero Número limite para o fatorial.
 * 
 * @returns {number} Retorna o fatorial do parâmetro. 
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} Número deve ser maior que 1.
 */

function fatorial(numero) {
            
    if(typeof numero != "number"){
        throw new TypeError("Este parâmetro não é um número.");
    }

    if(Math.trunc(numero) != numero){
        throw new TypeError("Este parâmetro não é um inteiro.");
    }
    
    if(numero < 1) {
        throw new RangeError("Numero deve ser maior que 1.");
    }

    let f = 1;

    for(let i = 2; i <= numero; i++){
        f = f * i;
    }

    return f;
}