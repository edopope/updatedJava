package chapter14;

import java.nio.file.Files;
import java.util.Scanner;

public class StringBuiderScanner {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("enter a word:");
     String enter = keyboard.nextLine();
     StringBuilder builder = new StringBuilder(enter);
        builder.reverse();
        if (enter.equals(builder.toString())){
            System.out.println("its a palindrome");
        }
        else{
            System.out.println("its not a palindrome");
        }
        System.out.println(builder.reverse());

    }
}
