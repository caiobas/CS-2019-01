function Exercicio6(numero) {
            
    if(typeof numero != "number"){
        throw new TypeError("Este parâmetro não é um número.");
    }

    if(Math.trunc(numero) != numero){
        throw new TypeError("Este parâmetro não é um inteiro.");
    }
    
    if(numero < 1) {
        throw new RangeError("Numero deve ser maior que 1.");
    }

    let f = 1;

    for(let i = 2; i <= numero; i++){
        f = f * i;
    }

    return f;
}