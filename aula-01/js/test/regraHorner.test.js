const funcao = require("../regraHorner.js");

test("1, 2, [0, 1, 2] = 4", () => {
    expect(funcao(1, 2, [0, 1, 2])).toBe(4);
});

test("argumento null/undefined", () => {
    expect(() => { funcao(); }).toThrow(TypeError);
});

test("argumento nao numerico", () => {
    expect(() => { funcao("abcd", 2, [0, 1, 2]); }).toThrow(TypeError);
});

test("argumento nao e vetor", () => {
    expect(() => { funcao(1, 2, 2); }).toThrow(TypeError);
});

test("Valor de g menor que 1 fora de faixa", () => {
    expect(() => funcao(1, 0, [0, 1, 2])).toThrow(RangeError);
});