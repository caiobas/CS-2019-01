package com.github.caiobas.es.cs.aula10.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public final class ConfereEntradaTest {

    String[] teste1 = {"2010101", "1", "23450101", "1"};
    String[] teste2 = {"100000101", "", "23450101", "1"};
    String[] teste3 = {"20161301", "", "23450101", "1"};
    String[] teste4 = {"20160001", "", "23450101", "1"};
    String[] teste5 = {"20160931", "", "23450101", "1"};
    String[] teste6 = {"20160900", "", "23450101", "1"};
    String[] teste7 = {"", "0", "23450101", "1"};
    String[] teste8 = {"", "-1", "23450101", "1"};
    String[] teste9 = {"", "", "23450000", "1"};
    String[] teste10 = {"", "", "23450101", "-1"};
    String[] teste11 = {"", "", "23450101", "7"};
    String[] teste12 = {"20160928", "2016", "20160928", "2"};
    String[] teste13 = {"20160301", "2016", "20160228", "6"};
    String[] teste14 = {"20000101", "2000", "20000101", "1"};
    String[] teste15 = {"20000101", "2000", "20000101"};
    String[] teste16 = {"20000101", "2000", "20000101", "-1"};
    String[] teste17 = {"20000101", "0", "20000101", "1"};
    String[] teste18 = {"20000101", "2000", "200001010", "1"};
    String[] teste19 = {"20000101", "2000", "20000101", "7"};

    @Test
    void testesDefinidos() {
        assertEquals(-1, ConfereEntradaUtils.executaConfere(teste1));
        assertEquals(-1, ConfereEntradaUtils.executaConfere(teste2));
        assertEquals(-1, ConfereEntradaUtils.executaConfere(teste3));
        assertEquals(-1, ConfereEntradaUtils.executaConfere(teste4));
        assertEquals(-1, ConfereEntradaUtils.executaConfere(teste5));
        assertEquals(-1, ConfereEntradaUtils.executaConfere(teste6));
        assertEquals(-1, ConfereEntradaUtils.executaConfere(teste7));
        assertEquals(-1, ConfereEntradaUtils.executaConfere(teste8));
        assertEquals(-1, ConfereEntradaUtils.executaConfere(teste9));
        assertEquals(-1, ConfereEntradaUtils.executaConfere(teste10));
        assertEquals(-1, ConfereEntradaUtils.executaConfere(teste11));
        assertEquals(1, ConfereEntradaUtils.executaConfere(teste12));
        assertEquals(1, ConfereEntradaUtils.executaConfere(teste13));
        assertEquals(1, ConfereEntradaUtils.executaConfere(teste14));
    }

    @Test
    void confereQtdArgumentos() {
        assertEquals(1, ConfereEntradaUtils.confereQtdArgumentos(teste1));
        assertEquals(-1, ConfereEntradaUtils.confereQtdArgumentos(teste15));
    }

    @Test
    void confereArgumentos() {
        assertEquals(1, ConfereEntradaUtils.confereArgumentos(teste1));
        assertEquals(-1, ConfereEntradaUtils.confereArgumentos(teste16));
    }

    @Test
    void confereDiaSemana() {
        assertEquals(1, ConfereEntradaUtils.confereDiaSemana(1));
        assertEquals(-1, ConfereEntradaUtils.confereDiaSemana(7));
    }

    @Test
    void confereAnoBissexto() {
        assertEquals(1, ConfereEntradaUtils.confereAnoBissexto(1));
        assertEquals(-1, ConfereEntradaUtils.confereAnoBissexto(0));
    }

    @Test
    void confereData() {
        assertEquals(1, ConfereEntradaUtils.confereData("20000101", "2000"));
        assertEquals(-1, ConfereEntradaUtils.confereData("00000101", "2000"));
        assertEquals(-1, ConfereEntradaUtils.confereData("20000001", "2000"));
        assertEquals(-1, ConfereEntradaUtils.confereData("20001301", "2000"));
        assertEquals(-1, ConfereEntradaUtils.confereData("20000100", "2000"));
        assertEquals(-1, ConfereEntradaUtils.confereData("20000132", "2000"));
    }

    @Test
    void executaConfere() {
        assertEquals(1, ConfereEntradaUtils.executaConfere(teste14));
        assertEquals(-1, ConfereEntradaUtils.executaConfere(teste15));
        assertEquals(-1, ConfereEntradaUtils.executaConfere(teste16));
        assertEquals(-1, ConfereEntradaUtils.executaConfere(teste17));
        assertEquals(-1, ConfereEntradaUtils.executaConfere(teste1));
        assertEquals(-1, ConfereEntradaUtils.executaConfere(teste18));
        assertEquals(-1, ConfereEntradaUtils.executaConfere(teste19));
    }
}