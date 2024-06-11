package Activity05;

import java.util.Scanner;

public class activity01 {

    public static int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    public static int min(int num1, int num2) {
        return (num1 < num2) ? num1 : num2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number One : ");
        int num1 = scan.nextInt();
        System.out.print("Enter Number two : ");
        int num2 = scan.nextInt();

        int max = max(num1, num2);
        int min = min(num1, num2);

        System.out.println("The largest value is: " + max);
        System.out.println("The smallest value is: " + min);
    }



}
