package Activities;
import java.util.Scanner;

public class BringNextArray {
    public static int reverseArray(int[] array) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == number) {
                number = array[i];
            }

        }
        return array[number];
    }


    public static void main(String[] args) {
    //    BringNextArray back = new BringNextArray();
       int [] numbers = {1,2,3,4,5};
        System.out.println(reverseArray(numbers));
    }
}







