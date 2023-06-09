package Activities;

import java.util.Scanner;
public class PositiveInterger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = input.nextInt();
        int even = num + 2;
        int odd = num / 1;
        for (int x = 0; x <= 0; x++) {
            if (num == even) {
                System.out.printf("EVEN NUMBER %d%n", even);
            }
            else if(num == odd) {
                System.out.printf("ODD NUMBER %d", odd);

            }


        }
    }
}








