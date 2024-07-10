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
public class Question06 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string to split:");
        String inputString = scanner.nextLine();

        
        System.out.print("Enter the delimiter:");
        String delimiter = scanner.nextLine();

        
        String[] substrings = inputString.split(delimiter);

        
        System.out.println("The string split by the delimiter is:");
        for (String substring : substrings) {
            System.out.println(substring);
        }

        
        scanner.close();
    }
}
