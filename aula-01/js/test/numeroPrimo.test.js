const funcao = require("../numeroPrimo.js");

test("19 = true", () => {
    expect(funcao(19)).toBe(true);
});

test("18 = false", () => {
    expect(funcao(18)).toBe(false);
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

test("Valor de n menor que 2 fora de faixa", () => {
    expect(() => { funcao(1); }).toThrow(RangeError);
});