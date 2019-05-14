const funcao = require("../valorPI.js");

test("1000 = 3.140592653839794", () => {
    expect(funcao(1000)).toBe(3.140592653839794);
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

test("Valor de n menor que 1 fora de faixa", () => {
    expect(() => { funcao(0); }).toThrow(RangeError);
});