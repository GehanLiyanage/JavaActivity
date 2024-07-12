/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab05.Question05;

/**
 *
 * @author gehan
 */
public class Question05 {
    
    public static void main(String[] args) {
        
        int x,y;
        
        for (x = 1; x <= 6; x++) {
            for(y = 6; y > x; y--){
                System.out.print(x+ " ");
            }
            System.out.println();
        }
    }
    
}
