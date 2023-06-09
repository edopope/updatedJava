package Activities;

import java.util.Scanner;

public class SentinelControlledLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gradeCounter = 0;
        StringBuilder name = new StringBuilder();
        System.out.println("enter name or end to finish");
        String first = input.nextLine();
        while(first != "end"){
            first = String.valueOf(input.hasNext());
           gradeCounter ++;
        }
        if(first.equals("end")){
            System.out.println("we have reached the end of line");
        }


    }
}
