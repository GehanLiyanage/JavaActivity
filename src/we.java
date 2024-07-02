import java.util.Scanner;

public class we {
    public static void main(String[] args) {
        printTree(2);
    }

    public static void printTree(int n) {
        int maxWidth = 2 * n - 1;


        for (int i = 1; i <= n; i += 2) {
            printCenteredStars(i, maxWidth);
        }


        for (int i = 1; i <= n; i += 2) {
            printCenteredStars(i, maxWidth);
        }


        for (int i = 0; i < 2; i++) {
            printCenteredStars(2, maxWidth);
        }
    }


    private static void printCenteredStars(int numStars, int maxWidth) {
        int numSpaces = (maxWidth - (2 * numStars - 1)) / 2;
        for (int j = 0; j < numSpaces; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < numStars; j++) {
            System.out.print("*");
            if (j < numStars - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
