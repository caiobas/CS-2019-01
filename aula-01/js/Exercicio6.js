function Exercicio6(numero) {
            
    if(typeof numero != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }
    
    if(numero < 1) {
        return RangeError("Numero deve ser maior que 1.");
    }

    var i = 2;
    var f = 1;

    while(i <= numero) {
        f = f * i;
        i = i + 1;
    }

    return f;
}