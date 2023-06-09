package ChibuzoAssignment;

public class TwoLargest {
    public static int largestOf(int...elements){
        int largest = 0;
        int secondLargest = 0;
        for (int index = 0; index < elements.length ; index++) {
            if(elements[index] > largest){
                secondLargest = largest;
                largest = elements[index];

            }

        }
        int sum = largest + secondLargest;
        return sum;


    }

    public static void main(String[] args) {
        int [] score = {2,4,5,6,2};
        System.out.printf("Result is %d", largestOf(score));
    }
}
 