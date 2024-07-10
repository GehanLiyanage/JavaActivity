import java.util.Scanner;

public class en {

    public static class vehicle {
        double Speed;


        double SetSpeed(double Speed, double SpeedLimit) {

            if (Speed <= SpeedLimit) {
                System.out.println("Danger : Speed Higher Than 80 Kmh");

            } else {
                System.out.println("Speed Good !!");
            }

            return 0;
        }

    }

    public static class car extends vehicle {
        String Model;
        String ModelNumber;

    }

    public static void main(String[] args) {

        double SpeedLimit = 80.00;
        vehicle v1 = new vehicle();
        car c1 = new car();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Model :");
        String getModel = scanner.nextLine();
        System.out.println("Enter ModelNumber :");
        String getModelNumber = scanner.nextLine();
        System.out.println("Enter Speed :");
        double getSpeed = scanner.nextDouble();

        getSpeed = v1.Speed;
        getModel = c1.Model;
        getModelNumber = c1.ModelNumber;

        v1.SetSpeed(getSpeed, SpeedLimit);
    }



}
