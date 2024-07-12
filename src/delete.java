import java.io.File;

public class delete {

    public static void main(String[] args) {

        File playerDetails = new File("PlayerDetails.txt");

        if (playerDetails.delete()) {
            System.out.println("Deleted file : " + playerDetails.getName());
        } else {
            System.out.println("Fail to delet file or Already deleted");
        }
    }
}
