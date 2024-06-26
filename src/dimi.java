public class dimi {

    public static void main(String[] args) {

        int a[][] = {{0,1,3}, {4,5,6}, {9,7,3}};

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print("\t" + a[i][j]);
            }
            System.out.println("\n");
        }
    }
}
