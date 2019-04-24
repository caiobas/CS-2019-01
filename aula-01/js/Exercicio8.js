function Exercicio8(x, y) {
            
    if(typeof x != 'number' || typeof y != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }
    
    if(x < 0 || y < 0) {
        return RangeError("x e y devem ser maiores ou igual a 0");
    }

    var potencia;
    var i;

    potencia = 1;
    i = 1;

    while(i <= y) {
        potencia = Exercicio7(potencia, x);
        i = i + 1;
    }

    return potencia;
}