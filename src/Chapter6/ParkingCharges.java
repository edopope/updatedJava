package Chapter6;
import java.util.Scanner;
public class ParkingCharges {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int standardTime = 3;
        double baseCharges = 2.00;
        double additionalCharges = 0.50;
        System.out.println("Enter the number of hours::");
        int hours = input.nextInt();
        double extraCharges;
        if (hours >= 24) {
            int charge = hours - standardTime;
            extraCharges = charge * additionalCharges + baseCharges - 2.50;
        }
        else if (hours > standardTime) {
            int charge = hours - standardTime;
            extraCharges = charge * additionalCharges + baseCharges;
        }

     else {
            extraCharges =  baseCharges;
        }
        System.out.printf("%.2f--this is your charges",extraCharges);

    }
    }

