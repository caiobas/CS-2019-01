const funcao = require("../cpf2.js");
var d = [6, 3, 2, 3, 3, 6, 6, 9, 4, 0, 3]; //cpf FALSE para teste
var d1 = [7, 4, 8, 3, 3, 8, 4, 3, 8, 7, 0]; //cpf TRUE para teste
var d2 = [1, 5, 4, 7, 3, 4, 1, 5, 7, 8, 7, 6]; //cpf de tamanho incorreto para teste
var d3 = [1, 50, 4, 7, 3, 47, 1, 5, 7, 88, 7]; //cpf de dados incorretos para teste
var d4 = [1, 5.0, 4, 7, 3, 4.7, 1, 5, 7, 8.8, 7]; //cpf de dados incorretos para teste

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

test("Vetor de dados incorretos(0 a 9)", () => {
  expect(() => { funcao.f1(d3); }).toThrow(RangeError);
});

test("Vetor de dados incorretos(nao e inteiro)", () => {
  expect(() => { funcao.f1(d4); }).toThrow(TypeError);
});