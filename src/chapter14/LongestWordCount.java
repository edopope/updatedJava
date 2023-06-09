package chapter14;

import java.util.Scanner;

public class LongestWordCount {
    public static int countLongestWord(String word){
        int longestWord =0;
            String [] myWord = word.split(" ");
        for (String s : myWord) {
            if (longestWord < s.length()) {
                longestWord = s.length();

            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a word:");
        String newWord = keyboard.nextLine();
        System.out.println(LongestWordCount.countLongestWord(newWord));
    }
}
