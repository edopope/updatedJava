package Chapter4;

import java.util.Scanner;

public class FactorsOf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i ;
            //i++;
        }
        System.out.printf("%d", total);
    }
}
