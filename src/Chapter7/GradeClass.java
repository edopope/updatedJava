package Chapter7;

public class GradeClass {
    private int minimum;

    public int getMinimum(int[] grade) {
        int lowgrade = grade[0];
        for (int number : grade) {
            if (number < lowgrade) {
                lowgrade = number;
            }
        }
        return lowgrade;
    }





    public int getMaximum(int[] grade) {
        int highGrade = grade[0];
        for (int number : grade) {
            if (number > highGrade){
                highGrade = number;
            }
        }
        return highGrade;
    }
}
