function Exercicio1(numero) {

    // "let" é mais recomendado neste cenário
    // Mais de uma declaracao por linha? Suspeito!!!!
    // let resultado, primDez, segDez, confere;

    const confere = Math.trunc(numero);

    if (confere != numero)
        return false;

    if (numero >= 0 && numero <= 9999) {
        let primDez = numero / 100;
        primDez = Math.trunc(primDez);
        const segDez = numero % 100;

        let resultado = (primDez + segDez);
        resultado = Math.pow(resultado, 2);
        resultado = Math.trunc(resultado);

        if (resultado == numero)
            return true;
        return false;
    }
    return false;
}