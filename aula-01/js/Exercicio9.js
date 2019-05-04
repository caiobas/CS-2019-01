function Exercicio9(n) {
            
    if(typeof n != "number"){
        return TypeError("Este parâmetro não é um número.");
    }
    
    if(n < 1) {
        return RangeError("Numero não é maior ou igual a 1.");
    }

    let s = -1;
    let d = -1;
    let p = 0;

    for(let i = 1; i <= n; i++){
        d = d + 2;
        s = -1 * s;
        p = p + ((4 * s) / d);
    }

    return p;
}