function Exercicio19(n) {
            
    if(typeof n != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }
    
    if(n < 0) {
        return RangeError("n deve ser maior ou igual a 0.");
    }

    if(n == 0 || n == 1) {
        return n;
    }

    var a = 0;
    var c = 1;
    var i = 2;

    while(i <= n) {
        var t = c;
        c = c + a;
        a = t;
        i = i + 1;
    }

    return c;
}