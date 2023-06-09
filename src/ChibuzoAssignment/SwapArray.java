package ChibuzoAssignment;

import java.util.Arrays;

public class SwapArray {
    public static void switchArray(String... name) {
        String temp = "";
        String[] swap = new String[name.length];
        for (int i = 0; i < name.length; i++) {
        swap[i] = name[name.length  -1 -i];

        }

        System.out.printf("the swapped is %s", Arrays.toString(swap));

    }


    public static void main(String[] args) {
        String[] name = {"joan", "felix", "godwin", "uyi","tony"};
        switchArray(name);
    }
}