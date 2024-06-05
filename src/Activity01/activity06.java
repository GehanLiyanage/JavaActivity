package Activity01;

import java.util.Scanner;

public class activity06 {

    public static void main(String[] args) {

        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Number of students and subjects
        final int NUM_STUDENTS = 5;
        final int NUM_SUBJECTS = 4;

        // 2D array to hold marks of students
        int[][] marks = new int[NUM_STUDENTS][NUM_SUBJECTS];

        // Array to hold the names of the subjects
        String[] subjects = {"English", "Music", "Geography", "History"};

        // Input marks for each student
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < NUM_SUBJECTS; j++) {
                System.out.print(subjects[j] + ": ");
                marks[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        // Display the marks for each student
        System.out.println("Marks of all students:");
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < NUM_SUBJECTS; j++) {
                System.out.print(subjects[j] + "=" + marks[i][j] + " ");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
