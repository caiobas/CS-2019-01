/**
 * Função matemática com a regra de Horner para avaliação de polinômio.
 * 
 * @param {number} x Número para cálculo da regra de Horner.
 * @param {number} g Número para cálculo da regra de Horner.
 * 
 * @returns {number} Retorna regra de Horner.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} g deve ser maior ou igual a 1.
 */

function regraHorner(x, g) {
            
    if(typeof x != "number" || typeof g != "number"){
        throw new TypeError("Este parâmetro não é um número.");
    }
    
    if(g < 1) {
        throw new RangeError("g deve ser maior ou igual a 1.");
    }

    var a = [g+1];

    //Não compreendi a forma de leitura.

    let p = a[g];

    for(let i = (g-1); 0 <= i; i--){
        p = p * (x + a[i]);
    }

    return p;
}