/**
 * Função matemática que verifica se a soma do cubo dos digitos do número é o próprio número.
 * 
 * @param {number} numero Número a ser verificado.
 * 
 * @returns {boolean} Retorna booleano para verificação. 
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} Número não está entre 100 e 999.
 */
function propriedade153(numero) {

    if (typeof numero != "number") {
        throw new TypeError("Este parâmetro não é um número.");
    }

    if (Math.trunc(numero) != numero) {
        throw new TypeError("Este parâmetro não é um inteiro.");
    }

    if (numero < 100 || numero > 999) {
        throw new RangeError("Numero não está entre 100 e 999.");
    }

    const centena = Math.trunc(numero / 100);
    const dezenaAux = numero % 100;
    const dezena = Math.trunc(dezenaAux / 10);
    const unidade = numero % 10;
    const resultado = Math.pow(centena, 3) + Math.pow(dezena, 3) + Math.pow(unidade, 3);

    return resultado == numero;
}

module.exports = propriedade153;