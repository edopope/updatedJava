package chapter15;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScannerToCollectInput {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\DELL\\IdeaProjects\\colonJava\\godwin.txt");

        Scanner keyboard = new Scanner(fileInputStream);
        String input  = keyboard.nextLine();
         System.out.println("the program read:::" +input);
//     }catch (IOException exception){
//         System.out.println(exception.getMessage());
     }

    }

