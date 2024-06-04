package Activity01;

import java.util.Scanner;

public class activity04 {

    public static void main(String[] args) {

        String[] fruits = new String[4];
        float[] price  = new float[4];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i<4; i++){
            System.out.print("Enter " + (i+1) + " Fruit : ");
            fruits[i] = scan.nextLine();
            System.out.print("Enter " + (i+1) + " Price : ");
            price[i] = scan.nextFloat();
            scan.nextLine();
        }

        for(int i= 0; i<4; i++){
            System.out.println((i+1) + " Fruit : " + fruits[i] + " Unit Price : " + price[i]);
        }
    }
}
