package Chapter6;

import java.util.Scanner;

public class StraightLineSum {
    public static int straightSum(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a four-digit integer: ");
        int num = scanner.nextInt();

        int sum = straightSum(num);

        System.out.println("The sum of the digits is: " + sum);

    }
}