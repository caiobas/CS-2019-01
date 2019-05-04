function Exercicio8(x, y) {
            
    if(typeof x != "number" || typeof y != "number"){
        throw new TypeError("Este parâmetro não é um número.");
    }

    if(Math.trunc(x) != x || Math.trunc(y) != y){
        throw new TypeError("Um(ou mais) parâmetro(s) não é um inteiro.");
    }
    
    if(x < 0 || y < 0) {
        throw new RangeError("x e y devem ser maiores ou igual a 0");
    }

    let potencia = 1;

    for(let i = 1; i <= y; i++){
        potencia = Exercicio7(potencia, x);
    }

    return potencia;
}