package Chapter4;

import java.util.Scanner;

public class LargestOfTen {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int counter = 0;
        int largest = 0;
        for (counter = 0; counter <= 10 ; counter++) {
            System.out.println("enter a number:");
            int number = keyboard.nextInt();
            if (number > largest){
                largest = number;
            }
        }
            System.out.println(largest);
    }
}
