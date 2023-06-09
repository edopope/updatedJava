package Chapter7;

public class ArrayLargest {
    public static void main(String[] args) {
        GradeClass  classes = new GradeClass();
        int [] grade = {23, 3, 44, 56, 67, 66,99};
        System.out.printf("The lowest number in the array is --> %d%n%n",classes.getMinimum(grade) );
        System.out.printf("The highest number in the array is--> %d::",classes.getMaximum(grade) );

        }
    }

