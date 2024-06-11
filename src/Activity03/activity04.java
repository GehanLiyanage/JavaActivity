package Activity03;

import java.util.Scanner;

public class activity04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Attendance Percentage : ");
        int num = scan.nextInt();

        System.out.print("Enter Continuous Assessments Marks : ");
        int num2 = scan.nextInt();

        if (num >= 80) {
            if (num2 >= 40) {
                System.out.println("Your Are Eligibility of a Final Exam !!");
            } else
                System.out.println("Your Are Not Eligibility of a Final Exam");
        } else
            System.out.println("Your Are Not Eligibility of a Final Exam");

    }
}
