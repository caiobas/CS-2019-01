const funcao = require("../PalavraFrequente.js");
let string = "E = 2\nI = 1\nO = 1\nS = 3\nT = 2\n";

test("Palavra frequente = sua (caso classico)", () => {
    expect(funcao("teste sua teste sua sua isso isso meu meu sua")).toBe("sua");
  });

test("Parametro nao e string", () => {
    expect(() => { funcao(25); }).toThrow(TypeError);
});
