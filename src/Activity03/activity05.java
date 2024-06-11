package Activity03;

import java.util.Scanner;

public class activity05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Letter : ");
        char letter = scan.next().charAt(0);

        switch (letter) {
            case 'A', 'a', 'U', 'u', 'E', 'e', 'I', 'i', 'O', 'o':
                System.out.println("It a Vowels");
                break;

            default:
                System.out.println("It a Constant");
                break;
        }
    }
}
