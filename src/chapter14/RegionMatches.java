package chapter14;

import java.util.Scanner;

public class RegionMatches {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a word:");
        String word = keyboard.nextLine();
        System.out.println("enter another word:");
        String word1 = keyboard.nextLine();
        if (word.regionMatches(0,word1,0,word.length())){
            System.out.printf("%sand%s%n%n matches",word,word1);
        }else {
            System.out.println("it does not match!");
        }
        if (word.regionMatches(true,0,word1,0,word.length())){
            System.out.printf("%sand%s matches with cases ignored",word,word1);
        }else {
            System.out.println("it does not match with cases ignored!");
        }
        }
    }

