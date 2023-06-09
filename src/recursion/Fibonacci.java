package recursion;

public class Fibonacci {
    public static int fibonacci(int digit){
      if (digit == 1 || digit == 0){
          return digit;
      }
      return fibonacci(digit - 1) + fibonacci(digit - 2);
    }

    public static void main(String[] args) {
        int num = 6;

        System.out.println(fibonacci(num));
    }
}
