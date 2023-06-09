package Activities;

import java.util.Locale;

public class Transfigure {

    public String capitalise(String word) {
        char firstLetter = word.toUpperCase().charAt(0);
        String otherLetter = "";
        int index = 1;
         while(index < word.length()) {
             otherLetter += word.charAt(index);
             index++;
         }
         return firstLetter + otherLetter.toLowerCase();
    }
}
