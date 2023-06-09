package TaskJava;


import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class StringDate {
    public static int stringToDate(String date){
        String[] eachDate = date.split("/");
            int day = Integer.parseInt(eachDate[0]);
            int month = Integer.parseInt(eachDate[1]);
            int year = Integer.parseInt(eachDate[2]);



            LocalDate dateOfBirth = LocalDate.of(year, month, day);
            LocalDate now   = LocalDate.now();

            Period age = Period.between(dateOfBirth,now);
            LocalDate nextAge = LocalDate.ofEpochDay(ChronoUnit.DAYS.between(now, dateOfBirth));
           return age.getYears();
//        return nextAge.getChronology().date(2021,12,6);
        }



    public static void main(String[] args){
        String day = "20/04/2023";
        System.out.println(stringToDate(day));
    }
}
