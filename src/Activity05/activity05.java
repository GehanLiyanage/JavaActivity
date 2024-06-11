package Activity05;

import java.util.Scanner;

public class activity05 {

    public static int quotient(int num1, int num2){
        int quotient = num1 / num2;
        return quotient;
    }

    public static int remainder(int num1, int num2){
        int remainder = num1 % num2;
        return remainder;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number One : ");
        int num1 = scan.nextInt();
        System.out.print("Enter Number two : ");
        int num2 = scan.nextInt();

        int quotient = quotient(num1, num2);
        int remainder = remainder(num1, num2);

        System.out.println("Quotient : " + quotient);
        System.out.println("Remainder : " + remainder);
    }
}
