package Chapter7;

public class ArrayAsterisk {
    public static void main(String[] args) {
        int [] numerals = {9,4,4,5,2,5,3,6,7};
        System.out.println("POSITION DISTRIBUTION");
        for(int counter = 0; counter < numerals.length; counter ++){
            if(counter == 8) {
                System.out.printf("%n%d: ",100);
            }
                else{
                    System.out.printf("%n%03d - %03d", counter * 10, counter * 10 + 9);
                }
                for(int asterisks = 0; asterisks < numerals[counter]; asterisks++){
                    System.out.print(" *");
            }
        }
    }
}
