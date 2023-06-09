package tdd;

import org.junit.jupiter.api.Test;

public class Maxi {
    public int getSum(int x, int y, int z) {
        return x + y+ z;
    }

    public int getAverage(int a, int b, int c) {

        int sum= a+b+c;
        int total = sum/3;
        return total;

    }

    public int getProduct(int a, int b, int c) {
        return a*b*c;
    }

    public int getSmallestNumber(int a,int b,int c ) {
        return Math.min(a,Math.min(b,c));

    }

    public int getLargestNUmber(int a, int b, int c) {
        return Math.max(a,Math.max(b,c));

    }


/*
    public boolean noNegative(int number) {
        return (number > 0);
    }*/
}
