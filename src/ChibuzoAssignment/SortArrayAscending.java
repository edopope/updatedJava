package ChibuzoAssignment;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayAscending {
    public static void main(String[] args) {
//
        int[] arr = {12, 3, 4, 3, 4, 35, 6, 7};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] >arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                     arr[j] = temp;
                }
            }
        }
        for (int ki = 0; ki < arr.length; ki++) {

            System.out.println(arr[ki]);
        }
    }

   }