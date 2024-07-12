/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab05.Question02;

/**
 *
 * @author gehan
 */
public class Question05 {
    
    public static void main(String[] args) {
    
    int a1 = 2;
    int a2 = 3;

    System.out.println(a1);
    System.out.println(a2);

    int next = a1 + a2 + 1;
    
    do {
        System.out.println(next);
        a1 = a2;
        a2 = next;
        next = a1 + a2 + 1;
    } while (next <= 33);
}

    
}
