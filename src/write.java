import java.io.FileWriter;
import java.io.IOException;

public class write {

    public static void main(String[] args) {

        try {
            FileWriter writeDetails = new FileWriter("PlayerDetails.txt");
            String details = "Name : Gehan || Age : 21 || Sport : FootBall";
            writeDetails.write(details);
            writeDetails.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


