package Activity05;

import java.util.Scanner;

public class activity03 {

    public static int evenOdd(int num){
        if( num%2 == 0){
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = scan.nextInt();

        evenOdd(num);

    }
}
