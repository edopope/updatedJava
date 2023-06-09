package Chapter2;

import java.util.Scanner;

public class Divisble3 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("ENTER A DIGIT::");
        int enter = input.nextInt();
            if(enter % 3 == 0){
                System.out.println("yes");
            }
            else{
                System.out.println("not divisible");
            }
        }


    }

