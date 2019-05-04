function Exercicio7(a, b) {
            
    if(typeof a != "number" || typeof b != "number"){
        return TypeError("Este(s) parâmetro(s) não é um número.");
    }

    if(Math.trunc(a) != a || Math.trunc(b) != b){
        return TypeError("Um(ou mais) parâmetro(s) não é um inteiro.");
    }
    
    if(a < 0 || b < 0) {
        return RangeError("a e b devem ser maior ou igual a 0.");
    }

    let totalParcelas = a;
    let parcela = b;

    if(b < a) {
        totalParcelas = b;
        parcela = a;
    }

    let s = 0;

    for(let i = 1; i <= totalParcelas; i++){
        s = s + parcela;
    }

    return s;
}