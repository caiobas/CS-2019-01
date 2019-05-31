package com.github.caiobas.es.cs.aula07.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class QuantidadeLetrasTest{

    @Test
    public void quantidadeLetras() {
        assertEquals("E = 2\nI = 1\nO = 1\nS = 3\nT = 2\n", QuantidadeLetras.obterQuantidadeLetras("teste isso"));
    }
    
}
