package com.github.caiobas.es.cs.aula07.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class QuantidadeLetrasTest{

    public static void main(String[] args){
        System.out.println(QuantidadeLetras.obterQuantidadeLetras("TeSte iSso{["));
    }

    @Test
    public void quantidadeLetras() {
        
        assertNotNull(QuantidadeLetras.obterQuantidadeLetras("TeSte iSso{["));
    }

}
