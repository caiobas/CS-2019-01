const funcao = require("../QuantidadeLetras.js");
let string = "E = 2\nI = 1\nO = 1\nS = 3\nT = 2\n";

test("caso classico", () => {
    expect(funcao("TeSte iSso{[")).toBe(string);
});

test("Parametro nao e string", () => {
    expect(() => { funcao(25); }).toThrow(TypeError);
});
