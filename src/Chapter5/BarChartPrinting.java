package Chapter5;

import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String[] args) {
        Scanner keyboard =  new Scanner(System.in);
        String asterisk = "*";
        System.out.println("enter a number:");
        int enterNumber = keyboard.nextInt();
        for (int counter = 1; counter <= enterNumber ; counter++) {
            System.out.print(asterisk);
        }
    }
}
