import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class read {

    public static void main(String[] args) {

        try {
            File playerDetails = new File("PlayerDetails.txt");
            Scanner read = new Scanner(playerDetails);
            while (read.hasNextLine()) {
                String details = read.nextLine();
                System.out.println(details);
            }
            read.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
