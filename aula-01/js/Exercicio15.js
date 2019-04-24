function Exercicio15(n) {
            
    if(typeof n != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }

    if(Math.trunc(n) != n){
        return TypeError("Este parâmetro não é um inteiro.");
    }
    
    if(n < 2) {
        return RangeError("n deve ser maior ou igual a 2.");
    }

    let a = [];

    for(let i = 1; i < (n+1); i++) {
        a[i] = 0;
    }

    const limite = Math.floor((Math.sqrt(n)));

    for(let i = 2; i <= limite; i++){
        if(a[i] == 0) {
            let multiplo = i + i;
            while(multiplo <= n) {
                a[multiplo] = 1;
                multiplo = multiplo + i;
            }
        }
    }

    return (a[n] == 1);
}