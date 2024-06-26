public class rec {

    public static void main(String[] args) {

        int x = 6;
        int sumOfSeries = sum(x);

        System.out.println("Sum of Series " + x + " is : " + sumOfSeries);

    }

    public static int sum(int a) {
        if (a>0) {
            return a + sum(a-1);
        } else
            return 0;
    }
}
