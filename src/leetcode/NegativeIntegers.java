package leetcode;

import java.util.Arrays;

public class NegativeIntegers{
    public static void main(String[] args) {
        int [] arrays = {10, -1, 20, 4,5,-9,-6};
        //System.out.println(rearrange(arrays));
    }

    public static void rearrange(int[] arr) {
        int i = 0; // index for negative elements
        int j = arr.length - 1; // index for positive elements

        while (i <= j) {
            while (j >= 0 && arr[j] >= 0) {
                j--;
            }

            while (i < arr.length && arr[i] < 0) {
                i++;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }

}
