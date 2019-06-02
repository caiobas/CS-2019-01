const funcao = require("../MenorTemperatura.js");
let vetor = [9, 8, 7, 6, 5, 4, 3, 2, 1]; // Vetor para caso classico.
let vetor1 = [9, 8, 7, 6, "a", 4, 3, 2, 1]; // Vetor que possui caractere.

test("Menor numero = 1 (caso classico)", () => {
    expect(funcao(vetor)).toBe(1);
  });

  test("Parametro nao e vetor", () => {
    expect(() => { funcao(35); }).toThrow(TypeError);
});

test("Elemento de vetor nao e numero", () => {
    expect(() => { funcao(vetor1); }).toThrow(TypeError);
});