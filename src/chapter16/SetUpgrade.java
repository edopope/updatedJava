package chapter16;

import java.util.*;

public class SetUpgrade {
    public static void main(String[] args) {
        Set<String> newSentence = new HashSet<>();
        String [] sentence = new String[5];
        int count =0;
        Scanner keyboard = new Scanner(System.in);
        while (count < 5){
            System.out.println("Enter words::");
        String newWord = keyboard.nextLine();
         sentence[count] = newWord;
         count++;
        }
            System.out.println(Arrays.toString(sentence));
        List<String> anotherSentence = Arrays.asList(sentence);
        newSentence.addAll(anotherSentence);
        System.out.println(newSentence);
    }
}
