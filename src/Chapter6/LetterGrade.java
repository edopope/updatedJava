package Chapter6;
import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int eCount = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("enter ctrl Z to start calculating");
        while (input.hasNext()) {
            int grade = input.nextInt();
            total += grade;
            gradeCounter++;
            switch(grade / 10){
                case 10:
                case 9:
                    ++aCount;
                    break;

                case 8:
                    bCount++;
                    break;

                case 7:
                    cCount++;
                    break;

                case 6:
                    dCount++;
                    break;

                case 5:
                    eCount++;
                    break;

            }


        }
        System.out.println("\n GRADE REPORT \n");
        if(gradeCounter != 0){
            double avg = (double)total / gradeCounter;

            System.out.printf("the total of all grades are %d%n%d%n", gradeCounter, total);
        }
    }
}