package Activity06;

class Car1 {

    String make;
    String model;
    int year;

    Car1(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

}
public class activity02 {

    public static void main(String[] args) {

        Car1 obj = new Car1 ("TOYOTA", "SUPRA23G", 2008);
        System.out.println("Make: " + obj.make + ", Model: " + obj.model + ", Year: " + obj.year);
    }
}
