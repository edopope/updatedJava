package chapter14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
    public static boolean validatePassword(String password){
     String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
        Pattern pattern = Pattern.compile(regex);
        if (password == null){
            return false;
        }
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
        }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a password:");
        String password = keyboard.nextLine();
        if (PasswordValidation.validatePassword(password)){
            System.out.println("password successfully registered\n");
        }
        else {
            System.out.println("password not successfully registered");
        }
    }
    }

