/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab03;

import java.util.Scanner;

/**
 *
 * @author gehan
 */
public class Question10 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Numeric String : ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter Second Numeric String : ");
        String str2 = scanner.nextLine();
        
        System.out.println("Value : " + str1.concat(str2));
        
        try {
            Integer num1 = Integer.valueOf(str1);
            Integer num2 = Integer.valueOf(str2);
            
            System.out.println("Value : " + (num1 + num2));
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input(Only Valid Numeric String)");
        }
        
        
    }
    
}
