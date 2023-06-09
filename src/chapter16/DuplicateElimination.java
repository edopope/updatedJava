package chapter16;

import java.awt.image.ColorConvertOp;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElimination {
    public static void main(String[] args) {
        int count = 0;
        Scanner keyboard = new Scanner(System.in);
        Set<String>firstName = new HashSet<>();
       while(count < 5){
           System.out.println("Enter a firstName:");
           String firstName2 = keyboard.nextLine();
           firstName.add(firstName2);
           count++;
       }
        System.out.println(firstName);
        System.out.println("\nEnter a name to search for:::");
        String search = keyboard.nextLine();
       if (firstName.contains(search)){
           System.out.println(search + " Exist in the Set");
       }
       else {
           System.out.println(search + " Does not exist in Set");
               }
           }
       }

