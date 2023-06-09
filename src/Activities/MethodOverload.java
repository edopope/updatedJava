                                                                                                                                                                                                                        package Activities;
import java.util.Scanner;

public class MethodOverload {
    public int addNumbers(int num1, int num2){
        return num1 + num2;
    }
    public double addNumbers(int numA, double num2){
        return numA + num2;
    }
    public double addNumbers(double a, double b){
        return a+b;
    }
    public double addNumbers(double c,int a ){
        return c+a;
    }

    public static void main(String[] args) {
        MethodOverload over = new MethodOverload();
        double result = over.addNumbers(2,39);
        System.out.printf("your answer is -->%f", result);
        System.out.println();

    }
}

