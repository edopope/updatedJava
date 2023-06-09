package Chapter8;

public class NewTime extends TimeClass {
    public NewTime(int hour, int minute, int seconds) {
        super(hour, minute, seconds);
    }

    public static void main(String[] args) {
      NewTime times = new NewTime(1,0,4);
        System.out.println(times.displayTime());
//        System.out.println(times.getSeconds());
//        System.out.println(times.getHour());
//        System.out.println(times.getMinute());
    }
}
