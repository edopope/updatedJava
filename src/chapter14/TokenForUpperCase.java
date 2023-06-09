package chapter14;

import java.util.Scanner;

public class TokenForUpperCase {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String keyWord = keyboard.nextLine();
        String word = " ";
//        String  newWord = keyWord.split(" ");
        for (int i = 0; i < keyWord.length(); i++) {
            if (String.valueOf(keyWord.charAt(i)) ==  keyWord.substring(0,1).toUpperCase()){
                word = String.valueOf(keyWord.charAt(i));
            }
            System.out.println(word);
        }
    }
}
