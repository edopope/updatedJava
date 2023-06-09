package Chapter7;

import java.util.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int count = 0;
        int[] tenElement = {12, 34, 44, 56, 12, 34, 34, 56,7, 12};
        int []temp = new int[tenElement.length];
            for (int index = 0; index < tenElement.length; index++){
         if(!elementCheck(tenElement[index],temp )){
             //Arrays.fill(tenElement, -1);

             temp[count++] = tenElement[index];
         }
                }
        for(int number : temp) {
            if(number != 0 ){
                System.out.printf("%d ", number);
            }

        }
            }
            public static boolean elementCheck(int element, int[] array){
        boolean check = false;
                for (int index = 0; index < array.length ; index++) {
              if(array[index] == element){
                  check = true;
              }
                }
                return check;
    }

}
