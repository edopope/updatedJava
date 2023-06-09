package Chapter5;

public class IntegersDivisbleBy3 {
    public static void main(String[] args) {
        int sumOfDivision = 0;
        int total = 0;
        for (int counter = 1; counter <= 30; counter++) {
            sumOfDivision = counter % 3;
            if (sumOfDivision == 0){
                total += counter;
            }
        }
                System.out.println(total);
    }
}
