const funcao = require("../cpf1.js");
var d = [6, 3, 2, 3, 3, 6, 6, 9, 4, 0, 3]; //cpf FALSE para teste
var d1 = [7, 4, 8, 3, 3, 8, 4, 3, 8, 7, 0]; //cpf TRUE para teste
var d2 = [1, 5, 4, 7, 3, 4, 1, 5, 7, 8, 7, 6]; //cpf de tamanho incorreto para teste

test("748.338.438-70 satisfaz(caso classico)", () => {
  expect(funcao.f1(d1)).toBe(true);
});

test("632.336.694-03 nao satisfaz", () => {
  expect(funcao.f1(d)).toBe(false);
});

test("argumento null/undefined", () => {
  expect(() => { funcao.f1(); }).toThrow(TypeError);
});

test("argumento nao e vetor", () => {
  expect(() => { funcao.f1("abcd"); }).toThrow(TypeError);
});


test("Vetor de tamanho incorreto", () => {
  expect(() => { funcao.f1(d2); }).toThrow(RangeError);
});

