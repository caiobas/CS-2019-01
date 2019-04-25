function Exercicio2(numero) {
            
    if(typeof numero != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }

    if(Math.trunc(numero) != numero){
        return TypeError("Este parâmetro não é um inteiro.");
    }
    
    if(numero < 100 || numero > 999) {
        return Error("Numero não está entre 100 e 999.");
    }

    const centena = Math.trunc(numero / 100);  
    const dezenaAux = numero % 100;
    const dezena = Math.trunc(dezenaAux / 10);
    const unidade = numero % 10;
    const resultado = Math.pow(centena, 3) + Math.pow(dezena, 3) + Math.pow(unidade, 3);
    
    return resultado == numero;
}