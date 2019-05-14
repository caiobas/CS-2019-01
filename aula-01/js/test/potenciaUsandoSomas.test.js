const funcao = require("../potenciaUsandoSomas.js");

test("2, 5 = 32", () => {
    expect(funcao(2, 5)).toBe(32);
});

test("argumento null/undefined", () => {
    expect(() => { funcao(); }).toThrow(TypeError);
});

test("argumento nao numerico", () => {
    expect(() => { funcao("abcd", 3); }).toThrow(TypeError);
});

test("valor deve ser inteiro", () => {
    expect(() => funcao(2, 3.5)).toThrow(TypeError);
});

test("Valor de x menor que 0 fora de faixa", () => {
    expect(() => { funcao(-1, 5); }).toThrow(RangeError);
});

test("Valor de y menor que 0 fora de faixa", () => {
    expect(() => funcao(-5, 1)).toThrow(RangeError);
});