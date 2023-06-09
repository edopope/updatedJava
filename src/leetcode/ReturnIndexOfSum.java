package leetcode;

import java.util.Arrays;

public class ReturnIndexOfSum {

    private static void returnTheIndex(int [] elements, int target) {
        int [] indexes = new int[2];
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[i] + elements[j] == target) {
                    indexes[0] = i;
                    indexes[1] = j;
                }
            }
//            System.out.printf("%d , %d ", i, j);
            //System.out.printf("%d ",indexes[i]);
        }
        System.out.println(Arrays.toString(indexes));

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int targets = 19;
        returnTheIndex(nums,targets);
    }
}
