package Chapter2;

import java.util.Scanner;

public class FiveDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER FIVE DIGIT--->");
        int digit = input.nextInt();
        if(digit == 5){
                System.out.println("enter more numbers");

            }
            else{
                System.out.printf("%d%5d  ", digit);
            System.out.println(" ");
            }
        }
    }

