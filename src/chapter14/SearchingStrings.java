package chapter14;

import java.util.Scanner;

public class SearchingStrings {
    public static void main(String[] args) {
        int counter = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a text:");
        String searchText = keyboard.nextLine();
        System.out.println("Enter the letter u want to find:");
        String searchFor = keyboard.nextLine();
        //int find = searchText.indexOf(searchFor);
        String [] myWords = searchText.split(" ");
        for (int i = 0; i < myWords.length ; i++) {
           // if (myWords == searchText.charAt(i))
        }







       // System.out.printf("%d is the number of times it appears",counter);


        }
    }

