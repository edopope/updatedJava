package Chapter7;

import java.util.Arrays;

public class Sum2Arrays {
    public static int [] sum2Array(int[] array1, int[] array2) {
        int[] total = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            total[i] = array1[i] + array2[i];
            }


       return total;


    }

    public static void main(String[] args) {
        int [] age = {1,2,3,4};
        int [] age2 = {1,2,3,4};
        System.out.println(Arrays.toString(sum2Array(age, age2)));
    }
}
