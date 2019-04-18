function Exercicio1(numero) {

    // "let" é mais recomendado neste cenário
    // Mais de uma declaracao por linha? Suspeito!!!!
    // let resultado, primDez, segDez, confere;

    // Melhor forma (use chaves para delimitar blocos)
    if (Math.trunc(numero) != numero) {
        return false;
    }

    if (numero < 0 || numero > 9999) {
        return false;
    }

    const primDez = Math.trunc(numero / 100);
    const segDez = numero % 100;

    // TODO nome enganoso, pois não guarda o resultado (da função)
    let resultado = primDez + segDez;
    resultado = Math.pow(resultado, 2);

    // TODO suspeito que esta linha é desnecessária??!!!
    resultado = Math.trunc(resultado);

    return resultado == numero;
}