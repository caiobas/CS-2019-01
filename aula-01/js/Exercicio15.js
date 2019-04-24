function Exercicio15(n) {
            
    if(typeof n != 'number'){
        return TypeError("Este parâmetro não é um número.");
    }
    
    if(n < 2) {
        return RangeError("n deve ser maior ou igual a 2.");
    }

    var a = [];

    for(var i=1; i<n+1; i++) {
        a[i] = 0;
    }

    var i = 2;
    var limite = Math.floor((Math.sqrt(n)));

    while(i <= limite) {
        if(a[i] == 0) {
            var multiplo = i + i;
            while(multiplo <= n) {
                a[multiplo] = 1;
                multiplo = multiplo + i;
            }
        }
        i = i + 1;
    }

    return (a[n] == 1);
}