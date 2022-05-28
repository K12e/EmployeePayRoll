package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

public class NIOFileAPITest {
    private static String HOME = System.getProperty("user.home");
    private static String Play_With_NIO = "PlayGround";
    private Assertions Assert;


    @Test
    public void givenPathWhenCheckedThenConfirm() throws IOException {
        //check file exists
        Path homePath = Paths.get(HOME);
        Assert.assertTrue(Files.exists(homePath));

        Path playPath=Paths.get(HOME+ "/"+Play_With_NIO);
        if(Files.exists(playPath)) {

            FileUtils.deleteFile(playPath.toFile());
            Assert.assertTrue(Files.notExists(playPath));

            //create directory
            Files.createDirectory(playPath);
            Assert.assertTrue(Files.exists(playPath));

            //create file
            IntStream.range(1,10).forEach(cntr ->{
                Path tempFile=Paths.get(playPath+ "/temp"+cntr);
                Assert.assertTrue(Files.notExists(tempFile));
                try{Files.createFile(tempFile);
                }catch (IOException e)
                {

                }
                Assert.assertTrue(Files.exists(tempFile));
            });

            //list files,Directories as well as files with extension
            Files.list(playPath).filter(Files::isRegularFile).forEach(System.out::println);
            Files.newDirectoryStream(playPath).forEach(System.out::println);
            Files.newDirectoryStream(playPath,Path -> Path.toFile().isFile() && Path.toString().startsWith("temp")).forEach(System.out::println);
        }
    }
}