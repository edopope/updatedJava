package Activities;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String[] words = {"find","the","bag","nigga"};
        String [] newWords = new String[words.length];
        for (int i = words.length - 1; i >= 0; i--) {
            newWords[i] = words[i];
            System.out.print(newWords[i]+ " ");
        }
    }
}
