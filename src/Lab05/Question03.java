/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab05;

import java.util.Scanner;

/**
 *
 * @author gehan
 */
public class Question03 {
    
    public static void main(String[] args) {
        System.out.print("Enter N Value : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int i=1; 
        double sum = 0.0;
        
        while (i<=n) {
            sum = sum + (1.0/(i*i));
            i++;
        }
        System.out.println("Value : " + sum);
    }
    
  
    
}
