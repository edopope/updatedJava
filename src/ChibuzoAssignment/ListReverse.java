package ChibuzoAssignment;

import java.util.ArrayList;
import java.util.Arrays;

public class ListReverse {
    public int[] reverseArray(int... array) {
        int[] number = new int[array.length];
        int i;
        int back = 0;
        for (i = array.length - 1; i >= 0; i--) {
            number[back] = array[i];
            back++;


        }
        return number;
    }


    public static void main(String[] args) {
        ListReverse rev = new ListReverse();
        int[] digit = {1, 2, 3, 4, 5};
        int [] nums = new int[digit.length];
        System.out.printf("the original array is  ");
        for (int counter = 0; counter < digit.length; counter++) {

            System.out.print(digit[counter] + " ");

        }
        System.out.println();
        System.out.print(Arrays.toString(rev.reverseArray(digit)));

        }
    }
