package Chapter4;

public class FactorialReturn {
    public static int factorial(int number) {
        int result = 1;
        for (int i = number; i > 0; i--){

        result = result * i;
    }
        return result;
    }

    public static void main(String[] args) {
        int age = 12;
        System.out.println(factorial(age));
    }
        }