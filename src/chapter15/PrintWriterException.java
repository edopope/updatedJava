package chapter15;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterException {
    public static void main(String[] args) {
        try(PrintWriter writer = new PrintWriter("godwin.txt")){
            writer.print("godwin baddest");
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
