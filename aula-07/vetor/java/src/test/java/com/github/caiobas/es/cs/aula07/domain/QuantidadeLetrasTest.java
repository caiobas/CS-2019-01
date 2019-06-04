package com.github.caiobas.es.cs.aula07.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class QuantidadeLetrasTest{

    @Test
    public void quantidadeLetras() {
        assertNotNull(QuantidadeLetras.obterQuantidadeLetras("TeSte iSso{["));
    }

}
