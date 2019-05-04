function Exercicio4(dividendo, divisor) {
        
    if(typeof dividendo != "number" || typeof divisor != "number"){
        throw new TypeError("Um(ou mais) parâmetro(s) não é um número.");
    }

    if(Math.trunc(dividendo) != dividendo || Math.trunc(divisor) != divisor){
        throw new TypeError("Um(ou mais) parâmetro(s) não é um inteiro.");
    }

    if(dividendo < 0 || divisor <= 0) {
        throw new RangeError("Divisor deve ser maior que 0 e dividendo deve ser maior ou igual a 0.");
    }

    let resto = dividendo;

    while(divisor <= resto) {
        resto = resto - divisor;
    }

    return resto;
}