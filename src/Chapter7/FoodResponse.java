package Chapter7;

import java.security.SecureRandom;

public class FoodResponse {
    public static void main(String[] args) {
        int[] frequency = new int[6];
        int[] responses = {2, 3, 4, 5, 6};
        for (int counter = 0; counter <= 20; counter++) {

                ++frequency[responses[counter]];


                    System.out.println("responses\t\tanswer");
            }
            for (int i = 0; i <= frequency.length; i++) {
                System.out.printf("%d\t\t%d", i, responses[i]);

            }
        }
    }

