package ChibuzoAssignment;

public class FunctionTotal {
    public static int total(int[] scores){
        int total1 = 0;
        for (int i = 0; i < scores.length ; i++) {
            total1 = total1 +scores[i];


        }
        return total1;
    }


    public static void main(String[] args) {
        int [] digit = {3,4,5,6};
        System.out.printf("The total is %d", total(digit));
    }
}
