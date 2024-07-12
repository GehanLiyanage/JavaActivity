/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab05.Question02;

/**
 *
 * @author gehan
 */
public class Question14 {
    
    public static void main(String[] args) {
    
    int i = 1;
    int total = 1;
    
    do {
        if (i % 2 != 0) {
            total *= i;
        }
        i++;
    } while (i <= 15);
    
    System.out.println("Number : " + total);
}

    
}
