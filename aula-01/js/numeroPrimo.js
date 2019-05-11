/**
 * Função matemática que confere se o número é primo.
 * 
 * @param {number} n Número para conferir se é número primo.
 * 
 * @returns {boolean} Retorna booleano se é número primo.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} n deve ser maior ou igual a 1.
 */

function numeroPrimo(n) {
            
    if(typeof n != "number"){
        throw new TypeError("Este parâmetro não é um número.");
    }

    if(Math.trunc(n) != n){
        throw new TypeError("Este parâmetro não é um inteiro.");
    }
    
    if(n < 2) {
        throw new RangeError("n deve ser maior ou igual a 2.");
    }

    for(let i = 2; i < n; i++){
        if((n % i) == 0) {
            return false;
        }
    }
    
    return true;
}