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
public class Question06 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the Cost Price: ");
        double cp = scanner.nextDouble();

        System.out.print("Enter the Selling Price: ");
        double sp = scanner.nextDouble();
        
        
        if (cp < sp) {
            System.out.println("Profit : " + (sp-cp));
        } else if (cp > sp) {
            System.out.println("Loss : " + (sp-cp));
        } else {
            System.out.println("No Profit of Loss");
        }   
    }    
    
}
