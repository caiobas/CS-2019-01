const funcao = require("../quadradoPerfeito.js");

test("36 = true", () => {
    expect(funcao(36)).toBe(true);
});

test("30 = false", () => {
    expect(funcao(30)).toBe(false);
});

test("argumento null/undefined", () => {
    expect(() => { funcao(); }).toThrow(TypeError);
});

test("argumento nao numerico", () => {
    expect(() => { funcao("abcd"); }).toThrow(TypeError);
});

test("Valor de n menor que 1 fora de faixa", () => {
    expect(() => { funcao(0); }).toThrow(RangeError);
});