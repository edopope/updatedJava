package Chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialAlarmTest {

    @Test
    public void checkValidation() {
        SpecialAlarm dateOfBirth= new SpecialAlarm(6, 3, 1978);
        SpecialAlarm hireDate= new SpecialAlarm(6, 12, 2015);
        EmployeeDate alex = new EmployeeDate("alex","hope", dateOfBirth,hireDate);
        System.out.println(alex);
    }
}