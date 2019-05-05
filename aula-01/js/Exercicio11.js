/**
 * Função matemática que calcula a razão áurea.
 * 
 * @param {number} x Número para calcular razão áurea.
 * @param {number} y Número para calcular razão áurea.
 * @param {number} k Precisão da razão áurea.
 * 
 * @returns {number} Retorna valor da razão áurea.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} x deve ser maior ou igual a 0, y deve ser maior que x e k maior que 0.
 */

function Exercicio11(x, y, k) {
            
    if(typeof x != "number" || typeof y != "number" || typeof k != "number"){
        throw new TypeError("Este parâmetro não é um número.");
    }

    if(Math.trunc(x) != x || Math.trunc(y) != y || Math.trunc(k) != k){
        throw new TypeError("Um(ou mais) parâmetro(s) não é um inteiro.");
    }
    
    if(x < 0 || y < x || k <= 0) {
        throw new RangeError("x deve ser maior ou igual a 0, y deve ser maior que x e k maior que 0.");
    }

    let c = y;		
    let a = x;
    let t; //Perguntar ao professor se é interessante criar o t dentro ou fora do for.

    for(let i = 1; i <= k; i++){
        t = c;
        c = c + a;
        a = t;
    }

    return c / a;
}