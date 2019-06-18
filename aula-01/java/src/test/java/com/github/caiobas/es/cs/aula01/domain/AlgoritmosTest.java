package com.github.caiobas.es.cs.aula01.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AlgoritmosTest {
	
	@Test
	public void propriedade3025CasoClassico() {
        assertEquals(true, AlgoritmosUtils.propriedade3025(3025));
    }

    @Test
    public void propriedade3025Erro() {
        assertEquals(false, AlgoritmosUtils.propriedade3025(3024));
    }

    @Test
    public void propriedade3025NumeroMenorQue0() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.propriedade3025(-1));
    }

    @Test
    public void propriedade3025NumeroMaiorQue9999() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.propriedade3025(10000));
    }

    @Test
	public void propriedade153CasoClassico() {
        assertEquals(true, AlgoritmosUtils.propriedade153(153));
    }

    @Test
    public void propriedade153Erro() {
        assertEquals(false, AlgoritmosUtils.propriedade153(152));
    }

    @Test
    public void propriedade153NumeroMenorQue100() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.propriedade153(99));
    }

    @Test
    public void propriedade153NumeroMaiorQue999() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.propriedade153(1000));
    }

    @Test
	public void diaDaSemanaCasoClassico() {
        assertEquals("Quinta-feira", AlgoritmosUtils.diaDaSemana(16, 05, 2019));
    }

    @Test
    public void diaDaSemanaDiaMenorQue1() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.diaDaSemana(0, 1, 2000));
    }

    @Test
    public void diaDaSemanaDiaMaiorQue31() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.diaDaSemana(32, 1, 2000));
    }

    @Test
    public void diaDaSemanaMesMenorQue1() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.diaDaSemana(1, 0, 2000));
    }

    @Test
    public void diaDaSemanaDiaMaiorQue12() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.diaDaSemana(1, 13, 2000));
    }

    @Test
    public void diaDaSemanaAnoMenorQue1754() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.diaDaSemana(1, 1, 1753));
    }
    
    @Test
    public void diaDaSemanaDia30Mes2Ano2000() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.diaDaSemana(30, 2, 2000));
    }
    
    @Test
    public void diaDaSemanaPraPassar1() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.diaDaSemana(30, 2, 2019));
    }
    
    @Test
    public void diaDaSemanaPraPassar2() {
        assertEquals("Sabado", AlgoritmosUtils.diaDaSemana(29, 2, 2020));
    }
    
    @Test
    public void diaDaSemanaPraPassar3() {
        assertEquals("Terca-feira", AlgoritmosUtils.diaDaSemana(31, 12, 2019));
    }
    
    @Test
    public void diaDaSemanaDia29Mes2Ano1999() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.diaDaSemana(29, 2, 1999));
    }
    
    @Test
    public void diaDaSemanaDia31Mes4() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.diaDaSemana(31, 4, 2000));
    }
    
    @Test
    public void diaDaSemanaDia31Mes6() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.diaDaSemana(31, 6, 2000));
    }
    
    @Test
    public void diaDaSemanaDia31Mes9() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.diaDaSemana(31, 9, 2000));
    }

    @Test
    public void diaDaSemanaDia31Mes11() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.diaDaSemana(31, 11, 2000));
    }

    @Test
	public void diaDaSemanaMes1() {
        assertEquals("Terca-feira", AlgoritmosUtils.diaDaSemana(1, 1, 2019));
    }

    @Test
	public void diaDaSemanaMes2() {
        assertEquals("Sexta-feira", AlgoritmosUtils.diaDaSemana(1, 2, 2019));
    }

    @Test
	public void nomeDiaDaSemana0() {
        assertEquals("Segunda-feira", AlgoritmosUtils.nomeDiaDaSemana(0));
    }

    @Test
	public void nomeDiaDaSemana1() {
        assertEquals("Terca-feira", AlgoritmosUtils.nomeDiaDaSemana(1));
    }

    @Test
	public void nomeDiaDaSemana2() {
        assertEquals("Quarta-feira", AlgoritmosUtils.nomeDiaDaSemana(2));
    }

    @Test
	public void nomeDiaDaSemana3() {
        assertEquals("Quinta-feira", AlgoritmosUtils.nomeDiaDaSemana(3));
    }

    @Test
	public void nomeDiaDaSemana4() {
        assertEquals("Sexta-feira", AlgoritmosUtils.nomeDiaDaSemana(4));
    }

    @Test
	public void nomeDiaDaSemana5() {
        assertEquals("Sabado", AlgoritmosUtils.nomeDiaDaSemana(5));
    }

    @Test
	public void nomeDiaDaSemana6() {
        assertEquals("Domingo", AlgoritmosUtils.nomeDiaDaSemana(6));
    }

    @Test
	public void restoDivisaoCasoClassico() {
        assertEquals(2, AlgoritmosUtils.restoDivisao(5, 3));
    }

    @Test
    public void restoDivisaoDividendoMenorQue0() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.restoDivisao(-1, 5));
    }

    @Test
    public void restoDivisaoDivisorMenorQue1() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.restoDivisao(1, 0));
    }

    @Test
	public void somaCasoClassico() {
        assertEquals(15, AlgoritmosUtils.somaPrimeirosNaturais(5));
    }

    @Test
    public void somaNumeroMenorQue1() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.somaPrimeirosNaturais(0));
    }

    @Test
	public void fatorialCasoClassico() {
        assertEquals(120, AlgoritmosUtils.fatorial(5));
    }

    @Test
    public void fatorialNumeroMenorQue1() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.fatorial(0));
    }

    @Test
	public void produtoCasoClassico() {
        assertEquals(8, AlgoritmosUtils.produtoUsandoSomas(2, 4));
    }

    @Test
    public void produtoaMenorQue0() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.produtoUsandoSomas(-1, 5));
    }

    @Test
    public void produtobMenorQue0() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.produtoUsandoSomas(1, -4));
    }

    @Test
	public void produtobMenorQuea() {
        assertEquals(8, AlgoritmosUtils.produtoUsandoSomas(4, 2));
    }

    @Test
	public void potenciaCasoClassico() {
        assertEquals(32, AlgoritmosUtils.potenciaUsandoSomas(2, 5));
    }

    @Test
    public void potenciaxMenorQue0() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.potenciaUsandoSomas(-1, 4));
    }

    @Test
    public void potenciayMenorQue0() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.potenciaUsandoSomas(1, -4));
    }

    @Test
	public void valorPICasoClassico() {
        assertEquals(3.140592653839794, AlgoritmosUtils.valorPI(1000));
    }

    @Test
    public void valorPIMenorQue1() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.valorPI(0));
    }

    @Test
	public void logaritmoCasoClassico() {
        assertEquals(6, AlgoritmosUtils.logaritmo(2, 2));
    }

    @Test
    public void logaritmonMenorQue1() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.logaritmo(0, 5));
    }

    @Test
    public void logaritmokMenorQue2() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.logaritmo(1, 1));
    }

    @Test
	public void razaoAureaCasoClassico() {
        assertEquals(1.6180339887498947, AlgoritmosUtils.razaoAurea(1, 2, 1000));
    }

    @Test
    public void razaoAureaxMenorQue0() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.razaoAurea(-1, 2, 1000));
    }

    @Test
    public void razaoAureayMenorQuex() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.razaoAurea(2, 1, 1000));
    }
    
    @Test
    public void razaoAureakMenorQue1() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.razaoAurea(1, 2, 0));
    }

    @Test
	public void quadradoPerfeitoCasoClassico() {
        assertEquals(true, AlgoritmosUtils.quadradoPerfeito(36));
    }

    @Test
	public void quadradoPerfeitoErro() {
        assertEquals(false, AlgoritmosUtils.quadradoPerfeito(30));
    }

    @Test
    public void quadradoPerfeitonMenorQue1() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.quadradoPerfeito(0));
    }

    @Test
	public void raizQuadradaCasoClassico() {
        assertEquals(1.7320508075688772, AlgoritmosUtils.raizQuadrada(3, 200));
    }

    @Test
    public void raizQuadradanMenorQue1() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.raizQuadrada(0, 5));
    }

    @Test
	public void numeroPrimoCasoClassico() {
        assertEquals(true, AlgoritmosUtils.numeroPrimo(19));
    }

    @Test
	public void numeroPrimoErro() {
        assertEquals(false, AlgoritmosUtils.numeroPrimo(18));
    }

    @Test
    public void numeroPrimonMenorQue2() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.numeroPrimo(1));
    }

    @Test
	public void crivoCasoClassico() {
        assertEquals(false, AlgoritmosUtils.crivoErastotenes(19));
    }

    @Test
	public void crivoErro() {
        assertEquals(true, AlgoritmosUtils.crivoErastotenes(18));
    }

    @Test
    public void crivonMenorQue2() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.crivoErastotenes(1));
    }

    @Test
	public void mdc1CasoClassico() {
        assertEquals(27, AlgoritmosUtils.mdc1(81, 54));
    }

    @Test
    public void mdc1aMenorQueb() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.mdc1(4, 5));
    }

    @Test
    public void mdc1bMenorQue1() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.mdc1(1, 0));
    }

    @Test
	public void mdc2CasoClassico() {
        assertEquals(27, AlgoritmosUtils.mdc2(81, 54));
    }

    @Test
    public void mdc2aMenorQueb() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.mdc2(4, 5));
    }

    @Test
    public void mdc2bMenorQue1() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.mdc2(1, 0));
    }

    @Test
	public void regraHornerCasoClassico() {
        int regraTeste[] = {0, 1, 2};
        assertEquals(4, AlgoritmosUtils.regraHorner(1, 2, regraTeste));
    }

    @Test
	public void regraHornergMenorQue1() {
        int regraTeste[] = {0, 1, 2};
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.regraHorner(1, 0, regraTeste));
    }

    @Test
	public void fibonacciCasoClassico() {
        assertEquals(8, AlgoritmosUtils.fibonacci(6));
    }

    @Test
	public void fibonacciCaso0() {
        assertEquals(0, AlgoritmosUtils.fibonacci(0));
    }

    @Test
	public void fibonacciCaso1() {
        assertEquals(1, AlgoritmosUtils.fibonacci(1));
    }

    @Test
	public void fibonaccinMenorQue0() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.fibonacci(-1));
    }

    @Test
	public void cpf1CasoClassico() {
        int cpf[] = {7, 4, 8, 3, 3, 8, 4, 3, 8, 7, 0}; //cpf TRUE para teste
        assertEquals(true, AlgoritmosUtils.cpf1(cpf));
    }

    @Test
	public void cpf1Erro1() {
        int cpf[] = {6, 3, 2, 3, 3, 6, 6, 9, 4, 0, 3}; //cpf FALSE para teste
        assertEquals(false, AlgoritmosUtils.cpf1(cpf));
    }
    
    @Test
	public void cpf1Erro2() {
        int cpf[] = {7, 4, 8, 3, 3, 8, 4, 3, 8, 8, 0}; //cpf FALSE para teste
        assertEquals(false, AlgoritmosUtils.cpf1(cpf));
    }

    @Test
	public void cpf2CasoClassico() {
        int cpf[] = {7, 4, 8, 3, 3, 8, 4, 3, 8, 7, 0}; //cpf TRUE para teste
        assertEquals(true, AlgoritmosUtils.cpf2(cpf));
    }

    @Test
	public void cpf2Erro1() {
        int cpf[] = {6, 3, 2, 3, 3, 6, 6, 9, 4, 0, 3}; //cpf FALSE para teste
        assertEquals(false, AlgoritmosUtils.cpf2(cpf));
    }

    @Test
	public void cpf2Erro2() {
        int cpf[] = {7, 4, 8, 3, 3, 8, 4, 3, 8, 9, 1}; //cpf FALSE para teste
        assertEquals(false, AlgoritmosUtils.cpf2(cpf));
    }

    @Test
	public void excecaoCpfVetorNull() {
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.geraExcecaoSeCpfInvalido(null));
    }

    @Test
	public void excecaoCpfTamanhoIncorreto() {
        int cpf[] = {1, 5, 4, 7, 3, 4, 1, 5, 7, 8, 7, 6}; //cpf de tamanho incorreto para teste
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.geraExcecaoSeCpfInvalido(cpf));
    }

    @Test
	public void excecaoCpfDadosAcima9() {
        int cpf[] = {72, 4, 8, 3, 33, 8, 4, 63, 8, 7, 0};
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.geraExcecaoSeCpfInvalido(cpf));
    }
    
    @Test
	public void excecaoCpfDadosAbaixo0() {
        int cpf[] = {7, -4, 8, 3, 33, 8, 4, 63, 8, 7, 0};
        assertThrows(IllegalArgumentException.class, 
                                                    () -> AlgoritmosUtils.geraExcecaoSeCpfInvalido(cpf));
    }

}
