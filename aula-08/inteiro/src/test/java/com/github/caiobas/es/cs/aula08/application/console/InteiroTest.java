package com.github.caiobas.es.cs.aula08.application.console;

import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.github.caiobas.es.cs.aula08.domain.InteiroUtils;

public class InteiroTest {

    private String getFilename(String string) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(string).getFile());

        String absolutePath = file.getAbsolutePath();
        return absolutePath;
    }

    @Test
    public void imprimeHexa() throws IOException{
        assertEquals("74657374", InteiroUtils.imprimeHexa(getFilename("74657374.txt")));
    } 

    @Test
    public void testMain() throws IOException {
        String[] args = {getFilename("74657374.txt")};
        ProgramaInteiro.main(args);
    }

    @Test
    public void arquivoErro() {
        assertThrows(IllegalArgumentException.class,() -> InteiroUtils.imprimeHexa(getFilename("vazio.txt")));
        assertThrows(IllegalArgumentException.class,() -> InteiroUtils.imprimeHexa("a.txt"));
    }
    
}
