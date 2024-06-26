import java.util.Scanner;

public class FirstFile {

    public static void main(String [] args) {

        int count = 0;
        while(count < 100) {
            Scanner x = new Scanner(System.in);

            System.out.print("Enter Your Marks : ");
            int mark = x.nextInt();
            System.out.println("Your Marks is : " + mark);

            if ((100 >= mark) && (mark >= 75)) {
                System.out.println("Your Grade A");
            } else if ((75 >= mark) && (mark >= 65)) {
                System.out.println("Your Grade B");
            } else if ((65 >= mark) && (mark >= 55)) {
                System.out.println("Your Grade C");
            } else if ((55 >= mark) && (mark >= 45)) {
                System.out.println("Your Grade S");
            }

            count++;
        }

    }
}
