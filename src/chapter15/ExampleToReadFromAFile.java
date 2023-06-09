package chapter15;

import java.io.FileInputStream;
import java.io.IOException;

public class ExampleToReadFromAFile {
    public static void main(String[] args) {
        byte [] bytes = new byte[100];
        try {
            FileInputStream stream = new FileInputStream("C:\\Users\\DELL\\Documents\\Anjola.txt");

            stream.read(bytes);
            for (byte b:bytes) {
                System.out.print(Character.toString(b));
            }

        }catch(IOException files){
            System.out.println(files.getMessage());
        }
    }
}