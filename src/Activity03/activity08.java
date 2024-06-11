package Activity03;

import java.util.Scanner;

public class activity08 {

    public static void main(String[] args) {

        //01 Question
        int a = 1;

        while (a <= 10) {
            System.out.println("number : " + a);
            a++;
        }

        System.out.println("\n");

        //02 Question
        int b = 10;

        while (b >= 1) {
            System.out.println("number : " + b);
            b--;
        }

        System.out.println("\n");

        //03 Question
        int c = 1;

        while (c <= 10) {
            System.out.println("number : " + c);
            c+=2;
        }

        System.out.println("\n");

        //04 Question
        int d = 1;

        while (d <= 100) {

            if (d%2 != 0) {
                System.out.println("number : " + d);
            }
            d++;
        }

        System.out.println("\n");

        //05 Question
        int e = 1;

        while (e <= 100) {

            if (e%2 == 0) {
                System.out.println("number : " + e);
            }
            e++;
        }

        System.out.println("\n");

        //06 Question
        int f = 1;

        while (f <= 100) {

            System.out.println("number : " + f*3);
            f++;
        }

        System.out.println("\n");

        //07 Question
        int g = 1;

        while (g <= 10) {

            System.out.println("number : " + g+g);
            g++;
        }

    }
}
