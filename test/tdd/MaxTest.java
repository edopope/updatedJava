package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTest {
    @Test
    public void checkTheSumOfTwoNumbers() {
        Maxi max = new Maxi();
        assertEquals(10, max.getSum(2, 6, 2));
    }

    @Test
    public void checkAverageOfNumbers() {
        Maxi max = new Maxi();
        assertEquals(100, max.getAverage(100, 100, 100));
    }


    @Test
    public void forProduct(){
        Maxi max = new Maxi();
            assertEquals(8, max.getProduct(2,2,2));
        }
        @Test
    public void testForSmallestNumber(){
        Maxi max = new Maxi();
        assertEquals(4,max.getSmallestNumber(49,34,4));
        }
        @Test
    public void testForLargestNumber(){
        Maxi max = new Maxi();
        assertEquals(90,max.getLargestNUmber(3,5,90));
        }
    }




