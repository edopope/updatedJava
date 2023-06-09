package Chapter8;

public class TimeClass {
    private int hour;
    private int seconds;
    private int minute;

    public  int getHour() {
        return hour;
    }

    public  void setHour(int hour) {
        this.hour = hour;
    }

    public  int getSeconds() {
        return seconds;
    }

    public  void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public TimeClass(int hour, int minute, int seconds) {
        validateHour();
        validateMinutes();
        validateSeconds();
       this.hour = hour;
       this.minute = minute;
        this.seconds = seconds;




    }

    public void validateHour() {
        if (hour < 0 || hour > 60) {
            throw new IllegalArgumentException("enter a valid hour");

        }
    }

    public  void validateMinutes() {
        if (minute < 0 || minute > 60) {
            throw new IllegalArgumentException("enter a valid hour");
        }
    }

    public  void validateSeconds() {
        if (seconds < 0 || seconds > 24) {
            throw new IllegalArgumentException("enter a valid hour");
        }
    }
    public String displayTime(){
        return String.format("%02d : %02d : %02d",hour, minute,seconds);

    }

}