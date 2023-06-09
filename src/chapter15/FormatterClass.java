package chapter15;

import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class FormatterClass {
    public static void main(String[] args) {
        String name = "my name is godwin";
        StringBuilder builder = new StringBuilder();
        Scanner scanner = new Scanner("C:\\Users\\DELL\\IdeaProjects\\colonJava\\godwin.txt");
        while(scanner.hasNext()){
            builder.append(scanner.next());
        }
        builder.append(name);
           //System.out.println(builder);

       try(Formatter formatter = new Formatter("C:\\Users\\DELL\\IdeaProjects\\colonJava\\godwin.txt")){
         formatter.format("file contents have been updated from %s to %s",builder,builder.append(name));
       }catch (IOException e){
           System.out.println(e.getMessage());
       }
    }



}
