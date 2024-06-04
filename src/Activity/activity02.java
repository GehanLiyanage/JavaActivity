package Activity;

import java.util.Scanner;

public class activity02 {

    public static int check(int num){
        if(num == 0 ){
            System.out.print("Number is Equal to Zero");
        } else if (num < 0) {
            System.out.print("Number is Negative");
        }
        else {
            System.out.print("Number is Positive");
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number One : ");
        int num = scan.nextInt();

        check(num);
    }
}
