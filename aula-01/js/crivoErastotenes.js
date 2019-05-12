/**
 * Função matemática que verifica se o número é primo.
 * 
 * @param {number} n Número para conferir se é número primo.
 * 
 * @returns {boolean} Retorna booleano se é número primo.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} n deve ser maior ou igual a 2.
 */
function crivoErastotenes(n) {

    if (typeof n != "number") {
        throw new TypeError("Este parâmetro não é um número.");
    }

    if (Math.trunc(n) != n) {
        throw new TypeError("Este parâmetro não é um inteiro.");
    }

    if (n < 2) {
        throw new RangeError("n deve ser maior ou igual a 2.");
    }

    let a = [];

    for (let i = 1; i < (n + 1); i++) {
        a[i] = 0;
    }

    const limite = Math.floor(Math.sqrt(n));

    for (let i = 2; i <= limite; i++) {
        if (a[i] == 0) {
            let multiplo = i + i;
            while (multiplo <= n) {
                a[multiplo] = 1;
                multiplo = multiplo + i;
            }
        }
    }

    return a[n] == 1;
}

module.exports = crivoErastotenes;