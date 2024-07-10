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
public class Question09 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = scanner.nextLine();
        System.out.print("\n");
        System.out.println("String Length : " + str.length());
        System.out.println("String UpperCase : " + str.toUpperCase());
        System.out.println("String LowerCase : " + str.toLowerCase());
        System.out.print("\n");
        System.out.print("Enter Another String : ");
        String str1 = scanner.nextLine();
        System.out.print("\n");
        System.out.println("Combine String : " + str.concat(" " + str1));
        
    }
    
}
