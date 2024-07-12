import java.io.File;
import java.io.IOException;

public class create {

    public static void main(String[] args) {


        try {
            File PlayerDetails = new File("PlayerDetails.txt");
            if (PlayerDetails.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File Already Exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
