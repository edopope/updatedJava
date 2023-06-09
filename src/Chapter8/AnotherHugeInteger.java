package Chapter8;

import java.util.Arrays;

public class AnotherHugeInteger {
    public static void main(String[] args) {
        HugeInteger hugeInteger = new HugeInteger();
        int [] age = {3,3,34,7};
        int [] age2 = {2,3,4,5};
        System.out.println(Arrays.toString(hugeInteger.add(age,age2)));
        System.out.println(hugeInteger.isLessThan(age, age2));
    }
}
