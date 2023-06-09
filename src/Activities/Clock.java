package Activities;

public class Clock {
    private int hour;
    private int seconds;
    private int minute;

    public Clock (int hour,int minute, int seconds) {
        //if (hour <= 23 || minute <= 60 || seconds <= 60) {
            if (hour <= 23 || minute <= 60 || seconds <= 60) {



                this.hour = hour;
                this.minute = minute;
                this.seconds = seconds;

            }



        }




    public String toString(){
        if(hour < 12){
            System.out.println("AM");
        }
        else {
            System.out.println("PM");
        }
        return String.format("%02d:%02d:%02d", hour,minute,seconds);

        }
    }



