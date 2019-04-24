function Exercicio18(x, g) {
            
    if(typeof x != 'number' || typeof g != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }
    
    if(g < 1) {
        return RangeError("g deve ser maior ou igual a 1.");
    }

    var a = [g+1];

    //Não compreendi a forma de leitura.

    var p = a[g];
    var i = g-1;

    while(0 <= i) {
        p = p * (x + a[i]);
        i = i - 1;
    }

    return p;
}