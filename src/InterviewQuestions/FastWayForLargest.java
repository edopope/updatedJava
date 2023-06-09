package InterviewQuestions;

import java.util.Arrays;

public class FastWayForLargest {
    public static void main(String[] args) {
        int [] runnerAge = {44,6,7,8,933,5,7,8};
        int firstLargest = 0;
        int secondLargest = 0;
        for (int i = 0; i < runnerAge.length ; i++) {
            Arrays.sort(runnerAge);
            firstLargest = runnerAge[runnerAge.length-1];
            secondLargest= runnerAge[runnerAge.length -2];
        }
            System.out.printf("%d%n%d",firstLargest, secondLargest);
    }
}
