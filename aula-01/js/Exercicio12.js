function Exercicio12(n) {
            
    if(typeof n != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }
    
    if(n < 1) {
        return RangeError("n deve ser maior ou igual a 1.");
    }

    let i = 1;
    let s = 1;

    while(s < n) {
        i = i + 2;
        s = s + i;
    }

    return (s == n);
}