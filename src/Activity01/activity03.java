package Activity01;

import java.util.Scanner;

public class activity03 {

    public static void main(String[] args) {

        int[] marks = new int[10];
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        for(int count = 0; count < 10; count++){
            System.out.print("Enter "+(count+1)+" Student Marks : ");
            marks[count] = scan.nextInt();
            if(marks[count] >= 85){
                sum++;
            }

        }

        System.out.println("number of students Best Marks : " + sum);

    }
}
