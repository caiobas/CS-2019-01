package com.github.caiobas.es.cs.aula10.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EncontraDiaDaSemanaTest {

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
    String[] teste15 = {"20000101", "2000", "19900101", "1"};
    String[] teste16 = {"19900101", "2000", "20000101", "1"};
    String[] teste17 = {"20000101", "2000", "20000101", "5"};

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
        assertEquals(6, EncontraDiaDaSemanaUtils.executaEncontraDia(teste15));
        assertEquals(3, EncontraDiaDaSemanaUtils.executaEncontraDia(teste16));
    }

    @Test
    void getDia() {
        assertEquals(1, EncontraDiaDaSemanaUtils.getDia("20000101"));
    }

    @Test
    void getMes() {
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
        assertTrue(EncontraDiaDaSemanaUtils.confereBissexto(2000, 2004));
        assertFalse(EncontraDiaDaSemanaUtils.confereBissexto(2001, 2000));
        assertFalse(EncontraDiaDaSemanaUtils.confereBissexto(1900, 2000));
    }

    @Test
    void getUltimoDiaMes() {
        assertEquals(31, EncontraDiaDaSemanaUtils.getUltimoDiaMes(1, 2000, 2000));
        assertEquals(29, EncontraDiaDaSemanaUtils.getUltimoDiaMes(2, 2000, 2000));
        assertEquals(28, EncontraDiaDaSemanaUtils.getUltimoDiaMes(2, 2001, 2000));
        assertEquals(31, EncontraDiaDaSemanaUtils.getUltimoDiaMes(3, 2000, 2000));
        assertEquals(30, EncontraDiaDaSemanaUtils.getUltimoDiaMes(4, 2000, 2000));
        assertEquals(31, EncontraDiaDaSemanaUtils.getUltimoDiaMes(5, 2000, 2000));
        assertEquals(30, EncontraDiaDaSemanaUtils.getUltimoDiaMes(6, 2000, 2000));
        assertEquals(31, EncontraDiaDaSemanaUtils.getUltimoDiaMes(7, 2000, 2000));
        assertEquals(31, EncontraDiaDaSemanaUtils.getUltimoDiaMes(8, 2000, 2000));
        assertEquals(30, EncontraDiaDaSemanaUtils.getUltimoDiaMes(9, 2000, 2000));
        assertEquals(31, EncontraDiaDaSemanaUtils.getUltimoDiaMes(10, 2000, 2000));
        assertEquals(30, EncontraDiaDaSemanaUtils.getUltimoDiaMes(11, 2000, 2000));
        assertEquals(31, EncontraDiaDaSemanaUtils.getUltimoDiaMes(12, 2000, 2000));
        assertEquals(0, EncontraDiaDaSemanaUtils.getUltimoDiaMes(0, 2000, 2000));
    }

    @Test
    void comparaDatas() {
        assertTrue(EncontraDiaDaSemanaUtils.comparaDatas(01, 01, 2000, 01, 01, 2000));
        assertFalse(EncontraDiaDaSemanaUtils.comparaDatas(02, 01, 2000, 01, 01, 2000));
        assertFalse(EncontraDiaDaSemanaUtils.comparaDatas(01, 02, 2000, 01, 01, 2000));
        assertFalse(EncontraDiaDaSemanaUtils.comparaDatas(01, 01, 2001, 01, 01, 2000));
    }

    @Test
    void avancaData() {
        assertEquals(0, EncontraDiaDaSemanaUtils.avancaData("20000101", "20000101", 2000));
    }

    @Test
    void recuaData() {
        assertEquals(0, EncontraDiaDaSemanaUtils.recuaData("20000101", "20000101", 2000));
    }

    @Test
    void defineDataMaior() {
        assertEquals(1, EncontraDiaDaSemanaUtils.defineDataMaior("20000102", "20000101"));
        assertEquals(0, EncontraDiaDaSemanaUtils.defineDataMaior("20000101", "20000101"));
        assertEquals(-1, EncontraDiaDaSemanaUtils.defineDataMaior("20000101", "20000102"));
        assertEquals(1, EncontraDiaDaSemanaUtils.defineDataMaior("20000201", "20000101"));
        assertEquals(-1, EncontraDiaDaSemanaUtils.defineDataMaior("20000101", "20000201"));
        assertEquals(1, EncontraDiaDaSemanaUtils.defineDataMaior("20010101", "20000101"));
        assertEquals(-1, EncontraDiaDaSemanaUtils.defineDataMaior("20000101", "20010101"));
    }
}
