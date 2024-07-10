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
public class Question05 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int marks;
        
        System.out.print("Enter the Marks: ");
        marks = scanner.nextInt();
        
        if((100 >= marks) && (90 <= marks)) {
            System.out.println("Grade A");
        } else if ((89 >= marks) && (80 <= marks)) {
            System.out.println("Grade B");
        } else if ((79 >= marks) && (70 <= marks)) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }
    }
    
}
