package chapter14;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a word:");
        String word = keyboard.nextLine();
        String rev = "";
        for (int i= word.length() -1; i >= 0; i--){
           rev+= word.charAt(i);
        }
        if (word.equals(rev)){
            System.out.println("its a palindrome!");

        }else{
            System.out.println("not a palindrome");
        }
    }
}
