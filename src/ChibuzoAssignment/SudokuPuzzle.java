package ChibuzoAssignment;

import java.security.SecureRandom;

public class SudokuPuzzle {
    public static void main(String[] args) {
        for(int counter = 1; counter <= 9; counter++){
            for (int counter2 = 0; counter2 <=8 ; counter2++) {
                int  sum = counter2 +counter;
                if((sum) >9){
             System.out.printf("%d   ",(sum) % 9);

}
                else{
    System.out.printf("%d   ", counter + counter2);

                }
            }
            System.out.println( );
        }


        }
    }

