function Exercicio10(n, k) {
            
    if(typeof n != 'number' || typeof k != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }
    
    if(n < 1 || k < 2) {
        return RangeError("n deve ser maior ou igual a 1 e k maior ou igual a 2.");
    }

    var i = 2;
    var e = (i + n);
    var numerador = n;
    var denominador = 1;

    while(i <= k) {
        numerador = (numerador * numerador);
        denominador = (denominador * i);
        e = e + (numerador / denominador);
        i = i + 1;
    }

    return e;
}