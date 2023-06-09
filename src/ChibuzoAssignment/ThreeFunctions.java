package ChibuzoAssignment;

public class ThreeFunctions {
    public static int doWhile(int[] number) {
        int total = 0;
        int b = 0;
        int i = number.length;
        do {
            total += number[b];
            b++;
        }
        while (b < number.length);


        return total;
    }
        public static int forLoop(int[] scores){
            int total1 = 0;
            for (int i = 0; i < scores.length ; i++) {
                total1 = total1 +scores[i];

            }
            return total1;
        }


        public static int whileLoop(int [] score){
        int total2 = 0;
        int x = 0;
        while (x < score.length){
            total2 += score[x];
            x++;
        }
        return total2;
        }

    public static void main(String[] args) {
        int [] phoneNumber = {23,1,1,1};
        System.out.println(whileLoop(phoneNumber));
    }
}
