package Activities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Multiply2Test {

    @Test
    public  void testForMultiplication(){

        int a =4;
        int b =5;
        assertEquals(20  , Multiply2.multiplyNumber(a, b));

    }

}