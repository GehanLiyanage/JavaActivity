package oop;

import java.util.Scanner;

public class exam {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Attendance : ");
        int attendance = obj.nextInt();
        System.out.print("Enter CA Marks : ");
        int Marks = obj.nextInt();

        if((attendance > 80) && (Marks > 40)){
            System.out.println("Your are Eligible for Final Exam");
        }
        else
            System.out.println("Your are Not Eligible for Final Exam");
    }
}
