package Chapter8;



public class SpecialAlarm {
   private int month;
   private int year;
   private int day;

   private static final int[] daysOfMonth = {0, 31, 28, 31, 30, 31, 31, 30, 31, 30, 31};

   public SpecialAlarm(int month, int day, int year) {
      validateMonth();
      validateDay();
      this.year = year;
      this.day = day;
      this.month = month;

   }

   public void validateMonth() {
      if (month < 0 || month > 12) {
         throw new IllegalArgumentException("month out of bound");
      }
   }

   public int getMonth() {
      return month;
   }

   public void setMonth(int month) {
      this.month = month;
   }

   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public int getDay() {
      return day;
   }

   public void setDay(int day) {
      this.day = day;
   }

   public void validateDay() {
      if (day < 0 || (day > daysOfMonth[month] && (month == 2 || day == 29))) {
         throw new IllegalArgumentException("enter a valid  day date");
      }

   }
   public String displayDate(){
return String.format("%d/%d/%d",month, day, year);

 }
}
















