function Exercicio20(d) {
            
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
    
    var j = d[1] + 2*(d[2]) + 3*(d[3]) + 4*(d[4]) + 5*(d[5]) + 6*(d[6]) + 7*(d[7]) + 8*(d[8]) + 9*(d[9]);   
    var k = d[2] + 2*(d[3]) + 3*(d[4]) + 4*(d[5]) + 5*(d[6]) + 6*(d[7]) + 7*(d[8]) + 8*(d[9]) + 9*(d[10]);
    var dj = ((j %  11) % 10);
    var dk = ((k %  11) % 10);

    return ((dj == d[10]) && (dk == d[11]));
}