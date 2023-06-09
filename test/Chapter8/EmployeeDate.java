package Chapter8;

public class EmployeeDate {

    private String firstname;
    private String lastname;
    private SpecialAlarm birthDate;
    private SpecialAlarm hireDate;

    public EmployeeDate(String firstname, String lastname, SpecialAlarm birthdate, SpecialAlarm hiredate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthdate;
        this.hireDate = hiredate;
    }
    public String employeeDisplay(){
        return String.format("firstname:%s%n, lastname:%s%n, birthdate:%s%n, hiredate:%s%n ",firstname,lastname,birthDate,hireDate);

    }

}
