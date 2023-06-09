package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class MakingADifference {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        int number1 = 1 + random.nextInt(9);
        int number2 = 1 + random.nextInt(9);
        int total = number1 * number2;
        int ask = 0;
        System.out.printf("what is %d * %d = ?", number1, number2);
        int answer = keyboard.nextInt();
        do {
            System.out.printf("what is %d * %d = ?", number1, number2);
            answer = keyboard.nextInt();
            ask++;
            if (answer == total) {
                System.out.println("very good!");
            } else {
                System.out.printf("very poor The answer is %d Try again!", total);
            }
        }while (answer == total);
        }


    }
