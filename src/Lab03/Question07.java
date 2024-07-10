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
public class Question07 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = scanner.nextLine();
        
        
        char NewStr;
        for (int i = str.length()-1; i > -1; i--) {
            NewStr = str.charAt(i);
            System.out.print(NewStr);
        }
        System.out.print("\n");
        
      
    }    
    
}
