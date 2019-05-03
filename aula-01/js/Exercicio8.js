/**
 * Função matemática que calcula a potência usando somas.
 * 
 * @param {number} x Número natural a ser elevado.
 * @param {number} y Potência do número.
 * 
 * @returns {number} Retorna o resultado da potência.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} x e y devem ser maiores ou igual a 0.
 */

function Exercicio8(x, y) {
            
    if(typeof x != 'number' || typeof y != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }

    if(Math.trunc(x) != x || Math.trunc(y) != y){
        return TypeError("Um(ou mais) parâmetro(s) não é um inteiro.");
    }
    
    if(x < 0 || y < 0) {
        return RangeError("x e y devem ser maiores ou igual a 0");
    }

    let potencia = 1;

    for(let i = 1; i <= y; i++){
        potencia = Exercicio7(potencia, x);
    }

    return potencia;
}