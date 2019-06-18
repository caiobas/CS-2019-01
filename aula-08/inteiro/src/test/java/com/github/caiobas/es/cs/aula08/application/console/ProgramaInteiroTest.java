package com.github.caiobas.es.cs.aula08.application.console;

import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

import com.github.caiobas.es.cs.aula08.domain.InteiroUtils;

class ProgramaInteiroTest {

    private String getFilename(String string) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(string).getFile());

        String absolutePath = file.getAbsolutePath();
        return absolutePath;
    }
    
}
