package com.github.caiobas.es.cs.aula08.application.console;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;

import com.github.caiobas.es.cs.aula08.domain.ConfereArquivoUtils;

public class JpegTest {

    private String getFilename(String string) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(string).getFile());

        String absolutePath = file.getAbsolutePath();
        return absolutePath;
    }

    @Test
    public void confereArquivoTrue() throws IOException {
        assertTrue(ConfereArquivoUtils.confereByte(getFilename("imagemTrue.jpg")));
    }

    @Test
    public void confereArquivoFalse() throws IOException {
        assertFalse(ConfereArquivoUtils.confereByte(getFilename("imagemFalse.txt")));
    }

    @Test
    public void confereArquivoVazio() throws IOException {
        assertThrows(IllegalArgumentException.class,() -> ConfereArquivoUtils.confereByte(getFilename("vazio.txt")));
        assertThrows(IllegalArgumentException.class,() -> ConfereArquivoUtils.confereByte("a.txt"));
    }

    @Test 
    public void confereRetornoTrue() throws IOException{
        assertEquals("O arquivo passado é um jpeg.", ConfereArquivoUtils.arquivoJpeg(ConfereArquivoUtils.confereByte(getFilename("imagemTrue.jpg"))));
    }
    
    @Test 
    public void confereRetornoFalse() throws IOException{
        assertEquals("O arquivo passado não é um jpeg.", ConfereArquivoUtils.arquivoJpeg(ConfereArquivoUtils.confereByte(getFilename("imagemFalse.txt"))));
    }

    @Test
    public void testMain() throws IOException{
        String[] args = {getFilename("imagemTrue.jpg")};
        ProgramaJpeg.main(args);
    }
}
