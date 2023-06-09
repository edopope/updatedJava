package Chapter4;
import java.util.Scanner;
public class Sales {
    public static void main(String[] args) {
        for (int sales = 0; sales < 100000; sales++) {
            int weeklyPay = 200;
            int sum = sales;
            Scanner input = new Scanner(System.in);
            System.out.println("what is the sales for the week?-->");
            int weeklySales = input.nextInt();
            System.out.println("press '-1' to 'STOP AND' calculate");
            sum = weeklySales+sales;
            double commission = 0.09 * sum ;
            if (weeklySales == -1) {
                System.out.printf("your total commission is ::%.2f", commission);
                break;
            }

        }
    }
}