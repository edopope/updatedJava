package chapter14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = keyboard.nextLine();
//        String[] words = sentence.split(" ");
//        for (int i = 0; i < sentence.length(); i++)
//                if (words[i].length() > longestWord.length()) {
//                    longestWord = words[i];
//                    System.out.printf("%s",longestWord);
//                }
        String longestWord = Arrays.stream(sentence.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(longestWord);

            }
        }


