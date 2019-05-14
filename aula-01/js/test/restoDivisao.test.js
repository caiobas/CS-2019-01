const funcao = require("../restoDivisao.js");

test("5, 3 = 2", () => {
    expect(funcao(5, 3)).toBe(2);
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

test("Valor de dividendo menor que 0 fora de faixa", () => {
    expect(() => { funcao(-1, 5); }).toThrow(RangeError);
});

test("Valor de divisor menor que 1 fora de faixa", () => {
    expect(() => funcao(1, 0)).toThrow(RangeError);
});