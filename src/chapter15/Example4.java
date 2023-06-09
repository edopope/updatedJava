package chapter15;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Example4 {
    public static void main(String[] args) {
        byte[] bytes = "hello world".getBytes();
        try (DataOutputStream dos = new DataOutputStream(System.out)) {
            dos.write(bytes);
            try (PrintStream altOut = new PrintStream("C:\\Users\\DELL\\IdeaProjects\\colonJava\\src\\chapter15\\test.txt")) {
                System.setOut(altOut);

            } catch (IOException exception) {
                System.err.println(exception.getMessage());
            }
        }catch (IOException exception1){
            System.out.println(exception1.getMessage()); 
        }
    }
}