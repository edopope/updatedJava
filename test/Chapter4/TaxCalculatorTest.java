package Chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {
    private TaxCalculator calculator;
    private Citizen mathias;
    private Citizen godwin;
    private Citizen uyi;
    @BeforeEach
    public void SetUp(){
        mathias = new Citizen();
        mathias.setFirstName("Mathias");
        mathias.setLastName("Mike");
        mathias.setEarnings(new BigDecimal(17000));

        godwin = new Citizen("Godwin","stanley");
        BigDecimal salary = new BigDecimal(25000);
        godwin.setEarnings(salary);

        uyi = new Citizen("uyi","stanley");
        BigDecimal salary1 = new BigDecimal(45000);
        uyi.setEarnings(salary1);


    }
    @Test
    public void calculateTax(){
        BigDecimal mat = TaxCalculator.calculateTax(mathias);
        assertEquals(2550, mat.intValue());

        BigDecimal win = TaxCalculator.calculateTax(godwin);
        assertEquals(3750, win.intValue());
    }
    @Test
    public  void calculateBigRate(){
        BigDecimal y = TaxCalculator.calculateTax(uyi);
        assertEquals(7500, y.intValue());
    }

}