package Activities;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number u want to multiply::");
        int num = input.nextInt();
        System.out.println("enter the length u want it to calculate to::");
        int len = input.nextInt();
        for (int i = 1; i <= len ; i++) {
           int multiply = (num * i);
            System.out.printf("%d * %d = %d%n",num, i, multiply);
        }

    }
    public static int multiply(int num, int num2) {
        return num*num2;
    }
}
