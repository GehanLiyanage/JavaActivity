package Activity03;

import java.util.Scanner;

public class activity07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter GPA : ");
        float num = scan.nextFloat();

        if(num >= 3.7) {
            System.out.println("First Class");
        } else if ((3.6 >= num) && (3.3 <= num)) {
            System.out.println("Second Upper");
        } else if ((3.2 >= num) && (3.0 <= num)) {
            System.out.println("Second Lower");
        } else
            System.out.println("General");
    }
}
