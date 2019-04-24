function Exercicio2(numero) {
            
    if(typeof numero != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }
    
    if(numero < 100 || numero > 999) {
        return Error("Numero não está entre 100 e 999.");
    }

    let centena = numero / 100;
    centena = Math.trunc(centena);  
    const dezenaAux = numero % 100;
    let dezena = dezenaAux / 10;
    dezena = Math.trunc(dezena);
    const unidade = numero % 10;
    
    let resultado = (Math.pow(centena, 3)) + (Math.pow(dezena, 3)) + (Math.pow(unidade, 3));
    resultado = Math.trunc(resultado);
    
    return (resultado == numero);
}