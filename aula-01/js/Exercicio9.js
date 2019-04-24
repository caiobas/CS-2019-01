function Exercicio9(n) {
            
    if(typeof n != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }
    
    if(n < 1) {
        return RangeError("Numero não é maior ou igual a 1.");
    }

    var i = 1;
    var s = -1;
    var d = -1;
    var p = 0;

    while(i <= n) {
        d = d + 2;
        s = -1 * s;
        p = p + ((4 * s) / d);
        i = i + 1;
    }

    return p;
}