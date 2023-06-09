package leetcode;

import java.util.Arrays;

public class RemoveFromArray {
    public static int[] removeFromArray(int [] array, int val){
        int count = 0;
        int [] newArray = new int[array.length -1] ;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == val){
                continue;
            }
           newArray[count++] = array[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int [] age = {1,2,3,4,5,6,7,8};
        int value = 4;
        System.out.println(Arrays.toString(removeFromArray(age, value)));
    }
}
