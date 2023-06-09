package tdd;

import java.util.Scanner;

public class Acceleration {

  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

             System.out.print("Enter initial velocity in meters per seconds");
                 double number1 = input.nextDouble();

System.out.print("Enter final velocity in meters per seconds");
      double number2 = input.nextDouble();
  
                      System.out.print("Enter time in seconds");
                             double number3 = input.nextDouble();
   double a =( number2 - number1 )/ number3;
  
   System.out.printf("The average acceleration is %f", a, number2);



    }

}