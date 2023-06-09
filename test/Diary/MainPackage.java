package Diary;

import javax.swing.*;
import java.util.Scanner;

public class MainPackage {
    Scanner input = new Scanner(System.in);
    private static Diary diary;
    public static void main(String[] args) {
        createDiary();
        displayLockMenu();
    }
    public static void createDiary(){
        String mainMain = """
                Welcome to my diary!!!
                Let's setup your diary
                """;
        print(mainMain);
        String userName = input("Enter Your Name:");
        String password = input("Enter Password:");
        diary = new Diary(userName, password);
        print("Diary created for " + userName);
        displayDiaryMenu();
    }
    public static void displayLockMenu(){
        String mainMain = """
                press 1 --> Unlock Diary
                press 2 --> Lock Diary
                press 3 --> Exit
                """;

        String userInput = input(mainMain);
        switch (Integer.parseInt(userInput)){
            case 1: unlockDiary();
            case 2 : lockDiary();
            case 3 : exitApplication();
        }

    }
    private static void findById(){
        String id  = input("Enter the id for the entry u want to find");
        Happenings foundHappenings = diary.foundEntryWithId(Integer.parseInt(id));
        print(foundHappenings.toString());
        displayDiaryMenu();
    }
    private static  void createEntry(){
        String title = input("Enter title for your Entry:");
        String body = input("Enter body of your diary:");
        diary.write(title, body);
        print("Written successfully");
        displayDiaryMenu();
    }
    private static void exitApplication(){
        System.out.println("Thanks for using our Application");
        System.exit(0);
    }
    private static void unlockDiary(){
        String password = input("Enter the correct password");
        diary.unlockedWith(password);
        if(diary.isLocked()){
            print("wrong password");
        }
        displayLockMenu();
    }
    public static  void displayDiaryMenu(){
        String diaryMenu = """
                press 1 --> Create Entry
                press 2 --> Find Entry By Id
                press 3 --> Get total number of entries
                press 4 --> Lock diary
                """;
        String userInput = input(diaryMenu);
        switch(Integer.parseInt(userInput)){
            case 1 -> createEntry();
            case 2 -> findById();
            case 3 -> getTotalNumberOfHappenings();
            case 4 ->lockDiary();
        }
    }
    private static void getTotalNumberOfHappenings(){
        int totalNumberOfHappenings = diary.numberOfHappenings();
        print("you have" + totalNumberOfHappenings);
        displayDiaryMenu();
    }
    private static void lockDiary(){
        diary.locked();
        print("locked successfully");
        displayDiaryMenu();
    }


    public static void print(Object printable){
        System.out.println(printable);
    }
    public static String input(String prompt){
        return JOptionPane.showInputDialog(null,prompt);
    }
}
