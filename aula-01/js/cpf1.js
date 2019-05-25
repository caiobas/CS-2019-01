/**
 * Função matemática para conferir CPF.
 * 
 * @param {Array} vetor Array com digitos para conferir.
 * 
 * @returns {boolean} Retorna booleano se é CPF.
 * 
 * @throws {TypeError} Se o parâmetro não for um vetor.
 * @throws {RangeError} Se o vetor tiver tamanho incorreto.
 */
function cpf1(vetor) {

    if (!Array.isArray(vetor)) {
        throw new TypeError("Este parâmetro não é um vetor.");
    }

    if (vetor.length != 11) {
        throw new RangeError("Vetor de tamanho incorreto.");
    }

    confereDadosVetor(vetor);

    const comparaUm = vetor[0] + 2 * (vetor[1]) + 3 * (vetor[2]) + 4 * (vetor[3]) + 5 * (vetor[4]) + 6 * (vetor[5]) + 7 * (vetor[6]) + 8 * (vetor[7]) + 9 * (vetor[8]);
    const comparaDois = vetor[1] + 2 * (vetor[2]) + 3 * (vetor[3]) + 4 * (vetor[4]) + 5 * (vetor[5]) + 6 * (vetor[6]) + 7 * (vetor[7]) + 8 * (vetor[8]) + 9 * (vetor[9]);
    const vetorComparaUm = (comparaUm % 11) % 10;
    const vetorComparaDois = (comparaDois % 11) % 10;

    return (vetorComparaUm == vetor[9]) && (vetorComparaDois == vetor[10]);
}

/**
 * Função matemática para conferir dados do vetor de CPF.
 * 
 * @param {Array} vetor Array com digitos para conferir.
 * 
 * @throws {TypeError} Se qualquer um dos elementos do vetor não forem inteiro.
 * @throws {RangeError} Se qualquer um dos elementos do vetor não possuir números entre 0 e 9.
 */
function confereDadosVetor(vetor) {

    for (let contador = 0; contador < vetor.length; contador++) {
        if (Math.trunc(vetor[contador]) != vetor[contador]) {
            throw new TypeError("Espera-se dados inteiros em cada elemento do vetor.");
        }
        if (vetor[contador] < 0 || vetor[contador] > 9) {
            throw new RangeError("Espera-se dados de cada elemento do vetor entre 0 e 9.");
        }
    }
}

module.exports = {f1: cpf1, f2: confereDadosVetor};