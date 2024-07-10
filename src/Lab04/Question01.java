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
public class Question01 {
    
    public static void main(String[] args) {
        
        double num1;
        double num2;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        num1 = scanner.nextDouble();
        
        System.out.println("Enter Number : ");
        num2 = scanner.nextDouble();
        
        if (num1%num2 == 0) {
            System.out.println("Divisible");
        
        } else {
            System.out.println("Not Divisible");
        }
        
    }
    
}
