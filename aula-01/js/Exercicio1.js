module.exports = Exercicio1;

function Exercicio1(numero) {
            
    if(typeof numero != "number"){
        throw new TypeError("Este parâmetro não é um número.");
    }

    if(Math.trunc(numero) != numero){
        throw new TypeError("Este parâmetro não é um inteiro.");
    }
    
    if(numero < 0 || numero > 9999) {
        throw new RangeError("Numero não está entre 0 e 9999.");
    }
    
    const primDez = Math.trunc(numero / 100);
    const segDez = numero % 100;
    const resultado = Math.pow(primDez + segDez, 2);
        
    return resultado == numero;
}