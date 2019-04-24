function Exercicio21(d) {
            
    if(!d.isArray){
        TypeError("Este parâmetro não é um vetor.");
    }
    
    for(var i = 1; i < d.length; i++) {
        if(d[i] < 0 || d[i] > 9) {
            RangeError("Dados do vetor incorretos.")
        }
    }
    
    if(d.length != 12) {
        RangeError("Vetor de tamanho incorreto.");
    }

    var c = 8;
    var p = d[9];
    var s = d[9];

    while(1 <= c) {
        p = p + d[c];
        s = s + p;
        c = c - 1;
    }

    var j = ((s % 11) % 10);
    var k = (((s - p + (9 * d[10])) % 11) % 10);

    return ((j == d[10]) && (k == d[11]));
}