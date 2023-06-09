package chapter15;

import java.io.DataInputStream;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        byte [] bytes = new byte[50];
        byte [] bytes1 = new byte[bytes.length];
        try (
            DataInputStream dataInputStream = new DataInputStream(System.in)){
               int numberRead = dataInputStream.read(bytes);
            System.out.println("numberRead::: "+ numberRead);
            for (byte b : bytes) {
                for (byte c: bytes) {
                if (bytes[b] > bytes[c]){

                }
                    System.out.print(Character.toString(b));
                }
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());

        }
        }
    }

