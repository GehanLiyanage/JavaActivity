package Activity06;

class Car2 {
    private String make;
    private String model;
    private int year;

    public Car2(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
public class activity03 {

    public static void main(String[] args) {

        Car2 obj = new Car2("Toyota", "Corolla", 2020);
        System.out.println("Make: " + obj.getMake() + ", Model: " + obj.getModel() + ", Year: " + obj.getYear());
        obj.setYear(2021);
        System.out.println("Updated Year: " + obj.getYear());
    }
}
