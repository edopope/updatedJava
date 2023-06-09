package Activities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    @Test
    public  void testForMultiplication(){
       // Multiplication multiplication = new Multiplication();
        int a = 4;
        int b = 5;
        assertEquals(20  , Multiplication.multiply(a, b));

    }

}