package Chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeClassTest {
    @Test
    public void TestForTime(){
        TimeClass myTime = new TimeClass(4,30,20);
        //myTime.validateSeconds();
        //myTime.validateHour();
        //myTime.validateMinutes();
        System.out.println(myTime.displayTime());
    }

}