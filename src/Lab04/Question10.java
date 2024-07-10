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
public class Question10 {
    
    public static double division(double num1, double num2){
        double division = num1 / num2;
        return division;
    }

    public static double addition(double num1, double num2){
        double addition = num1 + num2;
        return addition;
    }
    
    public static double multiplication(double num1, double num2){
        double multiplication = num1 * num2;
        return multiplication;
    }
    
    public static double substraction(double num1, double num2){
        double substraction = num1 - num2;
        return substraction;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number One : ");
        Double num1 = scan.nextDouble();
        System.out.print("Enter Number two : ");
        Double num2 = scan.nextDouble();
        System.out.print("Enter Number Operator(+,-,*,/) : ");
        char op = scan.next().charAt(0);
        
        switch (op) {
            
            case '+':
                double addition = addition(num1, num2);
                System.out.println("Addition : " + addition);
                break;
                
            case '-':
                double substraction = substraction(num1, num2);
                System.out.println("Substraction : " + substraction);
                break;
                
            case '*':
                double multiplication = multiplication(num1, num2);
                System.out.println("Multiplication : " + multiplication);
                break;
                
            case '/':
                double division = division(num1, num2);
                System.out.println("Division : " + division);
                break;
            
            default:
                System.out.println("Invalid Operator");
        }

        
        

        
        
    }
    
}
