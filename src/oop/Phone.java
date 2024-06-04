package oop;

public class Phone{
    String name;
    String color;
    String weight;

    void call(){
        System.out.println("Take a call from " + name);
    }

    public static void main(String[]args){
        Phone phone1 = new Phone();
        phone1.name = "Apple";
        phone1.call();
    }

}



