function Exercicio5(numero) {
            
    if(typeof numero != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }
    
    if(numero < 1) {
        return RangeError("Numero deve ser maior que 1.");
    }

    var i = 2;
    var s = 1;

    while(i <= numero) {
        s = s + i;
        i = i + 1;
    }

    return s;
}