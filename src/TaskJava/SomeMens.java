package TaskJava;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import static java.util.Calendar.DECEMBER;
import static java.util.Calendar.getAvailableLocales;

public class SomeMens {

           public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the date of the first day of your last period (YYYY-MM-DD): ");
            LocalDate lastPeriod = LocalDate.parse(scanner.nextLine());
            System.out.println("Enter the date of the first day of your current period (YYYY-MM-DD): ");
            LocalDate currentPeriod = LocalDate.parse(scanner.nextLine());
            int cycleLength = calculateCycleLength(lastPeriod, currentPeriod);
            int ovulation = cycleLength - 14;
            System.out.println("Your menstrual cycle length is " + cycleLength + " days. and ovulation is " + ovulation);
            System.out.println("Enter the number of days you bled during your current period: ");
            int bleedingDuration = Integer.parseInt(scanner.nextLine());
            double monthlyFlow = calculateMonthlyFlow(cycleLength, bleedingDuration);
            System.out.println("Your estimated monthly flow is " + monthlyFlow + " mL.");
        }

        public static int calculateCycleLength(LocalDate lastPeriod, LocalDate currentPeriod) {
            return (int) ChronoUnit.DAYS.between(lastPeriod, currentPeriod);

        }

        public static double calculateMonthlyFlow(int cycleLength, int bleedingDuration) {
            return (double) bleedingDuration / cycleLength * 30;
        }
    }




//        private static int cycleLength;
//        private static int periodLength;
//        private LocalDate lastPeriodStartDate;
//
//        public SomeMens(int cycleLength, int periodLength, LocalDate lastPeriodStartDate) {
//            this.cycleLength = cycleLength;
//            this.periodLength = periodLength;
//            this.lastPeriodStartDate = lastPeriodStartDate;
//        }
//
//        public LocalDate getNextPeriodStartDate() {
//            return lastPeriodStartDate.plusDays(cycleLength);
//        }
//
//        public void printCalendar() {
//            LocalDate startDate = getNextPeriodStartDate();
//            LocalDate endDate = startDate.plusDays(30);
//        }
//
//    public static void main(String[] args) {
//            int startDate =
//
//       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d");
//
//        System.out.println("Menstrual Cycle Calendar");
//        System.out.println("========================");
//        System.out.println("Cycle length: " + cycleLength + " days");
//        System.out.println("Period length: " + periodLength + " days");
//        System.out.println();
//        System.out.println("Start date: " + formatter.format(startDate));
//        System.out.println("End date: " + formatter.format(endDate));
//        System.out.println();
//
//        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");
//        LocalDate date = startDate;
//        while (date.isBefore(endDate)) {
//            if (date.isEqual(lastPeriodStartDate)) {
//                System.out.print("*");
//            } else {
//                System.out.print(" ");
//            }
//            System.out.printf("%4d", date.getDayOfMonth());
//            if (date.getDayOfWeek().getValue() == 7) {
//                System.out.println();
//            }
//            date = date.plusDays(1);
//        }
//        System.out.println();
//    }
//}
