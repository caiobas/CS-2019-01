/**
 * Função matemática que verifica se o número é primo.
 * 
 * @param {number} numero Número para conferir se é número primo.
 * 
 * @returns {boolean} Retorna booleano se é número primo.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} numero deve ser maior ou igual a 2.
 */
function crivoErastotenes(numero) {

    if (typeof numero != "number") {
        throw new TypeError("Este parâmetro não é um número.");
    }

    if (Math.trunc(numero) != numero) {
        throw new TypeError("Este parâmetro não é um inteiro.");
    }

    if (numero < 2) {
        throw new RangeError("numero deve ser maior ou igual a 2.");
    }

    let vetor = [];

    for (let contador = 1; contador < (numero + 1); contador++) {
        vetor[contador] = 0;
    }

    const limite = Math.floor(Math.sqrt(numero));

    for (let contador = 2; contador <= limite; contador++) {
        if (vetor[contador] == 0) {
            let multiplo = contador + contador;
            while (multiplo <= numero) {
                vetor[multiplo] = 1;
                multiplo = multiplo + contador;
            }
        }
    }

    return vetor[numero] == 1;
}

module.exports = crivoErastotenes;