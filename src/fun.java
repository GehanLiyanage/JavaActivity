import java.util.Scanner;

public class fun {

    public static double add(double num1, double  num2) {
        double ans = num1 + num2;
        return ans;
    }
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number one : ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter Number Two : ");
        double num2 = scanner.nextDouble();

        System.out.println("Answer : " + add(num1, num2));
    }
}
