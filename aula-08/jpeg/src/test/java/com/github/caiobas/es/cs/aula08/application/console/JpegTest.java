package com.github.caiobas.es.cs.aula08.application.console;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
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
    public void confereArquivo() throws IOException {
        assertEquals("O arquivo passado é um jpeg.", ConfereArquivoUtils.confereByte(getFilename("imagemTrue.jpg")));
    }
}
