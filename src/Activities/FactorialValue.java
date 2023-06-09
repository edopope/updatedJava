package Activities;

import java.util.Scanner;
public class FactorialValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number :");
        int factor = input.nextInt(); 

        for (int a = 1; a <= factor; a++ ) {
            if (factor % a == 0){
                System.out.print(a + " ");
            }

        }
    }
}