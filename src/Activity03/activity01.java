package Activity03;

import java.util.Scanner;

public class activity01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = scan.nextInt();

        if (num > 0) {
            System.out.println("Positive Number");
        } else if (num < 0) {
            System.out.println("Negative Number");
        } else
            System.out.println("Equal to Zero");

        scan.close();

    }
}
