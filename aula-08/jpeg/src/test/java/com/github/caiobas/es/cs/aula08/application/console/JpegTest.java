package com.github.caiobas.es.cs.aula08.application.console;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.HashSet;
import java.util.Set;

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
        /*Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw-r--r--");
        FileAttribute<Set<PosixFilePermission>> fileAttributes = PosixFilePermissions.asFileAttribute(permissions);
        Path dir = Files.createTempDirectory("testDir");
        Path path = dir.resolve("naoPodeLer.txt");
        Path teste = Files.createFile(path, fileAttributes);
        PosixFileAttributes attr = Files.readAttributes(path, PosixFileAttributes.class);
        attr.permissions().clear();
        Files.setPosixFilePermissions(path, permissions);*/

        String fileName = parentDir + "testPermission_" + System.currentTimeMillis();
        createFileWithPermission(fileName);

        assertThrows(IllegalArgumentException.class,() -> ConfereArquivoUtils.confereByte(fileName));
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







/*lic class TestPermission{

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

public static void main(String[] args) throws IOException{
    String fileName = parentDir + "testPermission_" + System.currentTimeMillis();
    createFileWithPermission(fileName);

}

}

*/