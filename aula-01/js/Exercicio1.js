function Exercicio1(numero) {
            
    if(typeof numero != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }
    
    if(numero < 0 || numero > 9999) {
        return RangeError("Numero não está entre 0 e 9999.");
    }
    
    let primDez = numero / 100;
    primDez = Math.trunc(primDez);
    const segDez = numero % 100;
     
    let resultado = (primDez + segDez);
    resultado = Math.pow(resultado, 2);
    resultado = Math.trunc(resultado);
        
    return (resultado == numero);
}