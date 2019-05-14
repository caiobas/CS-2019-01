const funcao = require("../somaPrimeirosNaturais.js");

test("5 = 15", () => {
    expect(funcao(5)).toBe(15);
});

test("argumento null/undefined", () => {
    expect(() => { funcao(); }).toThrow(TypeError);
});

test("argumento nao numerico", () => {
    expect(() => { funcao("abcd"); }).toThrow(TypeError);
});

test("valor deve ser inteiro", () => {
    expect(() => funcao(3.5)).toThrow(TypeError);
});

test("Valor de numero menor que 1 fora de faixa", () => {
    expect(() => { funcao(0); }).toThrow(RangeError);
});