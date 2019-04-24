function Exercicio10(n, k) {
            
    if(typeof n != 'number' || typeof k != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }

    if(Math.trunc(n) != n || Math.trunc(k) != k){
        return TypeError("Um(ou mais) parâmetro(s) não é um inteiro.");
    }
    
    if(n < 1 || k < 2) {
        return RangeError("n deve ser maior ou igual a 1 e k maior ou igual a 2.");
    }

    let i = 2;
    let e = (i + n);
    let numerador = n;
    let denominador = 1;

    for(; i <= k; i++){
        numerador = (numerador * numerador);
        denominador = (denominador * i);
        e = e + (numerador / denominador);
    }

    return e;
}