package tdd;

import java.util.Scanner;

public class Conversion {

public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

  System.out.println("Enter a value in feet: ");
        double number1 = input.nextDouble();


        double number2 = number1 * 0.305;

System.out.printf("%f feet is %f meters", number1, number2);





}


}