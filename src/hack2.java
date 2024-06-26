import java.util.Scanner;

public class hack2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            if (scan.hasNextInt()) {
                    a[i] = scan.nextInt();
            }
        }



        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }



    }
}
