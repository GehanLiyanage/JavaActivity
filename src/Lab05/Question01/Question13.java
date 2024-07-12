/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab05.Question01;

/**
 *
 * @author gehan
 */
public class Question13 {
    
    public static void main(String[] args) {
        
        int i = 1;
        int total = 0;
        
        while (i<=30) {
            if (i%2==0) {
                total+=i;
            
            }
            i++;
        }
        
        System.out.println("Number : " + total);
    }
    
}
