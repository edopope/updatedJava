package Chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @BeforeEach
public void setUP(){
        FactorialReturn factorialReturn = new FactorialReturn();
    }

    @Test
    public void getFactorial(){
        int factorial = FactorialReturn.factorial(5);
        assertEquals(120, factorial);


    }

}
