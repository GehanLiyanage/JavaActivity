package Activity03;

import java.util.Scanner;

public class activity03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = scan.nextInt();

        if(num >= 60) {
            System.out.println("I like Ice Cream");
        } else if ((59 >= num) && (30 <= num)) {
            System.out.println("I like Chocolate");
        } else if ((29 >= num) && (20 <= num)) {
            System.out.println("I like Apple");
        } else
            System.out.println("I do not like anything");
    }
}
