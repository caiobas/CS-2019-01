package com.github.caiobas.es.cs.aula08.application.console;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import com.github.caiobas.es.cs.aula08.domain.EncontreUtils;

import org.junit.jupiter.api.Test;

public class EncontreTest {

    private String getFilename(String string) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(string).getFile());

        String absolutePath = file.getAbsolutePath();
        return absolutePath;
    }

    @Test
    public void ocorrencias() throws IOException {
        assertEquals("Encontradas: 5.", EncontreUtils.ocorrencias(getFilename("encontradas5.txt"), "esta"));
    }

    @Test
    public void ocorrenciasErro() throws IOException {
        assertThrows(IllegalArgumentException.class,() -> EncontreUtils.ocorrencias(getFilename("vazio.txt"), "esta"));
        assertThrows(IllegalArgumentException.class,() -> EncontreUtils.ocorrencias("a.txt", "esta"));
    }

    @Test
    public void letrasEColunas() throws IOException {
        assertNotNull(EncontreUtils.linhasEColunas(getFilename("encontradas5.txt"), "esta"));
    }

   @Test
    public void letrasEColunasErro() throws IOException {
        assertThrows(IllegalArgumentException.class,() -> EncontreUtils.linhasEColunas(getFilename("vazio.txt"), "esta"));
        assertThrows(IllegalArgumentException.class,() -> EncontreUtils.linhasEColunas("a.txt", "esta"));
    }

    @Test
    public void resultadoTeste() throws IOException{
        assertNotNull(EncontreUtils.retornaResultado(getFilename("encontradas5.txt"), "esta"));
    }

    @Test 
    public void testMain() throws IOException {
        String[] args = {getFilename("encontradas5.txt"), "esta"};
        ProgramaEncontre.main(args);
    }
}