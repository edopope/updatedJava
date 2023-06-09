package Activities;

import java.util.Scanner;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        for (int x = 1; x <= 5; x++) {
        System.out.println("guess a number");
        int guess = input.nextInt();
            int a = rand.nextInt(10);
            if (guess > a) {
                System.out.println("too high");
            }
            if (guess < a) {
                System.out.println("too low");
            }
            if (guess == a) {
                System.out.print("correct");
                break;
            }


        }
    }
}








