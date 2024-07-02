import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("How Many Student : ");
        int y = scanner.nextInt();

        int[] studentMarks = new int[y];
        int sum = 0;

        for (int x = 0; x < y; x++){
            System.out.print("Enter " + (x+1) + " Student Mark : ");
            studentMarks[x] = scanner.nextInt();
            sum = sum + studentMarks[x];
        }


        for (int x = 0; x < y; x++) {
            System.out.println("Student " + (x+1) + " Marks : " + studentMarks[x]);
        }
        System.out.println("\n" + "Total marks : " + sum);
    }
}
