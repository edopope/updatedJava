package Activities;

import java.util.Scanner;

public class MyInterestRate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counters = 0;
        while (counters < 4) {
            System.out.println("enter the amount of money to start with:");
            int money = input.nextInt();
            System.out.println("enter the rate in decimals: 3 years = 0.03'::");
            double rate = input.nextDouble();
            System.out.println("enter the numbers of years:");
            int years = input.nextInt();
            int interest = (int) (money * Math.pow(1 + rate, years));
            System.out.printf("your interest is :: %d%n  ", interest);
            counters++;
        }
    }
}