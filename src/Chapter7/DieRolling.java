package Chapter7;

import java.security.SecureRandom;
import java.util.Arrays;

public class DieRolling {
    public static void printRow(int [] row){
for (int  i : row){


    System.out.print(i);
    System.out.print(" ");
}
    System.out.println();
    }
    public static void main(String[] args) {
//        SecureRandom random = new SecureRandom();
//        int[] times = new int[7];
//        int sum = 0;
//        for (int i = 1; i < 60; i++) {
//            ++times[1 + random.nextInt(6)];
//            //for (int j = 1; j < 60; j++) {
//                //++times[1 + random.nextInt(6)];
//                //sum = i + j;
//        if (i % 6 == 0) {
//            System.out.printf("%d", i);
//
//            }
//        }



        int[][] scores ={{12,3,4,5,6},
                {12,33,4,11,2222,4,9}};
        //for (int i = 0; i < scores.length ; i++) {
            //for (int j = 0; j < scores[i].length; j++) {
            for (int [] row : scores ){

                printRow(row);
            }
        }
                //System.out.println(Arrays.deepToString(scores));
            }


//}