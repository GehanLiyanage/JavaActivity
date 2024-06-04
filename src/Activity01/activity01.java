package Activity01;

import java.util.Scanner;

public class activity01 {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        for(int count = 0; count < 5; count++){
            System.out.print("Enter "+(count+1)+" Number : ");
            numbers[count] = scan.nextInt();
            sum = sum + numbers[count];
        }

        double average = sum/5;

        System.out.println("Sum of the Numbers : " + sum);
        System.out.println("Average of the Numbers : " + average);
    }
}
