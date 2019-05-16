package com.github.caiobas.es.cs.aula01.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AlgoritmosTest {
	
	@Test
	public void propriedade3025CasoClassico() {
        assertEquals(true, Algoritmos.propriedade3025(3025));
    }

    @Test
    public void propriedade3025Erro() {
        assertEquals(false, Algoritmos.propriedade3025(3024));
    }

    @Test
    public void propriedade3025NumeroMenorQue0() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade3025(-1));
    }

    @Test
    public void propriedade3025NumeroMaiorQue9999() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade3025(10000));
    }

    @Test
	public void propriedade153CasoClassico() {
        assertEquals(true, Algoritmos.propriedade153(153));
    }

    @Test
    public void propriedade153Erro() {
        assertEquals(false, Algoritmos.propriedade153(152));
    }

    @Test
    public void propriedade153NumeroMenorQue100() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade153(99));
    }

    @Test
    public void propriedade153NumeroMaiorQue999() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade153(1000));
    }

    @Test
	public void diaDaSemanaCasoClassico() {
        assertEquals("Quinta-feira", Algoritmos.diaDaSemana(16, 05, 2019));
    }

    @Test
    public void diaDaSemanaDiaMenorQue1() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaDaSemana(0, 1, 2000));
    }

    @Test
    public void diaDaSemanaDiaMaiorQue31() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaDaSemana(32, 1, 2000));
    }

    @Test
    public void diaDaSemanaMesMenorQue1() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaDaSemana(1, 0, 2000));
    }

    @Test
    public void diaDaSemanaDiaMaiorQue12() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaDaSemana(1, 13, 2000));
    }

    @Test
    public void diaDaSemanaDiaMenorQue1754() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaDaSemana(1, 1, 1753));
    }

    @Test
	public void nomeDiaDaSemana0() {
        assertEquals("Segunda-feira", Algoritmos.nomeDiaDaSemana(0));
    }

    @Test
	public void nomeDiaDaSemana1() {
        assertEquals("Terca-feira", Algoritmos.nomeDiaDaSemana(1));
    }

    @Test
	public void nomeDiaDaSemana2() {
        assertEquals("Quarta-feira", Algoritmos.nomeDiaDaSemana(2));
    }

    @Test
	public void nomeDiaDaSemana3() {
        assertEquals("Quinta-feira", Algoritmos.nomeDiaDaSemana(3));
    }

    @Test
	public void nomeDiaDaSemana4() {
        assertEquals("Sexta-feira", Algoritmos.nomeDiaDaSemana(4));
    }

    @Test
	public void nomeDiaDaSemana5() {
        assertEquals("Sabado", Algoritmos.nomeDiaDaSemana(5));
    }

    @Test
	public void nomeDiaDaSemana6() {
        assertEquals("Domingo", Algoritmos.nomeDiaDaSemana(6));
    }

    @Test
    public void nomeDiaDaSemanaErro() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.nomeDiaDaSemana(7));
    }

}