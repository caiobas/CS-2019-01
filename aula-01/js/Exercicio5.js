/**
 * Função matemática que calcula a soma dos números naturais até o parâmetro.
 * 
 * @param {number} numero Número limite para a soma.
 * 
 * @returns {number} Retorna a soma dos números naturais até o parâmetro. 
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} Número deve ser maior que 1.
 */

function Exercicio5(numero) {
            
    if(typeof numero != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }

    if(Math.trunc(numero) != numero){
        return TypeError("Este parâmetro não é um inteiro.");
    }
    
    if(numero < 1) {
        return RangeError("Numero deve ser maior que 1.");
    }

    let s = 1;

    for(let i=2; i<= numero; i++){
        s = s + i;
    }

    return s;
}