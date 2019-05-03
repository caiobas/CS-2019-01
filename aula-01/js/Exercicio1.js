/**
 * Função matemática que verifica se o quadrado da soma dos 2 primeiros números com os 2 ultimos é o próprio número.
 * 
 * @param {number} numero Número a ser verificado.
 * 
 * @returns {boolean} Retorna booleano para verificação. 
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} Se o número não está entre 0 e 9999.
 */
function Exercicio1(numero) {
            
    if(typeof numero != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }

    if(Math.trunc(numero) != numero){
        return TypeError("Este parâmetro não é um inteiro.");
    }
    
    if(numero < 0 || numero > 9999) {
        return RangeError("Numero não está entre 0 e 9999.");
    }
    
    const primDez = Math.trunc(numero / 100);
    const segDez = numero % 100;
    const resultado = Math.pow(primDez + segDez, 2);
        
    return resultado == numero;
}