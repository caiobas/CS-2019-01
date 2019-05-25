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
function cpf2(vetor) {

    if (!Array.isArray(vetor)) {
        throw new TypeError("Este parâmetro não é um vetor.");
    }

    if (vetor.length != 11) {
        throw new RangeError("Vetor de tamanho incorreto.");
    }

    confereDadosVetor(vetor);

    let auxiliaValorUm = vetor[8];
    let auxiliaValorDois = vetor[8];

    for (let contador = 7; 0 <= contador; contador--) {
        auxiliaValorUm = auxiliaValorUm + vetor[contador];
        auxiliaValorDois = auxiliaValorDois + auxiliaValorUm;
    }

    const comparaUm = (auxiliaValorDois % 11) % 10;
    const comparaDois = ((auxiliaValorDois - auxiliaValorUm + (9 * vetor[9])) % 11) % 10;

    return (comparaUm == vetor[9]) && (comparaDois == vetor[10]);
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

module.exports = {f1: cpf2, f2: confereDadosVetor};