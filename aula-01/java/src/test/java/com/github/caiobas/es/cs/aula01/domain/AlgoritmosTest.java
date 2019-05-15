package com.github.caiobas.es.cs.aula01.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AlgoritmosTest {
	
	@Test
	public void numeroMenorQueZero() {
        assertEquals(3025, 3025);
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.propriedade3025(-1));
        assertThrows(IllegalArgumentException.class,() -> Algoritmos.propriedade3025(10000));
    }
    
}