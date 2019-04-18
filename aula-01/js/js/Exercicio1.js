function Exercicio1(numero) {

    // "let" é mais recomendado neste cenário
    // Mais de uma declaracao por linha? Suspeito!!!!
    // let resultado, primDez, segDez, confere;

    // Melhor forma (use chaves para delimitar blocos)
    if (Math.trunc(numero) != numero) {
        return false;
    }

    if (numero >= 0 && numero <= 9999) {
        const primDez = Math.trunc(numero / 100);
        const segDez = numero % 100;

        let resultado = primDez + segDez;
        resultado = Math.pow(resultado, 2);
        resultado = Math.trunc(resultado);

        if (resultado == numero)
            return true;
        return false;
    }
    return false;
}