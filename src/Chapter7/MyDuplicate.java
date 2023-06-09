package Chapter7;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MyDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int[] theArray = new int[5];
        int[] temp = new int[theArray.length];
        int anotherCount = 0;
         while (count < 5) {
            System.out.println("Enter a number between 10 and 100 ");
            int numbers = scanner.nextInt();
            theArray[count++] = numbers;

            System.out.println(Arrays.toString(theArray));


            if (numbers < 10 || numbers > 100) throw new NoSuchElementException("NUMBER must be between 10 and 100");
            for (int i = 0; i < theArray.length; i++) {
                if (!duplicateArray(theArray[i], temp)) {
                    temp[anotherCount++] = theArray[i];
                }
            }
                for (int nums : temp) {
                    if (nums != 0) {
                        System.out.printf("%d ", nums);
                    }
                }

            }
        }



    public static boolean duplicateArray(int num, int[]arrays){
        for (int i = 0; i < arrays.length ; i++) {
          if (arrays[i] == num)  {
              return true;
          }
        }
        return false;
    }
}
