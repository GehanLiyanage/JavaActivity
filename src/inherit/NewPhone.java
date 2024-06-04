package inherit;

public class NewPhone extends OldPhone{

    void BrowseInternet(){

    }

    void call(){
        System.out.println("From Home");
    }


    public static void main(String[] args) {
        NewPhone phone1 = new NewPhone();
        phone1.BrowseInternet();
        phone1.name = "Apple";
        phone1.call();
        phone1.message();

    }
}
