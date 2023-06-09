package Chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] age = {1, 26, 3, 1, 3, 1, 5, 6, 7};
        int[] number = new int[age.length];
        int count = 0;
        for (int i = 0; i < age.length; i++) {
            if (!isDuplicate(number, age[i])) {
                number[count++] = age[i];
            }
        }
            for (int k : number) {
                if (k != 0) {
                    System.out.printf("%d, ",k);
                    //System.out.println(" ");
                }
            }
        }


    private static boolean isDuplicate(int[] scores, int digit) {
        for (int counter = 0; counter < scores.length; counter++) {
            if (scores[counter] == digit) {
return true;


            }
        }

return false;
    }


}