package Chapter8;

public class HugeInteger {
    public int[] subtract(int[] number1, int[] number2) {
        int[] subtractedNumber = new int[number1.length];
        for (int j = 0; j < subtractedNumber.length; j++) {
            subtractedNumber[j] = number1[j] - number2[j];
        }

        return subtractedNumber;
    }

    public int[] add(int[] number1, int[] number2) {
        int[] additionArray = new int[number1.length];
        for (int i = 0; i < additionArray.length; i++) {
            additionArray[i] = number1[i] + number2[i];
        }
        return additionArray;
    }

    public void parse(String number) {
        int lengthOfNumber = number.length();
        for (int i = 0; i < lengthOfNumber; i++) {
            String character = Character.toString(number.charAt(i));
            int[] array = new int[lengthOfNumber];
            array[i] = Integer.parseInt(character);
        }
    }

    public boolean isGreaterThan(int[] array, int[] array1) {
        boolean check = false;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > array1[i]) {
                return true;
            }
        }


        return false;
    }

    public boolean isLessThan(int[] array, int[] array1) {
        boolean check = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array1[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean isEqualsTo(int[] array, int[] array1) {
        boolean check = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == array1[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean isNotEqualsTo(int[] array, int[] array1) {
        boolean check = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != array1[i]) {
                System.out.println("its not equals to");
            }
        }
        return false;
    }

    public boolean isLessThanOrEqualsTo(int[] array, int[] array1) {
        boolean check = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= array1[i]) {
                return true;
            }
        }
        return false;
    }
    public boolean isGreaterThanOrEqualsTo(int[] array, int[] array1) {
        boolean check = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= array1[i]) {
                System.out.println("its greater than or equals to  ");;
            }
        }
        return false;
    }
}