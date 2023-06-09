package Activities;

public class Multiply2 {

    public static int multiplyNumber(int number, int number2) {
        int sum = 0;
        for (int i = 1; i < number + 1; i++) {
            sum += number2;
           // if (number < 0 || number2 < 0) {
            //    return sum;
         //   }

        }
            return sum;
    }

        public static void main (String[]args){
            int n = 4;
            int y = 2;
            System.out.println(multiplyNumber(n, y));

        }
    }

