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
public class Question04 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = scanner.nextLine();
        
        System.out.print("Enter Specific : ");
        char spc = scanner.next().charAt(0);
        
   
        
       int sum = 0;
        
        for(int i=0; i <= str.length() - 1; i++) {
            char value = str.charAt(i);
            if (spc == value ) {
                
                sum++;
            }
        }
        
        System.out.println("Count of Specific Character : " + sum);
    }
    
}
