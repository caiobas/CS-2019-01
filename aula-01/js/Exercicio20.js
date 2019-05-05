/**
 * Função matemática para conferir CPF.
 * 
 * @param {Array} d Array com digitos para conferir.
 * 
 * @returns {boolean} Retorna booleano se é CPF.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} Vetor de tamanho incorreto ou com dígitos incorretos.
 */

function Exercicio20(d) {
            
    if(!d.isArray){
        throw new TypeError("Este parâmetro não é um vetor.");
    }
    
    if(d.length != 12) {
        throw new RangeError("Vetor de tamanho incorreto.");
    }

    for(let i = 1; i < d.length; i++) {
        if(d[i] < 0 || d[i] > 9 || Math.trunc(d[i]) != d[i]) {
            throw new RangeError("Dados do vetor incorretos.");
        }
    }
    
    const j = d[0] + 2*(d[1]) + 3*(d[2]) + 4*(d[3]) + 5*(d[4]) + 6*(d[5]) + 7*(d[6]) + 8*(d[7]) + 9*(d[8]);   
    const k = d[1] + 2*(d[2]) + 3*(d[3]) + 4*(d[4]) + 5*(d[5]) + 6*(d[6]) + 7*(d[7]) + 8*(d[8]) + 9*(d[9]);
    const dj = (j %  11) % 10;
    const dk = (k %  11) % 10;

    return (dj == d[9]) && (dk == d[10]);
}