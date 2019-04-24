function Exercicio19(n) {
            
    if(typeof n != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }

    if(Math.trunc(n) != n){
        return TypeError("Este parâmetro não é um inteiro.");
    }
    
    if(n < 0) {
        return RangeError("n deve ser maior ou igual a 0.");
    }

    if(n == 0 || n == 1) {
        return n;
    }

    let a = 0;
    let c = 1;

    for(let i = 2; i <= n; i++){
        var t = c; //Mesma duvida referente ao Exercicio11 e 16
        c = c + a;
        a = t;
    }

    return c;
}