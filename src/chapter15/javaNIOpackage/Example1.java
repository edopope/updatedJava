package chapter15.javaNIOpackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example1 {
    public static void main(String[] args) {


        Path path = Paths.get("C:\\Users\\DELL\\IdeaProjects\\colonJava\\src\\Chapter2");
        System.out.println("isDirectory::" +Files.isDirectory(path));
        System.out.println(path);
        try{
            System.out.println("isHidden::"+Files.isHidden(path));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}