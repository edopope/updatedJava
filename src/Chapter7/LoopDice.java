package Chapter7;
import java.security.SecureRandom;
public class LoopDice {
    public static void main(String[] args) {
        SecureRandom randy = new SecureRandom();
        int [] numberOfTimes = new int[7];
        for(int counter = 1; counter <= 60; counter++) {
           // numberOfTimes = 1 + [randy.nextInt(6)]
            System.out.printf("%d",counter);

            if (counter % 12 == 0) {
                System.out.println( ",");
            }

        }
        //System.out.println(Math.pow(445,33));
    }
}
