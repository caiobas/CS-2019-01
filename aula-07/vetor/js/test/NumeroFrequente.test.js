const funcao = require("../NumeroFrequente.js");

test("Quantidade nao e numero", () => {
    expect(() => { funcao("s", 1000); }).toThrow(TypeError);
});

test("Intervalo nao e numero", () => {
    expect(() => { funcao(1000000, "s"); }).toThrow(TypeError);
});

test("Quantidade nao e 1.000.000", () => {
    expect(() => { funcao(10, 1000); }).toThrow(RangeError);
});

test("Intervalo nao e 1000", () => {
    expect(() => { funcao(1000000, 10); }).toThrow(RangeError);
});
