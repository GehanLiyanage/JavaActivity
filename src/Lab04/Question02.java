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
public class Question02 {
    
    public static void main(String[] args) {
        
        int num1;
        int num2;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        num1 = scanner.nextInt();
        
        System.out.println("Enter Number : ");
        num2 = scanner.nextInt();
        
        if (num1 < num2) {
            System.out.println("Number 2 greater than Number 1");
        
        } else if (num1 > num2) {
            System.out.println("Number 2 less than Number 1");
            
        } else {
            System.out.println("numbers Equal");
        }
    }
    
}
