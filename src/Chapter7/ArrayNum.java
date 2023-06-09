package Chapter7;

public class ArrayNum {
    public int addNumbers(int[]numbers){
        int total = 0;
      for(int x = 0; x< numbers.length; x++ ){
            total += numbers[x];
        }
        return total;
    }

    public static void main(String[] args) {
        ArrayNum nums = new ArrayNum();
        int[] digits = {56,89,0,77,98,8};
        System.out.printf("%d", nums.addNumbers(digits));

    }
}
