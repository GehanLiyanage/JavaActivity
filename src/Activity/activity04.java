package Activity;

import java.util.Scanner;

public class activity04 {
    public static double diameter(double radius){
        double total = radius * 2;
        return total;
    }

    public static double Circumference(double radius){
        double total = 2 * 3.14 * radius;
        return total;
    }

    public static double Area(double radius){
        double total = 3.14 * radius * radius;
        return total;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number One : ");
        double num = scan.nextDouble();

        double diameter = diameter(num);
        double Circumference = Circumference(num);
        double Area = Area(num);

        System.out.println("Circle diameter : " + diameter);
        System.out.println("Circle Circumference : " + Circumference);
        System.out.println("Circle Area : " + Area);
    }
}
