/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab05.Question05;

/**
 *
 * @author gehan
 */
public class Question06 {
    
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j <= i) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    
}
