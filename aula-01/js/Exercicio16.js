function Exercicio16(a, b) {
            
    if(typeof a != "number" || typeof b != "number"){
        throw new TypeError("Este parâmetro não é um número.");
    }

    if(Math.trunc(a) != a || Math.trunc(b) != b){
        throw new TypeError("Um(ou mais) parâmetro(s) não é um inteiro.");
    }
    
    if(a < b || b < 1) {
        throw new RangeError("a deve ser maior ou igual a b e b deve ser maior que 0.");
    }

    let m; //Mesma duvida do Exercicio11

    while(b != 0) {
        m = a % b;
        a = b;
        b = m;
    }

    return a;
}