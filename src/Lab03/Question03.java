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
public class Question03 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = scanner.nextLine();
        
        System.out.print("Enter Specific : ");
        String spc = scanner.nextLine();
        System.out.println("Start specific : " + str.toLowerCase().startsWith(spc.toLowerCase()));
        
        
        

    }
    
}
