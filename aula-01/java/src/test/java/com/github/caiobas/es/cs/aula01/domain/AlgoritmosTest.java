package com.github.caiobas.es.cs.aula01.domain;

import com.github.caiobas.es.cs.aula01.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlgoritmosTest {
	
	@Test
	public void numeroMenorQueZero() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.propriedade3025(3025));
    }
    
}