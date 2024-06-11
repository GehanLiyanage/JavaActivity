package Activity03;

public class activity10 {

    public static void main(String[] args) {

        // 01 Question

        for (int i = 1; i<=5; i++) {
            for (int x = 1; x<=i; x++) {
                System.out.print(i);
            }
            System.out.println("\n");
        }

        // 02 Question
        System.out.println("\n");

        for (int i = 1; i<=5; i++) {
            for (int x = 1; x<=i; x++) {
                System.out.print(x);
            }
            System.out.println("\n");
        }

        // 03 Question
        System.out.println("\n");

        for (int i = 1; i<=5; i++) {
            for (int x = 1; x<=i; x++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }

        // 04 Question
        System.out.println("\n");

        for (int i = 1; i<=5; i++) {
            for (int x = 5; x>=i; x--) {
                System.out.print("*");
            }
            System.out.println("\n");
        }

        // 04 Question
        System.out.println("\n");

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }


            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }


            System.out.println();
        }


    }
}
