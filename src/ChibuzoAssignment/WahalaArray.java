package ChibuzoAssignment;

import java.util.Arrays;

public class WahalaArray {
    public static void main(String[] args) {
        int[][] dash = new int[6][5];
        dash[1][1] = 1;
        dash[3][0] = 1;
        dash[2][3] = 1;
        for (int i = 0; i < dash.length; i++) {
            for (int j = 0; j < dash[i].length; j++) {
                if (dash[i][j] == 1)
                    System.out.print("*");
                    else if (dash[i][j] == 0) {
                        System.out.print("-");
                        //System.out.println(Arrays.toString(dash[i]));
                    }
                }
            System.out.println();

            }
        }

    }
