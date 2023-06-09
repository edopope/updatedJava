package InterviewQuestions;

import java.util.Scanner;

public class MyPalindrome {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word to check");
        String myWord = keyboard.nextLine();
        StringBuilder builder = new StringBuilder(myWord);
        builder.reverse();
        String reverse = builder.toString();
        if (myWord.equals(reverse)){
            System.out.println("its a palindrome");
        }
        else {
            System.out.println("its not a palindrome");
        }
    }
}
