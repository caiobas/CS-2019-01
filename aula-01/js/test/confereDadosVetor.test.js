const funcao = require("../cpf1.js");
var d = [6.3, 3, 2, 3, 3, 6, 6, 9, 4, 0, 3]; //cpf com numeros reais
var d1 = [7, 4, 80, 3, 3, 85, 4, 3, 8, 7, 0]; //cpf com numeros inteiros incorretos

test("Espera-se dados inteiros nos elementos do vetor", () => {
  expect(() => { funcao.f2(d); }).toThrow(TypeError);
});

test("Espera-se dados entre 0 e 9 em cada elemento do vetor", () => {
  expect(() => { funcao.f2(d1); }).toThrow(RangeError);
});
