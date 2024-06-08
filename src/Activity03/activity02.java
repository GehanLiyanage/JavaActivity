package Activity03;

import java.util.Scanner;

public class activity02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = scan.nextInt();

        if (num%2 == 0) {
            System.out.println("Even Number");
        } else
            System.out.println("Odd Number");

        scan.close();
    }
}
