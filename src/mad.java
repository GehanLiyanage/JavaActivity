import java.math.BigInteger;
import java.util.Scanner;

public class mad {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();

        BigInteger aBI = new BigInteger(a);
        BigInteger bBI = new BigInteger(b);

        System.out.println(aBI.add(bBI));
        System.out.println(aBI.multiply(bBI));

    }
}
