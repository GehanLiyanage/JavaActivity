package Activity01;

import java.util.Scanner;

public class activity06 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        final int NUM_STUDENTS = 5;
        final int NUM_SUBJECTS = 4;


        int[][] marks = new int[NUM_STUDENTS][NUM_SUBJECTS];


        String[] subjects = {"English", "Music", "Geography", "History"};


        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < NUM_SUBJECTS; j++) {
                System.out.print(subjects[j] + ": ");
                marks[i][j] = scanner.nextInt();
            }
            System.out.println();
        }


        System.out.println("Marks of all students:");
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < NUM_SUBJECTS; j++) {
                System.out.print(subjects[j] + "=" + marks[i][j] + " ");
            }
            System.out.println();
        }


        scanner.close();
    }
}
