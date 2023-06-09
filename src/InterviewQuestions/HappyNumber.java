package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

    public static boolean isHappy(int number) {
        List<Integer> sums = new ArrayList<>();
        int newNumber1 = number;
        int sum1 = number;
        if (number == 1) return true;
        while (sum1 != 1){
            sums.add(sum1);
            newNumber1 = sum1;
            sum1 = 0;
            for (int i = 0; newNumber1 != 0;newNumber1 /= 10) {
                sum1 += (int) Math.pow(newNumber1 % 10, 2);
            }
            if (sums.contains(sum1)) return false;
        }
        return true;
        }









    public static void main(String[] args) {
        int number4 = 94;
        int number5 = 100;

        System.out.println(isHappy(number4));
        System.out.println(isHappy(number5));
    }
}
