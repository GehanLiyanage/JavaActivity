package inherit;

public class file4 implements file3{

    @Override
    public void drink() {
        System.out.println("drinking");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void run() {
        System.out.println("running");
    }

    public static void main(String[] args) {
        file3 x = new file4();
        System.out.println(file3.age);
        x.eat();
        x.drink();
        x.run();

    }
}
