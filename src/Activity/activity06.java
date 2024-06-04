package Activity;

import java.util.Scanner;

public class activity06 {

    public static float Fahrenheit(float celsius){
        float Fahrenheit =  (celsius * 9/5) + 32;
        return Fahrenheit;
    }
    public static float Celsius(float fahrenheit){
        float Celsius =  ((fahrenheit - 32) * 5)/9;
        return Celsius;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Fahrenheit or Celsius('F/C'): ");
        String choice = scan.nextLine();

        switch (choice){
            case "C":
                System.out.print("Enter Celsius Value : ");
                float celsius = scan.nextFloat();
                float results1 = Fahrenheit(celsius);
                System.out.print("Fahrenheit Value : " + results1);
                break;

            case "F":
                System.out.print("Enter Fahrenheit Value : ");
                float fahrenheit = scan.nextFloat();
                float results2 = Celsius(fahrenheit);
                System.out.print("Celsius Value : " + results2);
                break;

            default:
                System.out.print("Invalid Choice !!");
        }
    }
}
