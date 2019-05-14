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
function cpf1(d) {

    if (!Array.isArray(d)) {
        throw new TypeError("Este parâmetro não é um vetor.");
    }

    if (d.length != 11) {
        throw new RangeError("Vetor de tamanho incorreto.");
    }

    confereDadosVetor(d);

    const j = d[0] + 2 * (d[1]) + 3 * (d[2]) + 4 * (d[3]) + 5 * (d[4]) + 6 * (d[5]) + 7 * (d[6]) + 8 * (d[7]) + 9 * (d[8]);
    const k = d[1] + 2 * (d[2]) + 3 * (d[3]) + 4 * (d[4]) + 5 * (d[5]) + 6 * (d[6]) + 7 * (d[7]) + 8 * (d[8]) + 9 * (d[9]);
    const dj = (j % 11) % 10;
    const dk = (k % 11) % 10;

    return (dj == d[9]) && (dk == d[10]);
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

    for (let i = 0; i < d.length; i++) {
        if (Math.trunc(d[i]) != d[i]) {
            throw new TypeError("Espera-se dados inteiros em cada elemento do vetor.");
        }
        if (d[i] < 0 || d[i] > 9) {
            throw new RangeError("Espera-se dados de cada elemento do vetor entre 0 e 9.");
        }
    }
}

module.exports = {f1: cpf1, f2: confereDadosVetor};