package Chapter5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        int counterA = 0;
        int counterB = 0;
        int counterC = 0;
        int counterD = 0;
        boolean continueLoop = true;
        do {

            try {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("how many student do u have:");
                int studentNumber = keyboard.nextInt();
                for (int i = 1; i <= studentNumber; i++) {
                    System.out.println("enter student grades:");
                    String studentGrades = keyboard.nextLine();

                    if ("A".equals(studentGrades)) {
                        counterA++;
                    }
                    if ("B".equals(studentGrades)) {
                        counterB++;
                    }
                    if ("C".equals(studentGrades)) {
                        counterC++;
                    }
                    if ("D".equals(studentGrades)) {
                        counterD++;
                    }
                }
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Enter a alphabet in capital letters");
            } catch (InputMismatchException inputMismatchException) {
              System.out.println("enter a number!");
            }
                    System.out.printf("Numbers of Students that got 'A' is %d%nNumbers of Students that got 'B' is %d%nNumbers of Students that got 'C' is %d%nNumbers of Students that got 'D is %d%n", counterA, counterB, counterC, counterD);

        }while (continueLoop);
    }
}
