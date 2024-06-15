package Activity06;

class Car {

    String make;
    String model;
    int year;

}
public class activity01 {


    public static void main(String[] args) {

        Car obj = new Car();

        obj.make = "TOYOTA";
        obj.model = "SUPRA 23G";
        obj.year = 2008;

        System.out.println(obj.make);
        System.out.println(obj.model);
        System.out.println(obj.year);

    }
}
