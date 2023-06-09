package leetcode;

import java.util.Arrays;

public class RemoveFromParticularIndex {
    public static int [] removeFromIndex(int [] arrays , int index){
        int[] array = new int[arrays.length -1];
        int counter = 0;
        for(int i = 0; i < arrays.length; i++){
            if (i == index){
                continue;
            }
            array[counter++] = arrays[i];
        }
        return array;
    }

    public static void main(String[] args) {
        int [] scores = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(removeFromIndex(scores, 3)));
    }
}
