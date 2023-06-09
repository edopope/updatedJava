package Activities;

import java.util.Scanner;
public class DriverWahala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int drive = 1;
        while (drive != 0) {
            System.out.println("Enter trip details:");
            String trip = input.nextLine();
            System.out.println("Enter the number of miles driven");
            int driver = input.nextInt();
            System.out.println("How many gallons used for each trip:");
            int gallons = input.nextInt();
            int milesPerGallon = drive / gallons;
            System.out.printf("you used %d gallons for each mile driven %n", milesPerGallon);
            double average = (double) gallons + drive / 2;
            System.out.printf("your average gallons used for each trip is %f%n", average);

            System.out.print("if you want to continue press 0");
            int q = input.nextInt();
            if(q == 0){
                continue;
            }
            else{
                break;
            }
        }
    }
}

