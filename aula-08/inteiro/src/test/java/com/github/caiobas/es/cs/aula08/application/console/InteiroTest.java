package com.github.caiobas.es.cs.aula08.application.console;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

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
    public void arquivoErro() {
        assertThrows(IllegalArgumentException.class,() -> InteiroUtils.imprimeHexa(getFilename("vazio.txt")));
        //assertThrows(IllegalArgumentException.class,() -> InteiroUtils.imprimeHexa(getFilename("naoPodeLer.txt")));
        assertThrows(IllegalArgumentException.class,() -> InteiroUtils.imprimeHexa("a.txt"));
    }

    @Test
    public void teste() throws IOException {
        Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("---------");
        FileAttribute<Set<PosixFilePermission>> fileAttributes = PosixFilePermissions.asFileAttribute(permissions);
        Path dir = Files.createTempDirectory("testDir");
        Path path = dir.resolve("naoPodeLer.txt");
        Path teste = Files.createFile(path, fileAttributes);
        PosixFileAttributes attr = Files.readAttributes(path, PosixFileAttributes.class);
        attr.permissions().clear();
        Files.setPosixFilePermissions(path, permissions);

        assertThrows(IllegalArgumentException.class,() -> InteiroUtils.imprimeHexa(teste.toString()));
    }
    
    @Test
    public void testMain() throws IOException {
        String[] args = {getFilename("74657374.txt")};
        ProgramaInteiro.main(args);
    }
    
}
