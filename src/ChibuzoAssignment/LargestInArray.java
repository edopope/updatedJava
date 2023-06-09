package ChibuzoAssignment;

import java.math.BigDecimal;

public class LargestInArray {
    private int total = 100;
            public int LargeArray(int[] number) {
        int largest = 0;
        for (int index = 0; index < number.length; index++) {
            if (number[index] > largest) {
                largest = number[index];

            }

        }
        return total += largest;
    }

    public static void main(String[] args) {

        LargestInArray myArray = new LargestInArray();
        int [] number = {45,67,66,77,88,90};
        System.out.printf("the highest number is %d", myArray.LargeArray(number));

        }
    }



