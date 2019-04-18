function Exercicio1(numero) {
    var resultado, primDez, segDez, confere;

    confere = Math.trunc(numero);

    if (confere != numero)
        return false;

    if (numero >= 0 && numero <= 9999) {
        primDez = numero / 100;
        primDez = Math.trunc(primDez);
        segDez = numero % 100;

        resultado = (primDez + segDez);
        resultado = Math.pow(resultado, 2);
        resultado = Math.trunc(resultado);

        if (resultado == numero)
            return true;
        return false;
    }
    return false;
}