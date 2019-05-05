/**
 * Função matemática que calcula resto de divisão inteira.
 * 
 * @param {number} dividendo Dividendo a ser verificado.
 * @param {number} divisor Divisor a ser verificado.
 * 
 * @returns {number} Retorna resto da divisão inteira. 
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} Divisor deve ser maior que 0 e dividendo deve ser maior ou igual a 0.
 */

function Exercicio4(dividendo, divisor) {
        
    if(typeof dividendo != "number" || typeof divisor != "number"){
        throw new TypeError("Um(ou mais) parâmetro(s) não é um número.");
    }

    if(Math.trunc(dividendo) != dividendo || Math.trunc(divisor) != divisor){
        throw new TypeError("Um(ou mais) parâmetro(s) não é um inteiro.");
    }

    if(dividendo < 0 || divisor <= 0) {
        throw new RangeError("Divisor deve ser maior que 0 e dividendo deve ser maior ou igual a 0.");
    }

    let resto = dividendo;

    while(divisor <= resto) {
        resto = resto - divisor;
    }

    return resto;
}