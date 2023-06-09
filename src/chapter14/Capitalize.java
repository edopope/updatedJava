package chapter14;

import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word to be capitalized:");
        String newWord = keyboard.nextLine();
        for (int i = 0; i <newWord.length() ; i++) {

        }
        System.out.println(newWord.substring(0,newWord.length()).toUpperCase());
    }
}
