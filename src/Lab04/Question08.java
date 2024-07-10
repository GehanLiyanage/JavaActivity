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
public class Question08 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of hours worked in a week : ");
        int hours = scanner.nextInt();
        
        double hourlyRate = 50.0;
        double wages = 0.0;
        
        if (hours <= 30) {
            wages = hours * hourlyRate;
        } else if (hours <= 55) {
            wages = 30 * hourlyRate + (hours - 30) * hourlyRate * 1.5;
        } else {
            wages = 30 * hourlyRate + 25 * hourlyRate * 1.5 + (hours - 55) * hourlyRate * 2;
        }
        
        System.out.println("The weekly wages are: Rs." + wages);
        
        scanner.close();
            
                

    }
    
}
