package com.github.caiobas.es.cs.aula07.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PalavraFrequenteTest{

    @Test
    public void palavraFrequente() {
        assertEquals("sua", PalavraFrequenteUtils.obterPalavraFrequente("teste sua teste sua sua isso isso meu meu sua"));
    }

}
