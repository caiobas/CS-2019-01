function Exercicio14(n) {
            
    if(typeof n != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }
    
    if(n < 2) {
        return RangeError("n deve ser maior ou igual a 2.");
    }

    var i = 2;

    while(i < n) {
        if((n % i) == 0) {
            return false;
        }
        i = i + 1;
    }
    
    return true;
}