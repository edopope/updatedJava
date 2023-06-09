package Chapter4;

import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        int counter = 0;
        double firstTax = 0.15;
        double secondTax = 0.20;
        double result = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter tax amount");
            int  taxAmount = keyboard.nextInt();
            if (taxAmount <= 30000) {
                    result = taxAmount *firstTax;
                    System.out.println(result);

                } else {
                    result = taxAmount * secondTax;
                    System.out.println(result);
                }
            }
        }

