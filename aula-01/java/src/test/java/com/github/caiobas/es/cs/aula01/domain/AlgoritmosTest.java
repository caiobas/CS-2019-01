package com.github.caiobas.es.cs.aula01.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AlgoritmosTest {
	
	@Test
	public void propriedade3025CasoClassico() {
        assertEquals(true, Algoritmos.propriedade3025(3025));
    }

    @Test
    public void propriedade3025Erro() {
        assertEquals(false, Algoritmos.propriedade3025(3024));
    }

    @Test
    public void propriedade3025NumeroMenorQue0() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade3025(-1));
    }

    @Test
    public void propriedade3025NumeroMaiorQue9999() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade3025(10000));
    }

    @Test
	public void propriedade153CasoClassico() {
        assertEquals(true, Algoritmos.propriedade153(153));
    }

    @Test
    public void propriedade153Erro() {
        assertEquals(false, Algoritmos.propriedade153(152));
    }

    @Test
    public void propriedade153NumeroMenorQue100() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade153(99));
    }

    @Test
    public void propriedade153NumeroMaiorQue999() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.propriedade153(1000));
    }

    @Test
	public void diaDaSemanaCasoClassico() {
        assertEquals("Quinta-feira", Algoritmos.diaDaSemana(16, 05, 2019));
    }

    @Test
    public void diaDaSemanaDiaMenorQue1() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaDaSemana(0, 1, 2000));
    }

    @Test
    public void diaDaSemanaDiaMaiorQue31() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaDaSemana(32, 1, 2000));
    }

    @Test
    public void diaDaSemanaMesMenorQue1() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaDaSemana(1, 0, 2000));
    }

    @Test
    public void diaDaSemanaDiaMaiorQue12() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaDaSemana(1, 13, 2000));
    }

    @Test
    public void diaDaSemanaDiaMenorQue1754() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.diaDaSemana(1, 1, 1753));
    }

    @Test
	public void diaDaSemanaMes1() {
        assertEquals("Terca-feira", Algoritmos.diaDaSemana(1, 1, 2019));
    }

    @Test
	public void diaDaSemanaMes2() {
        assertEquals("Sexta-feira", Algoritmos.diaDaSemana(1, 2, 2019));
    }

    @Test
	public void nomeDiaDaSemana0() {
        assertEquals("Segunda-feira", Algoritmos.nomeDiaDaSemana(0));
    }

    @Test
	public void nomeDiaDaSemana1() {
        assertEquals("Terca-feira", Algoritmos.nomeDiaDaSemana(1));
    }

    @Test
	public void nomeDiaDaSemana2() {
        assertEquals("Quarta-feira", Algoritmos.nomeDiaDaSemana(2));
    }

    @Test
	public void nomeDiaDaSemana3() {
        assertEquals("Quinta-feira", Algoritmos.nomeDiaDaSemana(3));
    }

    @Test
	public void nomeDiaDaSemana4() {
        assertEquals("Sexta-feira", Algoritmos.nomeDiaDaSemana(4));
    }

    @Test
	public void nomeDiaDaSemana5() {
        assertEquals("Sabado", Algoritmos.nomeDiaDaSemana(5));
    }

    @Test
	public void nomeDiaDaSemana6() {
        assertEquals("Domingo", Algoritmos.nomeDiaDaSemana(6));
    }

    @Test
    public void nomeDiaDaSemanaErro() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.nomeDiaDaSemana(7));
    }

    @Test
	public void restoDivisaoCasoClassico() {
        assertEquals(2, Algoritmos.restoDivisao(5, 3));
    }

    @Test
    public void restoDivisaoDividendoMenorQue0() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.restoDivisao(-1, 5));
    }

    @Test
    public void restoDivisaoDivisorMenorQue1() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.restoDivisao(1, 0));
    }

    @Test
	public void somaCasoClassico() {
        assertEquals(15, Algoritmos.somaPrimeirosNaturais(5));
    }

    @Test
    public void somaNumeroMenorQue1() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.somaPrimeirosNaturais(0));
    }

    @Test
	public void fatorialCasoClassico() {
        assertEquals(120, Algoritmos.fatorial(5));
    }

    @Test
    public void fatorialNumeroMenorQue1() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.fatorial(0));
    }

    @Test
	public void produtoCasoClassico() {
        assertEquals(8, Algoritmos.produtoUsandoSomas(2, 4));
    }

    @Test
    public void produtoaMenorQue0() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.produtoUsandoSomas(-1, 5));
    }

    @Test
    public void produtobMenorQue0() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.produtoUsandoSomas(1, -4));
    }

    @Test
	public void produtobMenorQuea() {
        assertEquals(8, Algoritmos.produtoUsandoSomas(4, 2));
    }

    @Test
	public void potenciaCasoClassico() {
        assertEquals(32, Algoritmos.potenciaUsandoSomas(2, 5));
    }

    @Test
    public void potenciaxMenorQue0() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.potenciaUsandoSomas(1, -4));
    }

    @Test
    public void potenciayMenorQue0() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.potenciaUsandoSomas(1, -4));
    }

    @Test
	public void valorPICasoClassico() {
        assertEquals(3.140592653839794, Algoritmos.valorPI(1000));
    }

    @Test
    public void valorPIMenorQue1() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.valorPI(0));
    }

    @Test
	public void logaritmoCasoClassico() {
        assertEquals(6, Algoritmos.logaritmo(2, 2));
    }

    @Test
    public void logaritmonMenorQue1() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.logaritmo(0, 5));
    }

    @Test
    public void logaritmokMenorQue2() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.logaritmo(1, 1));
    }

    @Test
	public void razaoAureaCasoClassico() {
        assertEquals(1.6180339887498947, Algoritmos.razaoAurea(1, 2, 1000));
    }

    @Test
    public void razaoAureaxMenorQue0() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.razaoAurea(-1, 2, 1000));
    }

    @Test
    public void razaoAureayMenorQuex() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.razaoAurea(2, 1, 1000));
    }
    
    @Test
    public void razaoAureakMenorQue1() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.razaoAurea(1, 2, 0));
    }

    @Test
	public void quadradoPerfeitoCasoClassico() {
        assertEquals(true, Algoritmos.quadradoPerfeito(36));
    }

    @Test
	public void quadradoPerfeitoErro() {
        assertEquals(false, Algoritmos.quadradoPerfeito(30));
    }

    @Test
    public void quadradoPerfeitonMenorQue1() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.quadradoPerfeito(0));
    }

    @Test
	public void raizQuadradaCasoClassico() {
        assertEquals(1.7320508075688772, Algoritmos.raizQuadrada(3, 200));
    }

    @Test
    public void raizQuadradanMenorQue1() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.raizQuadrada(0, 5));
    }

    @Test
	public void numeroPrimoCasoClassico() {
        assertEquals(true, Algoritmos.numeroPrimo(19));
    }

    @Test
	public void numeroPrimoErro() {
        assertEquals(false, Algoritmos.numeroPrimo(18));
    }

    @Test
    public void numeroPrimonMenorQue2() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.numeroPrimo(1));
    }

    @Test
	public void crivoCasoClassico() {
        assertEquals(false, Algoritmos.crivoErastotenes(19));
    }

    @Test
	public void crivoErro() {
        assertEquals(true, Algoritmos.crivoErastotenes(18));
    }

    @Test
    public void crivonMenorQue2() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.crivoErastotenes(1));
    }

    @Test
	public void mdc1CasoClassico() {
        assertEquals(27, Algoritmos.mdc1(81, 54));
    }

    @Test
    public void mdc1aMenorQueb() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.mdc1(4, 5));
    }

    @Test
    public void mdc1bMenorQue1() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.mdc1(1, 0));
    }

    @Test
	public void mdc2CasoClassico() {
        assertEquals(27, Algoritmos.mdc2(81, 54));
    }

    @Test
    public void mdc2aMenorQueb() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.mdc2(4, 5));
    }

    @Test
    public void mdc2bMenorQue1() {
        assertThrows(IllegalArgumentException.class, () -> Algoritmos.mdc2(1, 0));
    }

}