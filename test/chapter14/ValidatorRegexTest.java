package chapter14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorRegexTest {
    @Test
    public void testForValidation(){

        assertTrue(ValidatorRegex.Validates("agent-001"));
    }


}