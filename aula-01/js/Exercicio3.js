function Exercicio3(dia, mes, ano) {
            
    if(typeof dia != 'number' || typeof mes != 'number' || typeof ano != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }
    
    if(dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano <= 1953) {
        return RangeError("Data incorreta. Dia deveria estar entre 1 e 31, mês entre 1 e 12 e ano igual ou maior que 1954.");
    }

    if(mes == 1 && mes == 2) {
        mes = mes + 12;
        ano = ano - 1;
    }

    let resultado = dia + (2 * mes) + (3 * (mes + 1) / 5) + ano + (ano / 4) - (ano / 100) + (ano / 400);
    resultado = (resultado % 7);
    resultado = Math.trunc(resultado);
    
    return resultado;

}