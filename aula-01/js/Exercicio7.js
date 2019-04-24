function Exercicio7(a, b) {
            
    if(typeof a != 'number' || typeof b != 'number'){
        return TypeError("Este(s) parâmetro(s) não é um número.");
    }
    
    if(a < 0 || b < 0) {
        return RangeError("a e b devem ser maior ou igual a 0.");
    }

    var totalParcelas;
    var parcela;

    totalParcelas = a;
    parcela = b;

    if(b < a) {
        totalParcelas = b;
        parcela = a;
    }

    var i;
    var s;

    i = 1;
    s = 0;

    while(i <= totalParcelas) {
        s = s + parcela;
        i = i + 1;
    }

    return s;
}