package chapter15;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {

        try{
            FileOutputStream fileOutputStream
                    = new FileOutputStream("C:\\Users\\DELL\\IdeaProjects\\colonJava\\src\\chapter15\\test.txt");
            fileOutputStream.write("paragons".getBytes());
        }catch (IOException fileException){
            System.out.println(fileException.getMessage());
        }
    }
}
