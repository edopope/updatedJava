package ChibuzoAssignment;

import java.security.SecureRandom;

public class OddLoop {
    public static void jumpLoop(int[] num) {
        int counter = 0;
        for ( counter = 0; counter < num.length; counter++) {
            if (counter % 2 == 1) {
                System.out.print(num[counter] + " ");

            }

        }

    }



    public static void main(String[] args) {
        int [] score = {2,3,4,5,6,67,8};
        jumpLoop(score);
    }
}
