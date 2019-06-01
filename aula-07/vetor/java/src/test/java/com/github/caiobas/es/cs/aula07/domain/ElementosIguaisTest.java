package com.github.caiobas.es.cs.aula07.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ElementosIguaisTest{

    @Test
    public void elementosIguais() {
        int[] vetor1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] vetor2 = {0, 5, 10};
        assertEquals(2, ElementosIguais.obterElementosIguais(vetor1, vetor2));
    }

}
