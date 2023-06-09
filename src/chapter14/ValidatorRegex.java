package chapter14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorRegex {
    public static void main(String[] args) {
        //Pattern pattern = Pattern.compile("\\d");
       // Matcher matcher = pattern.matcher("agent-001");
        System.out.println(Validates("agent-005"));


    }

        public static boolean Validates(String text){
         Pattern pattern = Pattern.compile("^agent-0{2}(1-9)*?");
         Matcher matcher = pattern.matcher(text);
         return matcher.matches();
        }
}


