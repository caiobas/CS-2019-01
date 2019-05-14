const funcao = require("../propriedade153.js");

test("153 = true", () => {
    expect(funcao(153)).toBe(true);
});

test("154 = false", () => {
    expect(funcao(154)).toBe(false);
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

test("Valor de numero menor que 100 fora de faixa", () => {
    expect(() => { funcao(99); }).toThrow(RangeError);
});

test("Valor de numero maior que 999 fora de faixa", () => {
    expect(() => { funcao(1000); }).toThrow(RangeError);
});