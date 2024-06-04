package inherit;

public class overmapping {
    int rupees;
    overmapping(){

    }

    overmapping(int x){
        rupees = x;
    }

    overmapping(int x, int y){
        rupees = x + y;
    }

    public static void main(String[] args) {
        overmapping obj = new overmapping();
        overmapping obj1 = new overmapping(20);
        overmapping obj2 = new overmapping(20,30);

        System.out.println(obj1.rupees);
        System.out.println(obj2.rupees);
    }
}
