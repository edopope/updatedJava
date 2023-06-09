package Activities;

import java.util.Scanner;
public class TwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        do {
            System.out.println("Enter a number");
            int number1 = input.nextInt();
            System.out.println("Enter second number");
            int number2 = input.nextInt();
            int sum = number1 + number2;
            System.out.printf("your total is %d%n", sum);
            counter++;
            boolean trans = true ^ false;
            if(trans == false ^ true) {
                System.out.printf("do you want to perform another transaction %b%n", trans);
                System.out.printf("choose true or false %B%n", trans);
            }
            else {
                break;
            }

        }
        while (counter <= 9);


    }
}
