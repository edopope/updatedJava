package recursion;

public class Factorial {

    public static int factor(int factorNumber){
        if (factorNumber == 0 || factorNumber == 1){
            return factorNumber;
        }
        return factorNumber * factor(factorNumber -1);
    }

    public static void main(String[] args) {
        int digit = 5;
        System.out.println(factor(5));
    }

}
