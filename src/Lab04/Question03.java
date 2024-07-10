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
public class Question03 {
    
    public static void main(String[] args) {
        
        int num1;
        int num2;
        int num3;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Number : ");
        num1 = scanner.nextInt();
        
        System.out.print("Enter Number : ");
        num2 = scanner.nextInt();
        
        System.out.print("Enter Number : ");
        num3 = scanner.nextInt();
        
        if (num1 < num2 && num3 < num2) {
            System.out.println("greater Number is " + num2);
        
        } else if (num2 < num1 && num2 < num1) {
            System.out.println("greater Number is " + num1);
            
        } else {
            System.out.println("greater Number is " + num3);
        }
    }
    
}
