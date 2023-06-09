package chapter15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class HowToReadFromAFile {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the file::");
        Path path = Paths.get(keyboard.nextLine());
        //System.out.println(path.toAbsolutePath());
       try {
            File file = new File(path.toUri());
Scanner scanner = new Scanner(file);
while (scanner.hasNextLine()) {
    System.out.println(scanner.nextLine());
}
        }catch (FileNotFoundException e) {
            System.out.println("ERROR");
        }
    }
}