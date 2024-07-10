/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab04;

import java.util.Scanner;

/**
 *
 * @author gehan
 */
public class Question09 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Grade(Capital) : ");
        char letter = scan.next().charAt(0);

        switch (letter) {

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Well Done");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("You Pass");
                break;

            case 'F':
                System.out.println("Better Try Again");
                break;

            default:
                System.out.println("Invalid Grade");
                break;
        }
    }
    
}
