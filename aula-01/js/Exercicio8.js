function Exercicio8(x, y) {
            
    if(typeof x != 'number' || typeof y != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }
    
    if(x < 0 || y < 0) {
        return RangeError("x e y devem ser maiores ou igual a 0");
    }

    let potencia = 1;

    for(let i = 1; i <= y; i++){
        potencia = Exercicio7(potencia, x);
    }

    return potencia;
}