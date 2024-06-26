import java.util.Scanner;

public class Cal {

     public static void main(String [] args) {

         int i = 0;
         while (i < 100) {
             System.out.println("[1] Addition");
             System.out.println("[2] Subtraction");
             System.out.println("[3] Division");
             System.out.println("[4] Multiplication");

             Scanner z = new Scanner(System.in);
             System.out.print("Enter Operator : ");
             int op = z.nextInt();

             Scanner x = new Scanner(System.in);
             System.out.print("Enter First Number : ");
             double num1 = x.nextDouble();

             Scanner y = new Scanner(System.in);
             System.out.print("Enter Second Number : ");
             double num2 = y.nextDouble();

             switch (op) {
                 case 1:
                     double sum = num1 + num2;
                     System.out.println("Addition : " + sum);
                     break;

                 case 2:
                     double sum1 = num1 - num2;
                     System.out.println("Subtraction : " + sum1);
                     break;

                 case 3:
                     double sum2 = num1 / num2;
                     System.out.println("division : " + sum2);
                     break;

                 case 4:
                     double sum3 = num1 * num2;
                     System.out.println("Multiplication : " + sum3);
                     break;
             }

             double max = Math.max(num1, num2);
             System.out.println("Maximum: " + max);

             double min = Math.min(num1, num2);
             System.out.println("Maximum: " + min);

             i++;
         }

    }
}
