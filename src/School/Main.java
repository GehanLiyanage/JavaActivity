package School;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter student grade: ");
        String grade = scanner.nextLine();

        // Create a Student object
        Student student = new Student(name, age, grade);

        // Save student details in the database
        DBConnection dbConnection = new DBConnection();
        dbConnection.saveStudent(student);

        System.out.println("Student details saved successfully!");
    }
}
