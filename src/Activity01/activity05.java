package Activity01;

import java.util.Scanner;

public class activity05 {

    public static void main(String[] args) {


        float[] salary  = new float[10];
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i<10; i++){
            System.out.print("Enter " + (i+1) + " Employee Salary : ");
            salary[i] = scan.nextFloat();
            scan.nextLine();

            if((35000 < salary[i]) && (75000 > salary[i] )){
                sum++;

            }
        }

        System.out.print("count the number of employees : " + sum);
    }
}
