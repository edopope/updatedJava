package Activities;

public class ReverseInt {
    public static void main(String[] args) {
        int[] scores = {1, 2, 3, 4, 5};
        int[] anotherScores = new int[scores.length];
        for (int i = scores.length - 1; i >= 0; i--) {
            anotherScores[i] = scores[i];

            System.out.print(anotherScores[i] +"");
        }
    }
}