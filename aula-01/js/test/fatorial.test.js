const funcao = require("../fatorial.js");

test("5 fatorial = 120 (caso classico)", () => {
    expect(funcao(5)).toBe(120);
});

test("4 fatorial = 24", () => {
    expect(funcao(4)).toBe(24);
});

test("argumento null/undefined", () => {
    expect(() => { funcao(); }).toThrow(TypeError);
});

test("argumento nao numerico", () => {
    expect(() => { funcao("abcd"); }).toThrow(TypeError);
});

test("valor deve ser inteiro", () => {
    expect(() => funcao(10.3)).toThrow(TypeError);
});

test("valor menor que 1 fora de faixa", () => {
    expect(() => { funcao(-5); }).toThrow(RangeError);
});