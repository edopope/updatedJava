package Chapter2;

import java.util.Scanner;

public class NumberOfNegativeInteger {
    public static void main(String[] args) {
        int counterNegative = 0;
        int counterPositive = 0;
        int counterZero = 0;
        Scanner keyboard = new Scanner(System.in);
        int enteredNumber = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("enter a number:");
            enteredNumber = keyboard.nextInt();
            if (enteredNumber == 0) counterZero++;

        if (enteredNumber < 0) counterNegative++;

        if (enteredNumber > 0) counterPositive++;
        }

        System.out.printf("number of zeros is%d%n numbersOf negative s %d%n numbers of positive is %d%n",counterZero,counterNegative,counterPositive);
    }
}
