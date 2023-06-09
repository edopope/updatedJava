package ChibuzoAssignment;

public class EvenLoop {
    public static void jumpLoop(int[] num) {
        int counter = 0;
        int total = 0;
        for ( counter = 0; counter < num.length; counter++) {
            if (counter % 2 ==   0) {
                total+= num[counter];
                System.out.print(num[counter] + " ");
            }

        }
        System.out.printf("%nThe total on even indexes is %n%d", total);
    }



    public static void main(String[] args) {
        int [] score = {1,3,5,7,9,11,13,15,17};
        jumpLoop(score);
    }
}

