package chapter15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class MyOwnFile {
    public static void main(String[] args) {
        byte[] reader = new byte[60];
   try{
       FileInputStream fileOutputStream = new FileInputStream("C:\\Users\\DELL\\Desktop\\NewName.txt");
       for (byte b:reader){
       fileOutputStream.read(reader);
       }
           System.out.println(Arrays.toString(reader));
   } catch (IOException e) {
       throw new RuntimeException(e);

   }
    }
}
