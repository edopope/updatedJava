package Chapter7;

import java.util.Arrays;

public class DeleteASingleArray {
    public static int [] singleDeleteArray(int[] array, int number){
        if (array == null  || number > array.length || number < 0) {
                return array;
            }
            int [] anotherArray = new int[array.length-1];
        for (int i = 0 , k =0; i < array.length; i++) {
           // int k = 0;
            if (i == number){
                continue;
            }
            anotherArray[k++] = array[i];
        }
       return anotherArray;
    }


    public static void main(String[] args) {
        int [] ages = {1,2,3,4,5,6,7};
        int index = 3 ;
        System.out.println(Arrays.toString(singleDeleteArray(ages, index)));
    }
}
