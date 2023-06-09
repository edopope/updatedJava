package leetcode;

import java.util.Arrays;

public class SumInThrees {
    public static void main(String[] args) {
        int large = 0;
        int range = 3;
        int[] scores = {4, 0, 0, 2, 1, 4};
        int[] sum = new int[range];
        for (int i = 0; i < scores.length - range; i++) {
            int temp = scores[i];
            //for (int j = 1; j < range; j++) {
                temp += scores[i];
                if (temp > large) large = temp;
            System.out.println(scores[i]);
            }
        System.out.println("The largest of sum is --> " +  large);
        }







    public static int sub(int[] arrays, int range) {
        int max = 0;
        for (int i = 0; i < arrays.length - range; i++) {
             int count = 0;
            int total = 0;
            while (count < 3) {
                total += arrays[i];
                i++;
                count++;
                if (total > max) {
                    max = total;
                }
            }
        }
        return max;
    }
    public static int subArray(int[] arrays, int range) {
        int max = 0;
        int begin = 0;
        int total = 0;
        for (int i = 0; i < arrays.length - range; i++) {
            total = arrays[begin] + arrays[begin+1] + arrays[begin + 2];
            begin++;
            if (total > max) {
                max = total;
            }
        }
        return max;
    }
    public static int subArray2(int[] arrays, int range) {
        int count = 0;
        int max = 0;
        int total = arrays[0] + arrays[1] + arrays[2];
        for (int i = range; i < arrays.length; i++) {
            if (total > max) {
                max = total;
            }
            total = total - arrays[count] + arrays[range];

            count++;
            range++;

        }
        return max;
    }
}

