package Chapter6;

import java.util.Scanner;

public class DivisbleBy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER AN INTEGER:");
        int num = input.nextInt();
        if(num % 5 == 0){
            System.out.println("true");

        }
        else
            System.out.println("false");
    }
}
