package ChibuzoAssignment;

import java.util.Scanner;

public class SubjectAndStudent {
    Scanner input = new Scanner(System.in);
    private int noOfStudent;
    private int noOfSubject;
    private int [][] scoresInArray;

    public void enterDisplay(){
        System.out.println("how many student do you have:");
        noOfStudent = input.nextInt();
        System.out.println("how many subject do you have:");
        noOfSubject = input.nextInt();
        System.out.println("Saving >>>>>>>>>>>>>>>>");
        System.out.println("saved successfully");

    }
    public void secondDisplay(int studentNumber, int subjectNumber){
        System.out.printf("enter student score %d%n", studentNumber);
        System.out.printf("enter subject score %d%n",subjectNumber);
        int score = input.nextInt();
        scoresInArray [studentNumber][subjectNumber] = score;
        System.out.println("saved");

    }

}
