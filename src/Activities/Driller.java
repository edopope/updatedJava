package Activities;

import java.util.Scanner;
public class Driller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int amountEntered = 0; amountEntered <=4; amountEntered++) {
            System.out.print("enter number of copies");
            int amount = input.nextInt();
            if (amount <= 4) {
                int price = amount * 2000;
                System.out.printf("you are to pay %d%n", price);
            } else if (amount <= 9) {
                int price = amount * 1800;
                System.out.printf("you are to pay %d%n", price);
            } else if (amount <= 29) {
                int price = amount * 1600;
                System.out.printf("you are to pay %d%n", price);
            } else if (amount <= 49) {
                int price = amount * 1500;
                System.out.printf("you are to pay %d%n", price);
            } else if (amount <= 99) {
                int price = amount * 1300;
                System.out.printf("you are to pay %d%n", price);
            } else if (amount <= 199) {
                int price = 1200;
                System.out.printf("you are to pay %d%n", price);
            } else if (amount <= 499) {
                int price = 1100;
                System.out.printf("you are to pay %d%n", price);
            } else {
                int price = amount * 1000;
                System.out.printf("you are to pay %d%n", price);

            }
            amountEntered++;
        }

    }
}
