const funcao = require("../fibonacci.js");

test("Fibonacci 0 = 0", () => {
  expect(funcao(0)).toBe(0);
});

test("Fibonacci 1 = 1", () => {
  expect(funcao(1)).toBe(1);
});

test("Fibonacci 3 = 6", () => {
  expect(funcao(6)).toBe(8);
});

test("argumento nao numerico", () => {
  expect(() => { funcao("abcd"); }).toThrow(TypeError);
});

test("valor deve ser inteiro", () => {
  expect(() => funcao(10.3)).toThrow(TypeError);
});

test("valor menor que 0 fora de faixa", () => {
  expect(() => { funcao(-1); }).toThrow(RangeError);
});