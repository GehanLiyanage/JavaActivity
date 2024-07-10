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
public class Question07 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the Speed: ");
        int speed = scanner.nextInt();
        
        if (speed >= 100) {
            System.out.println("Price Rs.1000 ");
        } else if (91 <= speed && 100 > speed) {
            System.out.println("Price Rs.750 ");
        } else if (81 <= speed && 90 >= speed) {
            System.out.println("Price Rs.500 ");
        } else {
            System.out.println("No Cost");
        }
    }
    
}
