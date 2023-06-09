package ChibuzoAssignment;

public class PairSum {
    public static  void  pairSum(int value, int...arrays) {
        int i;
        int j = 0;
        for (i = 0; i < arrays.length; i++) {
            for (j = i+ 1; j < arrays.length; j++) {
                if (arrays[i] + arrays[j] == value) {
                    System.out.printf("%d ,%d",i,j);
                }
            }
        }

    }


    public static void main(String[] args) {
        int [] scores = {12,3,4,5,6,7,8,5,3,2,1,35,576};
        pairSum(577,scores);
        for (int i = scores.length - 1; i >= 0; i--) {
            System.out.printf("%n%d",scores[i]);
        }
    }
}
