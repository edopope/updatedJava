package Activities;
import static java.lang.Math.*;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("ENTER THREE NUMBERS:\n");
            int number1 = input.nextInt();
            int number2 = input.nextInt();
            int number3 = input.nextInt();
int sum = number1 + number2 + number3;
        System.out.printf("THE SUM OF NUMBERS IS----> %d%n", sum);
        int average = (number1 + number2 + number3) / 3;
        System.out.printf("THE AVERAGE IS ----> %d%n", average);
        int product = number1 * number2 * number3;
        System.out.printf("THE PRODUCT IS ----> %d%n", product);
int minimum = (Math.min(number1, Math.min(number2, number3)));
        System.out.printf("THE MINIMUM NUMBER IS ----> %d%n",minimum);

            int result = (Math.max(number1, Math.max(number2,number3)));
                System.out.printf("THE MAX NUMBER IS---> %d%n",result);





            }
        }

