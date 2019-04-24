function Exercicio2(numero) {
            
    if(typeof numero != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }
    
    if(numero < 100 || numero > 999) {
        return Error("Numero não está entre 100 e 999.");
    }
    
    var resultado;
    var centena;
    var dezena;
    var dezenaAux;
    var unidade;

    centena = numero / 100;
    centena = Math.trunc(centena);  
    dezenaAux = numero % 100;
    dezena = dezenaAux / 10;
    dezena = Math.trunc(dezena);
    unidade = numero % 10;
    
    resultado = (Math.pow(centena, 3)) + (Math.pow(dezena, 3)) + (Math.pow(unidade, 3));
    resultado = Math.trunc(resultado);
    
    return (resultado == numero);
}