function Exercicio11(x, y, k) {
            
    if(typeof x != 'number' || typeof y != 'number' || typeof k != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }
    
    if(x < 0 || y < x || k <= 0) {
        return RangeError("x deve ser maior ou igual a 0, y deve ser maior que x e k maior que 0.");
    }

    var c = y;		
    var a = x;
    var i = 1;
    var t;

    while(i <= k) {
        t = c;
        c = c + a;
        a = t;
        i = i + 1;
    }

    return (c / a);
}