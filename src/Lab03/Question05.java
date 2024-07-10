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
public class Question05 {
    
    public static void main(String[] args) {
        
        char specific = 'a';
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = scanner.nextLine();
        
        System.out.print("Enter target Specific : ");
        char oldchar = scanner.next().charAt(0);
        
        System.out.print("Enter replace Specific : ");
        char newchar = scanner.next().charAt(0);
        
        String replace = str.replace(oldchar, newchar);
        System.out.println(replace);
        
        /*for(int i=0; i <= str.length() - 1; i++) {
            String value = str.replaceAll(str, spc);
            
        }*/
    }
    
}
