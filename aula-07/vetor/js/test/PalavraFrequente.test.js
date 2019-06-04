const funcao = require("../PalavraFrequente.js");

test("Palavra frequente = sua (caso classico)", () => {
    expect(funcao("teste sua teste sua sua isso isso meu meu sua")).toBe("sua");
});

test("Parametro nao e string", () => {
    expect(() => { funcao(25); }).toThrow(TypeError);
});
