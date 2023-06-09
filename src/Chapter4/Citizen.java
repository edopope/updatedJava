package Chapter4;

import java.math.BigDecimal;

public class Citizen {
    private String firstName;
    private BigDecimal earnings;
    private String lastName;


    public Citizen(){}
    public Citizen(String firstName, String lastName){
this.firstName = firstName;
this.lastName = lastName;
    };
   public Citizen(String firstName, String lastName,BigDecimal amount){
       this(firstName, lastName);
       this.earnings = amount ;
   }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public BigDecimal getEarnings() {
        return earnings;
    }

    public void setEarnings(BigDecimal earnings) {
        this.earnings = earnings;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
