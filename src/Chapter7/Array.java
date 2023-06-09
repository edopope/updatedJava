package Chapter7;

public class Array {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 15;
        int array[] = new int[ARRAY_LENGTH];
        System.out.printf("%11s%20s%n","numbers", "total");
        for(int counter = 0; counter < array.length; counter ++){
            array[counter] = 10 + 2 * counter;
            System.out.printf("%10d%20d%n", counter, array[counter]);
        }
    }
}
