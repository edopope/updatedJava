package Chapter5;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0;
        int smallest = 0;
        int add = 0;
        System.out.println("enter a number:");
        int enter = input.nextInt();
        while (enter != 0) {
            System.out.println("enter a number:");
            int enter1 = input.nextInt();
            int i;
            for (i = 0; i < enter1; i++) {
                if (enter1 > largest) {
                    smallest = largest;
                    largest = enter1;
                    // if (enter1 == -1) {


                }

            }

            add = largest + smallest;
            System.out.println(largest);
            System.out.println(smallest);
            System.out.println(add);
        }

        }
    }
