package Chapter6;

import java.security.SecureRandom;
import java.util.Objects;
import java.util.Scanner;

public class GuessTheNumber {
    private static final SecureRandom randoms = new SecureRandom();

    public static void main(String[] args) {
        int counter = 0;
        Scanner keyboard = new Scanner(System.in);
        int guessingNumber = randoms.nextInt(1, 3);
       // int guess = keyboard.nextInt();
        while (counter < 10) {
            String answer = keyboard.nextLine();
              System.out.println("Guess A Number between 1 and 1000");
                int guess = keyboard.nextInt();
                if (guess > guessingNumber) {
                    System.out.println("too high! Try Again");
                    counter++;
                }  if (guess < guessingNumber) {
                    System.out.println("too low! Try Again");
                    counter++;
                }
                    if (guess == guessingNumber) {
                        System.out.println("you guessed right!");
                        counter++;
                        System.out.println("Would like to play again  'YES' or 'NO' ");

                        if (answer == "yes"){
                            continue;
                        }else if (answer == "no"){
                            break;
                        }

                    }
        if (counter > 3 && guessingNumber == guess){
            System.out.println("you know the secret");
        }else{
            System.out.println("you should be able to do better");
        }
                }
            System.out.printf("counter = %d%n guessingNumber%d",counter,guessingNumber);
            }
        }
   // }
//}