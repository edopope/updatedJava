package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class SquareAsterisk {
    public static void main(String[] args) {
//        for (int stars = 1; stars <= 20; stars++) {
//            System.out.print("*");
//            if (stars % 5 == 0) {
//                System.out.println();
//            }
//
//        }
        int spin = 0;
        int spin2 = 0;
        SecureRandom ran = new SecureRandom();
        enum Status {HEAD, TAIL}
        Status start;
        for (int roll = 1; roll <= 20; roll++) {
            int toss = 1 + ran.nextInt(2);
            if (toss == 1) {
                start = Status.HEAD;
                spin++;
            } else
                start = Status.TAIL;
            spin2++;
            System.out.println("STATUS1\tSTATUS2\tSPINS\tSPIN 2");
            System.out.printf("%s\t%s\t%d\t\t%d%n", start,start, spin,spin2);

        }

    }
    }

