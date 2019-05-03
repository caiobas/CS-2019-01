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

function Exercicio21(d) {
            
    if(!d.isArray){
        TypeError("Este parâmetro não é um vetor.");
    }
    
    if(d.length != 11) {
        RangeError("Vetor de tamanho incorreto.");
    }

    for(let i = 0; i < d.length; i++) {
        if(d[i] < 0 || d[i] > 9 || Math.trunc(d[i]) != d[i]) {
            RangeError("Dados do vetor incorretos.")
        }
    }

    let p = d[8];
    let s = d[8];

    for(let c = 7; 0 <= c; c--){
        p = p + d[c];
        s = s + p;
    }

    const j = (s % 11) % 10;
    const k = ((s - p + (9 * d[9])) % 11) % 10;

    return (j == d[9]) && (k == d[10]);
}