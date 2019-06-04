const funcao = require("../ElementosIguais.js");
let vetor = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]; // Vetor para caso classico.
let vetor1 = [0, 5, 5, 10]; // Vetor para caso classico.
let vetor2 = [9, 8, 7, 6, "a", 4, 3, 2, 1]; // Vetor que possui caractere.
let vetor3 = [9, 8, 7, 6, 5.5, 4, 3, 2, 1]; // Vetor que possui caractere.

test("Elementos iguais = 2 (caso classico)", () => {
    expect(funcao(vetor, vetor1)).toBe(2);
});

test("Parametro nao e vetor", () => {
    expect(() => { funcao(35, vetor); }).toThrow(TypeError);
});

test("Elemento de vetor nao e numero(1)", () => {
    expect(() => { funcao(vetor1, vetor2); }).toThrow(TypeError);
});

test("Elemento de vetor nao e numero(2)", () => {
    expect(() => { funcao(vetor2, vetor1); }).toThrow(TypeError);
});

test("Elemento de vetor nao e numero inteiro(1)", () => {
    expect(() => { funcao(vetor1, vetor3); }).toThrow(TypeError);
});

test("Elemento de vetor nao e numero inteiro(2)", () => {
    expect(() => { funcao(vetor3, vetor1); }).toThrow(TypeError);
});