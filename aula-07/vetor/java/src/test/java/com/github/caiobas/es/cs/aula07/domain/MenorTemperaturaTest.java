package com.github.caiobas.es.cs.aula07.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MenorTemperaturaTest {

    @Test
    public void menorTemperatura() {
        double[] vetor = {10, 9, 8, 7, 6, 5};
        assertEquals(5, MenorTemperaturaUtils.obterMenorTemperatura(vetor));
    }
    
}
