function Exercicio13(n, i) {
            
    if(typeof n != "number" || typeof i != "number"){
        return TypeError("Este parâmetro não é um número.");
    }
    
    if(n < 1) {
        return RangeError("n deve ser maior ou igual a 1.");
    }

    let r = 1;

    while(0 <= i) {
        r = (r + n/r) / 2;
        i = i - 1;
    }
    
    return r;
}