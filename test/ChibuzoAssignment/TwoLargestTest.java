package ChibuzoAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoLargestTest {
@Test
    public void testTwoLargest() {
    int[] score = {1, 2, 3, 4, 5, 6,10,11,20};
    assertEquals(31, TwoLargest.largestOf(score));

    }
}