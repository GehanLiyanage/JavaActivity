package Activity06;

class ElectricCarIn extends carIn {

    int batteryCapacity;

    int displayBatteryCapacity(){
        System.out.println("Battery Capacity : " + batteryCapacity + "%");
        return 0;
    }

}
public class activity04  {

    public static void main(String[] args) {

        ElectricCarIn obj = new ElectricCarIn();

        obj.make = "TOYOTA";
        obj.model = "COROLLA";
        obj.year = 2021;
        obj.batteryCapacity = 85;

        System.out.println("Make : " + obj.make + "\n" + "Model : " + obj.model + "\n" + "Year : " + obj.year + "\n");
        System.out.println(obj.displayBatteryCapacity());
    }
}
