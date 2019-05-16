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

}