const funcao = require("../diaDaSemana.js");

test("dia menor que 1", () => {
    expect(funcao.f3(0, 1, 2000)).toBe(true);
});

test("dia dentro da faixa", () => {
    expect(funcao.f3(1, 1, 2000)).toBe(false);
});

test("dia maior que 31", () => {
    expect(funcao.f3(32, 1, 2000)).toBe(true);
});

test("mes menor que 1", () => {
    expect(funcao.f3(1, 0, 2000)).toBe(true);
});

test("mes dentro da faixa", () => {
    expect(funcao.f3(1, 1, 2000)).toBe(false);
});

test("mes maior que 12", () => {
    expect(funcao.f3(1, 13, 2000)).toBe(true);
});

test("ano menor que 1754", () => {
    expect(funcao.f3(1, 1, 1750)).toBe(true);
});

test("ano dentro da faixa", () => {
    expect(funcao.f3(1, 1, 2000)).toBe(false);
});