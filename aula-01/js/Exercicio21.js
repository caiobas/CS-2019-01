function Exercicio21(d) {
            
    if(!d.isArray){
        TypeError("Este parâmetro não é um vetor.");
    }
    
    if(d.length != 12) {
        RangeError("Vetor de tamanho incorreto.");
    }

    for(let i = 1; i < d.length; i++) {
        if(d[i] < 0 || d[i] > 9) {
            RangeError("Dados do vetor incorretos.")
        }
    }
    //A partir daqui
    let c = 8;
    let p = d[9];
    let s = d[9];

    while(1 <= c) {
        p = p + d[c];
        s = s + p;
        c = c - 1;
    }

    const j = ((s % 11) % 10);
    const k = (((s - p + (9 * d[10])) % 11) % 10);

    return ((j == d[10]) && (k == d[11]));
}