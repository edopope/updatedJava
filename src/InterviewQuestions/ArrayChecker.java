package InterviewQuestions;

public class ArrayChecker {
    public static boolean arrayChecker(int [] a, int [] b) {
        boolean toCheck = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = i ; j < b.length; j++) {
                if (a[i] == b[j]) {
                    toCheck = true;
                }
            }
        }
        return toCheck;
    }

    public static void main(String[] args) {
        int [] score = {2,2,3,4};
        int [] score1 = {1,2,3,4};
        System.out.println(arrayChecker(score,score1));
    }
}
