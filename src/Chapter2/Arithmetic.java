package Chapter2;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a number:");
        int number = keyboard.nextInt();
        System.out.println("enter a  second number:");
        int secondNumber = keyboard.nextInt();
        int square = number * number;
        int secondSquare = secondNumber * secondNumber;
        System.out.printf("%d%n%d",square,secondSquare);
        System.out.println("enter 5 numbers:");
        int num = keyboard.nextInt();
        System.out.printf("%d   ",num);
        System.out.println();
    }

}
