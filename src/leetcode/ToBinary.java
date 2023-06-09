package leetcode;

import java.util.Scanner;
public class ToBinary {
            public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a binary integer: ");
            int binary = input.nextInt();

            int decimal = 0;
            int base = 1;

            while (binary > 0) {
                int digit = binary % 10;
                decimal += digit * base;
                base *= 2;
                binary /= 10;
            }

            System.out.println("The decimal equivalent is: " + decimal);
        }
    }


