import java.util.Scanner;

public class greeting {

    String name;
    public void greeting1(){
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        while(true) {
            greeting greet = new greeting();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Mobile Brand : ");
            greet.name = scanner.nextLine();
            greet.greeting1();
        }
    }
}
