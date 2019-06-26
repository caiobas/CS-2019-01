package com.github.caiobas.es.cs.aula08.application.console;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.HashSet;
import java.util.Set;
import java.nio.file.Path;

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

    static String parentDir = "/tmp/test/";

    static Set<PosixFilePermission> defaultPosixPermissions = null;
    static {
        defaultPosixPermissions = new HashSet<>();
        defaultPosixPermissions.add(PosixFilePermission.OWNER_READ);
        defaultPosixPermissions.add(PosixFilePermission.OWNER_WRITE);
        defaultPosixPermissions.add(PosixFilePermission.OWNER_EXECUTE);
        defaultPosixPermissions.add(PosixFilePermission.GROUP_READ);
        defaultPosixPermissions.add(PosixFilePermission.GROUP_WRITE);
        //Others have read permission so that ftp user who doesn't belong to the group can fetch the file
        defaultPosixPermissions.add(PosixFilePermission.OTHERS_READ);
        defaultPosixPermissions.add(PosixFilePermission.OTHERS_WRITE);
    }


    public static void createFileWithPermission(String fileName) throws IOException{
    // File parentFolder = new File(parentDir);
    // PosixFileAttributes attrs = Files.readAttributes(parentFolder.toPath(), PosixFileAttributes.class);
    // System.out.format("parentfolder permissions: %s %s %s%n",
    //   attrs.owner().getName(),
    //   attrs.group().getName(),
    //   PosixFilePermissions.toString(attrs.permissions()));

    // FileAttribute<Set<PosixFilePermission>> attr =  PosixFilePermissions.asFileAttribute(attrs.permissions());
        FileAttribute<Set<PosixFilePermission>> attr =  PosixFilePermissions.asFileAttribute(defaultPosixPermissions);
        File file = new File(fileName);
        Files.createFile(file.toPath(), attr);
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

        //String fileName = parentDir + "testPermission_" + System.currentTimeMillis();
        //createFileWithPermission(fileName);

        assertThrows(IllegalArgumentException.class,() -> InteiroUtils.imprimeHexa(teste.toString()));
    }
    
    @Test
    public void testMain() throws IOException {
        String[] args = {getFilename("74657374.txt")};
        ProgramaInteiro.main(args);
    }
    
}
