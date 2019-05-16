/**
 * Função matemática que verifica o dia da semana de uma determinada data.
 * 
 * @param {number} dia Dia a ser verificado.
 * @param {number} mes Mês a ser verificado.
 * @param {number} ano Ano a ser verificado.
 * 
 * @returns {String} Retorna dia da semana. 
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número ou inteiro.
 * @throws {RangeError} Se qualquer um dos argumentos não estiver dentro dos parâmetros de data.
 */
function diaDaSemana(dia, mes, ano) {

    if (typeof dia != "number" || typeof mes != "number" || typeof ano != "number") {
        throw new TypeError("Este parâmetro não é um número.");
    }

    if (Math.trunc(dia) != dia || Math.trunc(mes) != mes || Math.trunc(ano) != ano) {
        throw new TypeError("Este número não corresponde a uma data.");
    }

    if (dataInvalida(dia, mes, ano)) {
        throw new RangeError("Data incorreta. Dia deveria estar entre 1 e 31, mês entre 1 e 12 e ano igual ou maior que 1954.");
    }

    if (mes == 1 && mes == 2) {
        mes = mes + 12;
        ano = ano - 1;
    }

    let resultado = dia + (2 * mes) + Math.floor(3 * (mes + 1) / 5) + ano + Math.floor(ano / 4) - Math.floor(ano / 100) + Math.floor(ano / 400);

    return nomeDiaDaSemana(Math.trunc(resultado % 7));
}

/**
 * Função que retorna o dia da semana baseado no resultado da função diaDaSemana.
 * 
 * @param {number} resultado resultado utilizado para identificar dia da semana.
 * 
 * @returns {String} Retorna dia da semana. 
 */
function nomeDiaDaSemana(resultado) {

    switch (resultado) {
        case 0:
            return "Segunda-feira"
            break;
        case 1:
            return "Terca-feira"
            break;
        case 2:
            return "Quarta-feira"
            break;
        case 3:
            return "Quinta-feira"
            break;
        case 4:
            return "Sexta-feira"
            break;
        case 5:
            return "Sabado"
            break;
        case 6:
            return "Domingo"
            break;
    }
}

/**
 * Função que confere se a data passada na função diaDaSemana corresponde com uma data válida.
 * 
 * @param {number} dia Dia a ser verificado.
 * @param {number} mes Mês a ser verificado.
 * @param {number} ano Ano a ser verificado.
 * 
 * @returns {boolean} Retorna booleano com o resultado da verificação. 
 */
function dataInvalida(dia, mes, ano) {

    if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano <= 1753) {
        return true;
    }
    return false;
}

module.exports = {f1: diaDaSemana, f2: nomeDiaDaSemana, f3: dataInvalida};