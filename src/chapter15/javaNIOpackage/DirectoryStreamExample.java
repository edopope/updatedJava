package chapter15.javaNIOpackage;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamExample {
    public static void main(String[] args) {
        Path path= Paths.get(System.getProperty("file.separator")+"home","chapter15");
        System.out.println(path);
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
            directoryStream.forEach(content ->System.out.println(content.getFileName()));
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
