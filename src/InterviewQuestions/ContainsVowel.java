package InterviewQuestions;

import java.util.Objects;
import java.util.Scanner;

public class ContainsVowel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //String vowel = "a,e,i,o,u";
        System.out.println("Enter a word:");
        String word = keyboard.nextLine();
        isVowel(word);
    }

        public static void isVowel(String input){
        if (input.toLowerCase().matches(".*[aeiou].*")){
            System.out.println("its has a vowel");
        }
        else {
            System.out.println("its does not have a vowel");
        }

        }



//        String cool = null;
//        for (int i = 0; i < vowel.length(); i++) {
//            cool = String.valueOf(vowel.charAt(i));
//
//            if (Objects.equals(word, cool)) {
//                System.out.println("its contains vowel");
//            } else {
//                System.out.println("Its a consonant");
//            }
//        }
    }
