package Activities;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

class CapitalTestTest {
    @Test
   public void checkIfStringCapitalize(){
        Transfigure transfigure = new Transfigure();
        assertEquals("John",    transfigure.capitalise("john"));
    }



}