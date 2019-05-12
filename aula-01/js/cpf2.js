/**
 * Função matemática para conferir CPF.
 * 
 * @param {Array} d Array com digitos para conferir.
 * 
 * @returns {boolean} Retorna booleano se é CPF.
 * 
 * @throws {TypeError} Se o parâmetro não for um vetor.
 * @throws {RangeError} Se o vetor tiver tamanho incorreto.
 */
function cpf2(d) {

    if (!d.isArray) {
        throw new TypeError("Este parâmetro não é um vetor.");
    }

    if (d.length != 11) {
        throw new RangeError("Vetor de tamanho incorreto.");
    }

    confereDadosVetor(d);

    let p = d[8];
    let s = d[8];

    for (let c = 7; 0 <= c; c--) {
        p = p + d[c];
        s = s + p;
    }

    const j = (s % 11) % 10;
    const k = ((s - p + (9 * d[9])) % 11) % 10;

    return (j == d[9]) && (k == d[10]);
}

/**
 * Função matemática para conferir dados do vetor de CPF.
 * 
 * @param {Array} d Array com digitos para conferir.
 * 
 * @throws {TypeError} Se qualquer um dos elementos do vetor não forem inteiro.
 * @throws {RangeError} Se qualquer um dos elementos do vetor não possuir números entre 0 e 9.
 */
function confereDadosVetor(d) {

    for (let i = 1; i < d.length; i++) {
        if (Math.trunc(d[i]) != d[i]) {
            throw new TypeError("Espera-se dados inteiros em cada elemento do vetor.");
        }
        if (d[i] < 0 || d[i] > 9) {
            throw new RangeError("Espera-se dados de cada elemento do vetor entre 0 e 9.");
        }
    }
}

module.exports = {cpf2, confereDadosVetor};