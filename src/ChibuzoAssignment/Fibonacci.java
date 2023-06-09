package ChibuzoAssignment;

import java.util.Scanner;

public class Fibonacci {
    public static void fibonacci(int number){
        for (int i = 1; i < 10 ; i++) {
            //System.out.println(i);

            System.out.printf("%d",(i - 1) + (i +2) );
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number:");
        int digit  = keyboard.nextInt();
        Fibonacci.fibonacci(digit);
        //System.out.println(
    }
}
