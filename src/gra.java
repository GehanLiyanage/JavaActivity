public class gra {

    public static void main(String[] args) {



        try {

            int x = 10;
            int y = 0;
            int sum = x/y;

            System.out.println(sum);


        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Exception handled !!");
        }
    }
}
