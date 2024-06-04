package Activity;

import java.util.Scanner;

public class activity07 {

    public static double addition(double num1, double num2){
        double total = num1 + num2;
        return total;
    }

    public static double subtraction(double num1, double num2){
        double total = num1 - num2;
        return total;
    }

    public static double multiplication(double num1, double num2){
        double total = num1 * num2;
        return total;
    }

    public static double division(double num1, double num2){
        double total = num1 / num2;
        return total;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("[1] Addition");
        System.out.println("[2] Subtraction");
        System.out.println("[3] Multiplication");
        System.out.println("[4] Division");
        System.out.print("\nEnter Choice Number: ");
        int choice = scan.nextInt();

        System.out.print("Enter  Number One: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter Number Two: ");
        double num2 = scan.nextDouble();

        switch (choice){
            case 1:
                double total1 = addition(num1, num2);
                System.out.print("Addition Value : " + total1);
                break;

            case 2:
                double total2 = subtraction(num1, num2);
                System.out.print("Subtraction Value : " + total2);
                break;

            case 3:
                double total3 = multiplication(num1, num2);
                System.out.print("Multiplication Value : " + total3);
                break;

            case 4:
                double total4 = division(num1, num2);
                System.out.print("Division Value : " + total4);
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
