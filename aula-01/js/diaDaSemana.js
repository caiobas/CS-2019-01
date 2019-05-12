/**
 * Função matemática que verifica o dia da semana de uma determinada data.
 * 
 * @param {number} dia Dia a ser verificado.
 * @param {number} mes Mês a ser verificado.
 * @param {number} ano Ano a ser verificado.
 * 
 * @returns {number} Retorna número entre 0 e 6, sendo 0 segunda-feria seguindo para 6 domingo. 
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

    if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano <= 1953) {
        throw new RangeError("Data incorreta. Dia deveria estar entre 1 e 31, mês entre 1 e 12 e ano igual ou maior que 1954.");
    }

    if (mes == 1 && mes == 2) {
        mes = mes + 12;
        ano = ano - 1;
    }

    let resultado = dia + (2 * mes) + (3 * (mes + 1) / 5) + ano + (ano / 4) - (ano / 100) + (ano / 400);

    return Math.trunc(resultado % 7);
}