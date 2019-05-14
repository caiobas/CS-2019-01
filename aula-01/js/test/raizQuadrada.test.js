const funcao = require("../raizQuadrada.js");

test("3, 200 = 1.7320508075688772", () => {
    expect(funcao(3, 200)).toBe(1.7320508075688772);
});

test("argumento null/undefined", () => {
    expect(() => { funcao(); }).toThrow(TypeError);
});

test("argumento nao numerico", () => {
    expect(() => { funcao("abcd", 3); }).toThrow(TypeError);
});

test("Valor de n menor que 1 fora de faixa", () => {
    expect(() => { funcao(0, 5); }).toThrow(RangeError);
});