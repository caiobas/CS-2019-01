package com.github.caiobas.es.cs.aula07.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class NumeroFrequenteTest{
    
    @Test
    public void numeroFrequente() {
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(0);
        test.add(0);
        test.add(3);
        test.add(3);
        test.add(4);
        ArrayList<Integer> resultado = new ArrayList<Integer>();
        resultado.add(0);
        resultado.add(3);
        assertEquals(resultado, NumeroFrequenteUtils.obterNumeroFrequente(test));
    }

    @Test
    public void numerosAleatorios() {
        assertNotNull(NumeroFrequenteUtils.numerosAleatorios(1000000, 1000));
    }

    @Test
    public void excecaoIntervaloAleatorios() {
        assertThrows(IllegalArgumentException.class, () -> NumeroFrequenteUtils.numerosAleatorios(1000000, 25));
    }
    
    @Test
    public void excecaoQuantidadeAleatorios() {
        assertThrows(IllegalArgumentException.class, () -> NumeroFrequenteUtils.numerosAleatorios(320, 1000));
    }

}
