import java.util.Vector;

public class vet {

    public static void main(String[] args) {


        Vector<Integer> vec = new Vector <Integer>();
        for(int i = 0; i<10; i++){
            vec.add(i);
        }
        System.out.println(vec);
        System.out.println(vec.get(2));
        System.out.println(vec.elementAt(2));
        vec.addElement(50);
        vec.insertElementAt(100, 3);
        vec.removeElement(7);
        vec.removeElementAt(1);
        System.out.println(vec);
    }
}
