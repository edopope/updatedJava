package chapter11;

import java.util.Scanner;

public class ExceptionTrial {
    public static void main(String[] args) throws MyCustomException {
        Scanner keyboard = new Scanner(System.in);
        int counter = 0;
        while (counter < 3) {
            System.out.println("enter a  number between 1 and 10");
            int enterNumber = keyboard.nextInt();
            if (enterNumber < 0 || enterNumber > 10) throw new MyCustomException("enter a number between 1 and 10");
            counter++;
        }

    }
}