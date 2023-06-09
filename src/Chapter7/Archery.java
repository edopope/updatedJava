package Chapter7;
   import java.security.SecureRandom;

import java.util.Arrays;

public class Archery {
    private int scores;
           public static void main(String[] args) {
            SecureRandom random = new SecureRandom();

            int[][] scores = new int[4][3];
            int[] totalScores = new int[4];

            // Generate scores for all players
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 3; j++) {
                    scores[i][j] = random.nextInt(11);
                    totalScores[i] += scores[i][j];
                }
            }

            // Print table of scores
            System.out.println("Player\tChance 1\tChance 2\tChance 3\tTotal Score");
            for (int i = 0; i < 4; i++) {
                System.out.printf("%d\t\t\t%d\t\t\t%d\t\t\t%d\t\t\t%d\n",
                        i + 1, scores[i][0], scores[i][1], scores[i][2], totalScores[i]);
            }

            // Determine the player with the highest score
            int winner = 0;
            for (int i = 1; i < 4; i++) {
                if (totalScores[i] > totalScores[winner]) {
                    winner = i;
                }
            }

            // Print winner
            System.out.printf("Player %d wins with a total score of %d\n", winner + 1, totalScores[winner]);
        }
    }






