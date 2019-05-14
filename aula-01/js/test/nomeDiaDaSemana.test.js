const funcao = require("../diaDaSemana.js");

test("0 = Segunda-feira", () => {
    expect(funcao.f2(0)).toBe("Segunda-feira");
});

test("1 = terca-feira", () => {
    expect(funcao.f2(1)).toBe("Terca-feira");
});

test("2 = quarta-feira", () => {
    expect(funcao.f2(2)).toBe("Quarta-feira");
});

test("3 = quinta-feira", () => {
    expect(funcao.f2(3)).toBe("Quinta-feira");
});

test("4 = sexta-feira", () => {
    expect(funcao.f2(4)).toBe("Sexta-feira");
});

test("5 = sabado", () => {
    expect(funcao.f2(5)).toBe("Sabado");
});

test("6 = domingo", () => {
    expect(funcao.f2(6)).toBe("Domingo");
});