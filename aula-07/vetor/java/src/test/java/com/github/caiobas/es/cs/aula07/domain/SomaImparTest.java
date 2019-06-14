package com.github.caiobas.es.cs.aula07.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SomaImparTest {

    @Test
    public void somaImpar() {
        int[] vetor = {10, 9, 8, 7, 6, 5};
        assertEquals(21, SomaImparUtils.obterSomaImpar(vetor));
    }
    
}
