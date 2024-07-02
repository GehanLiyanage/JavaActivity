import java.util.Scanner;

public class rev {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        String obj = scanner.nextLine();

        StringBuilder reversed = new StringBuilder();

        for (int i = obj.length() - 1; i >= 0; i--) {
            reversed.append(obj.charAt(i));
        }

        System.out.println(obj);
        System.out.println(reversed.toString());


    }
}
