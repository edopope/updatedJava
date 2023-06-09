package Chapter6;

import java.security.SecureRandom;

public class Craps {
    private enum status  {WON,LOST,CONTINUE};
    private static final SecureRandom random = new SecureRandom();
    private static final int win= 7;
        private static final int win2= 11;
        private static final int lose= 2;
        private static final int lose1= 3;
        private static final int lose2= 12;
        private static  int rollADice(){
            int die1 = 1 + random.nextInt(6);
            int die2 = 1 + random.nextInt(6);
            int sumOfDice = die1 + die2;
            System.out.printf("Player rolled %d + %d = %d%n",die1, die2,sumOfDice);
            return sumOfDice;
        }
    public static void main(String[] args) {
    int myPoint = 0;
int sum = rollADice();
        status gameStatus = null;
        if (sum == win || sum == win2){
            gameStatus = status.WON;
        }
        if (sum == lose || sum == lose1 || sum == lose2){
            gameStatus = status.LOST;
        }
        if(gameStatus == status.CONTINUE) {
            myPoint = sum;
            sum = rollADice();
            if (myPoint == sum) {
                gameStatus = status.WON;
            } else {
                if (sum == win) {
                    gameStatus = status.LOST;
                }
            }
        }
        if (gameStatus == status.WON){
            System.out.println("player won!!!");

        }
        else {
            if (gameStatus == status.LOST){
                System.out.println("player loses!!!");
            }
        }
    }
}
