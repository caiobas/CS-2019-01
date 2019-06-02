
function menorTemperatura(vetor) {

    if(!Array.isArray(vetor)) {
        throw new TypeError("Parâmetro deve ser um vetor.")
    }

    for(let contador = 0; contador < vetor.length; contador++) {
        if(typeof vetor[contador] != 'number'){
            throw new TypeError("O vetor deve conter apenas números.")
        }
    }

    vetor.sort();

    return vetor[0];
}

module.exports = menorTemperatura;