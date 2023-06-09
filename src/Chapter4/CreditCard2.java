package Chapter4;

import Chapter4.CreditCard;

import java.util.Scanner;

public class CreditCard2 {
    public static void main(String[] args) {
        CreditCard credit = new CreditCard(330330330, 350_000);
        for (int a = 0; a < 2; a++) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nenter the charges:bc");
            int charges = input.nextInt();
            System.out.println("what is the credit:::");
            int charge = input.nextInt();
            int newBal = (credit.getBalance() - charges) - charge;
            if (newBal > credit.getBalance()) {
                System.out.println("credit limit exceeded");
            } else {
                System.out.printf("your new balance is---> %d", newBal);

            }
        }
    }
}