import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

        public void createFile() {

            File file = new File("MyDetails.txt");

            try {
                if (file.createNewFile()) {
                    System.out.println("File Created");
                } else {
                    System.out.println("File Already Created");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



        public void writeFile() {


            String data = "Name : Gehan || Age : 21 || City : Colombo";
            String data1 = "Name : Heshara || Age : 18 || City : Colombo";

            try {
                FileWriter writer = new FileWriter("MyDetails.txt");
                writer.write(data + "\n");
                writer.write(data1);
                System.out.println("Data Written !!");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



        public void readFile() {

            try {
                File reader = new File("MyDetails.txt");
                Scanner scanner = new Scanner(reader);
                while (scanner.hasNextLine()) {
                    String data = scanner.nextLine();
                    System.out.println(data);
                }
                scanner.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    public static void main(String[] args) {

        FileHandling fileHandling = new FileHandling();

        fileHandling.createFile();
        fileHandling.writeFile();
        fileHandling.readFile();

    }
}
