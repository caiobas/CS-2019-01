function Exercicio17(a, b) {
            
    if(typeof a != 'number' || typeof b != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }
    
    if(a < b || b < 1) {
        return RangeError("a deve ser maior ou igual a b e b deve ser maior que 0.");
    }

    while(a != b) {
        if(a > b){
            a = a - b;
        }
        else{
            b = b - a;
        }
    }

    return a;
}