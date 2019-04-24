function Exercicio14(n) {
            
    if(typeof n != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }
    
    if(n < 2) {
        return RangeError("n deve ser maior ou igual a 2.");
    }

    for(let i = 2; i < n; i++){
        if((n % i) == 0) {
            return false;
        }
    }
    
    return true;
}