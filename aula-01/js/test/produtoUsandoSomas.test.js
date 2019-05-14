const funcao = require("../produtoUsandoSomas.js");

test("2, 4 = 8", () => {
    expect(funcao(2, 4)).toBe(8);
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

test("Valor de a menor que 0 fora de faixa", () => {
    expect(() => { funcao(-1, 5); }).toThrow(RangeError);
});

test("Valor de b menor que 0 fora de faixa", () => {
    expect(() => funcao(1, -4)).toThrow(RangeError);
});