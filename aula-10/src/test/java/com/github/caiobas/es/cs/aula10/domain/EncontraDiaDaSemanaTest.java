package com.github.caiobas.es.cs.aula10.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public final class EncontraDiaDaSemanaTest {

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

    @Test
    void testesDefinidos() {
        assertEquals(-1, EncontraDiaDaSemanaUtils.executaEncontraDia(teste1));
        assertEquals(-1, EncontraDiaDaSemanaUtils.executaEncontraDia(teste2));
        assertEquals(-1, EncontraDiaDaSemanaUtils.executaEncontraDia(teste3));
        assertEquals(-1, EncontraDiaDaSemanaUtils.executaEncontraDia(teste4));
        assertEquals(-1, EncontraDiaDaSemanaUtils.executaEncontraDia(teste5));
        assertEquals(-1, EncontraDiaDaSemanaUtils.executaEncontraDia(teste6));
        assertEquals(-1, EncontraDiaDaSemanaUtils.executaEncontraDia(teste7));
        assertEquals(-1, EncontraDiaDaSemanaUtils.executaEncontraDia(teste8));
        assertEquals(-1, EncontraDiaDaSemanaUtils.executaEncontraDia(teste9));
        assertEquals(-1, EncontraDiaDaSemanaUtils.executaEncontraDia(teste10));
        assertEquals(-1, EncontraDiaDaSemanaUtils.executaEncontraDia(teste11));
        assertEquals(2, EncontraDiaDaSemanaUtils.executaEncontraDia(teste12));
        assertEquals(1, EncontraDiaDaSemanaUtils.executaEncontraDia(teste13));
        assertEquals(1, EncontraDiaDaSemanaUtils.executaEncontraDia(teste14));
    }

    @Test
    void getDia() {
        assertEquals(1, EncontraDiaDaSemanaUtils.getDia("20000101"));
    }

    @Test
    void getmes() {
        assertEquals(1, EncontraDiaDaSemanaUtils.getMes("20000101"));
    }

    @Test
    void getAno() {
        assertEquals(2000, EncontraDiaDaSemanaUtils.getAno("20000101"));
    }

    @Test
    void confereBissexto() {
        assertTrue(EncontraDiaDaSemanaUtils.confereBissexto(2000, 2000));
        assertTrue(EncontraDiaDaSemanaUtils.confereBissexto(2004, 2000));
        assertFalse(EncontraDiaDaSemanaUtils.confereBissexto(2001, 2000));
    }
}
