package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class UserArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int [] score = new int[5];
        int count = 0;
        while (count < 5){
            System.out.println("Enter a number::");
            int number = keyboard.nextInt();
            score[count++] = number;
           // count++;

        }
        System.out.println(Arrays.toString(score));
    }
}

