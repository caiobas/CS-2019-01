const funcao = require("../logaritmo.js");

test("2, 2 = 6", () => {
    expect(funcao(2, 2)).toBe(6);
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

test("Valor de n menor que 1 fora de faixa", () => {
    expect(() => { funcao(0, 5); }).toThrow(RangeError);
});

test("Valor de k menor que 2 fora de faixa", () => {
    expect(() => funcao(1, 1)).toThrow(RangeError);
});