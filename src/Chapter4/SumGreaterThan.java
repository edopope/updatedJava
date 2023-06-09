package Chapter4;

import java.util.Scanner;

public class SumGreaterThan {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a number:");
        int count = 0;
        int newNumber = keyboard.nextInt();
        while (newNumber > 0){
            System.out.println("Enter another number to sum:");
            int anotherNumber = keyboard.nextInt();
            if (newNumber >= anotherNumber){
                 count += anotherNumber;
                if (count >= newNumber){
                    System.out.println(count);
                    break;
                }
            }
        }
    }
}
