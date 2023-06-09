package chapter15.javaNIOpackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativePath {
    public static void main(String[] args) {
        Path path = Paths.get("").toAbsolutePath();
        Path newPath = Paths.get("C:\\Users\\DELL\\IdeaProjects\\colonJava\\chapter15\\myFiles\\godwin.txt");
        Path relative = path.relativize(newPath);

        System.out.println("isDirectory:::" +Files.isDirectory(path));
        System.out.println("it Exist:::" + Files.exists(path));
        try {
            Files.getLastModifiedTime(path);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
