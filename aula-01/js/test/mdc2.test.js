const funcao = require("../mdc2.js");

test("81, 54 = 27", () => {
    expect(funcao(81, 54)).toBe(27);
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

test("Valor de a menor que b fora de faixa", () => {
    expect(() => { funcao(4, 5); }).toThrow(RangeError);
});

test("Valor de b menor que 1 fora de faixa", () => {
    expect(() => funcao(1, 0)).toThrow(RangeError);
});