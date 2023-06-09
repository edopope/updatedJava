package Chapter6;

import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number to round up::");
        double x = input.nextDouble();
     double y = Math.floor(x + 0.5);
        System.out.printf("the original number was %.1f and the rounded number is %.1f ",x, y);
    }
}
