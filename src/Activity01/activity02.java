package Activity01;

import java.util.Scanner;

public class activity02 {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        for(int count = 0; count < 5; count++){
            System.out.print("Enter "+(count+1)+" Number : ");
            numbers[count] = scan.nextInt();
            sum = sum + numbers[count];
        }

        int max = numbers[0];
        int min = numbers[0];

        for(int count = 1; count < numbers.length; count++){

            if(numbers[count] > max){
                max = numbers[count];
            }

            if(numbers[count] < min){
                min = numbers[count];
            }
        }

        System.out.println("Maximum Value : " + max);
        System.out.println("Minimum Value : " + min);
    }
}
