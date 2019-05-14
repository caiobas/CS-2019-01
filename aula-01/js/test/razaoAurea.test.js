const funcao = require("../razaoAurea.js");

test("1, 2, 1000 = 1.6180339887498947", () => {
    expect(funcao(1, 2, 1000)).toBe(1.6180339887498947);
});

test("argumento null/undefined", () => {
    expect(() => { funcao(); }).toThrow(TypeError);
});

test("argumento nao numerico", () => {
    expect(() => { funcao("abcd", 2, 1000); }).toThrow(TypeError);
});

test("valor deve ser inteiro", () => {
    expect(() => funcao(2, 3.5, 1000)).toThrow(TypeError);
});

test("Valor de x menor que 0 fora de faixa", () => {
    expect(() => { funcao(-1, 2, 1000); }).toThrow(RangeError);
});

test("Valor de y menor que x fora de faixa", () => {
    expect(() => funcao(2, 1, 1000)).toThrow(RangeError);
});

test("Valor de k menor que 1 fora de faixa", () => {
    expect(() => funcao(1, 2, 0)).toThrow(RangeError);
});