package Chapter4;

import java.util.Objects;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String reverse = " ";
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a five digit number:");
        String digit = keyboard.nextLine();
        if (digit.length() < 5) {
            System.out.println("number must be greater than 5!");

            for (int i = digit.length() - 1; i < 0; i++) {
                reverse += digit.charAt(i);
                System.out.println("ur fada");
                if (Objects.equals(digit, reverse)) {
                    System.out.println("its a palindrome");
                } else {
                    System.out.println("its  not a palindrome");
                }
            }
        }
    }
}
