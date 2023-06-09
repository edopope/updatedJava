package menstalApp;
    import javax.swing.*;
    import java.time.LocalDate;
    import java.time.Period;
    import java.time.format.DateTimeFormatter;
    import java.time.temporal.ChronoUnit;
    import java.util.*;

public class MainClassForSome {
    public static void main(String[] args) {
        print("THE MONTHLY CYCLE APP");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date1 = inputIn("ENTER THE LAST FLOW(dd/mm/yyyy)");
        String date2 = inputIn("WHEN DID THE PERIOD FINISH (dd/mm/yyyy)::");
        int number = Integer.parseInt(inputIn("How many months do you   want to see::"));
        LocalDate startPeriod = LocalDate.parse(date1, formatter);
        LocalDate endPeriod = LocalDate.parse(date2, formatter);
        int daysInMonthOvulation = 0;
        for (int i = 1; i <= number; i++) {
            int length = (int) ChronoUnit.DAYS.between(startPeriod, endPeriod);
            //LocalDate ovulation = calculateOvulation(endPeriod, length).plusMonths(i);
            LocalDate fertilePeriod = startPeriod.plusMonths(i).plusDays(14).minusDays(2);
            LocalDate nextMonth = startPeriod.plusMonths(i);
            LocalDate ovulationDay = startPeriod.plusMonths(i).minusDays(14);
            LocalDate freePeriods = nextMonth.plusDays(3);
            int daysInMonth = nextMonth.getDayOfMonth();
            Period flowTime = Period.between(startPeriod,endPeriod);
            int newFlow = flowTime.getDays();
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("EEEE, dd/MMMM/yyyy");

            print("Your next period is on the -->  " + nextMonth.format(formatter1) + "\n\n ovulation is on  day --> " + ovulationDay.format(formatter1) +
                    "\n\n free period is  -->  " + freePeriods.format(formatter1) + "\n\n fertile period is ::" + fertilePeriod.format(formatter1)
             + "\n\n And Your blood flowed for-->" + newFlow + "days");
        }
    }

    private static void print(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
    }

    private static String inputIn(String prompt) {
        return JOptionPane.showInputDialog(null, prompt);
    }
}




