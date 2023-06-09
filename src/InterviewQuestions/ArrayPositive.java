package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayPositive {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int [] myNumbers = new int [10];
        int count = 0;
        int positive  = 0;
        int negative = 0;
        for (int i = 0; i <10 ; i++) {
        System.out.println("Enter a number:::");
          int newNumber = keyboard.nextInt();
          myNumbers[count++] = newNumber;
          if (myNumbers[i] < 0){
              negative++;
          }
          else{
              positive++;
          }
        }
        System.out.printf("%d%n%d%n%d",myNumbers[count++],negative,positive);

System.exit(1);

    }
}




