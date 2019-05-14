package com.github.caiobas.es.cs.aula01;

public class AlgoritmosTest {
	
	@Test
	public void numeroMenorQueZero() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.propriedade3025(0, 8, 2016));
    }
}