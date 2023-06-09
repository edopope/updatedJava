package chapter15;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Scanner;

public class FilesDirectory {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a file path::");
        Path myPath = Paths.get(keyboard.nextLine());
        if (Files.exists(myPath)) {
            System.out.printf("%s%n", myPath.getFileName());
            System.out.printf("%d%n",Files.size(myPath));


        }
       // if (Files.isDirectory(myPath)){
            System.out.println("\ndirectory contents\n");
            DirectoryStream<Path> directoryStream =
                    Files.newDirectoryStream(myPath);

            for (Path path:directoryStream) {
                System.out.println(path);
            }
        }
        }
    //}
