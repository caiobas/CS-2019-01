const funcao = require("../diaDaSemana.js");

test("14/05/2019 e terca-feira", () => {
    expect(funcao.f1(14, 5, 2019)).toBe("Terca-feira");
});

test("argumento dia nao e inteiro", () => {
    expect(() => { funcao.f1(14.5, 5, 2019); }).toThrow(TypeError);
});

test("argumento mes nao e inteiro", () => {
    expect(() => { funcao.f1(14, 5.7, 2019); }).toThrow(TypeError);
});

test("argumento ano nao e inteiro", () => {
    expect(() => { funcao.f1(14, 5, 2019.84); }).toThrow(TypeError);
});

test("argumento dia nao e numero", () => {
    expect(() => { funcao.f1("abc", 5, 2019); }).toThrow(TypeError);
});

test("argumento mes nao e numero", () => {
    expect(() => { funcao.f1(14, "abc", 2019); }).toThrow(TypeError);
});

test("argumento ano nao e numero", () => {
    expect(() => { funcao.f1(14, 5, "abc"); }).toThrow(TypeError);
});
