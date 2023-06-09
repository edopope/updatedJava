  package Chapter7;

public class ScrambledArray {
    public void ScArray(int... array) {
        int temp;
        for (int a = 0; a < array.length -1; a++) {
            for (int b = 0; b < array.length-1; b++) {
                if (array[b] > array[b]) {
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        ScrambledArray  myArray = new ScrambledArray();
        int [] numbers = {1,22,4444,5,6,55,7};
        myArray.ScArray(numbers);
        for(int x : numbers){
            System.out.print(x);
            System.out.print(" ");
        }


    }
}