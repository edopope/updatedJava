package leetcode;

public class NonRepeatingIndex {
    public static void main(String[] args) {
        int[] age = {1,2,3,1,2};
        int digit = age.length;
        System.out.println(firstNonRepeatingIndex(age, digit));
    }

    public static int firstNonRepeatingIndex(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j])
                    break;

                if (j == number - 1) {
                    return array[i];
                }

            }
        }
            return -1;
    }
}