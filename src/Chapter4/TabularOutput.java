package Chapter4;

import java.util.Scanner;

public class TabularOutput {
    public static void main(String[] args) {
            System.out.println("N1\tN2\tN3\tN4");
        for (int i = 1; i <= 5; i++) {
            int n1 = i* i;
            int n2 = n1 * i;
            int n3 = n2 * i;
            System.out.printf("%d%4d%4d%4d%n",i, n1, n2,n3);
        }


//        Scanner keyboard = new Scanner(System.in);
//        int enter = 0;
//        while (enter < 10) {
//            System.out.println("enter either 1 or 2");
//            enter = keyboard.nextInt();
//            // System.out.println("enter either 1 or 2");
//            if (enter == 1 || enter == 2) {
//                System.out.println(enter);
//                break;
//            } else {
//                System.out.println("enter either 1 or 2");
//                int enter1 = keyboard.nextInt();
//
//            }
//
//        }
    }
}


