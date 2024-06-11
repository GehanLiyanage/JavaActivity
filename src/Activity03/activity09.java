package Activity03;

public class activity09 {

    public static void main(String[] args) {

        // 01 Question
        int total = 0;
        for (int i = 1; i<=10; i++) {
            total = total + i;
        }
        System.out.println("Addition of all the numbers : " + total);

        // 02 Question
        int mul = 1;
        for (int i = 1; i<=10; i++) {
            mul *= i;
        }
        System.out.println("Multiplication of all the numbers : " + mul);

        // 03 Question

        for (int i = 1; i<=50; i++) {
            if (i%2 != 0) {
                System.out.println("Number : " + i);
            }
        }

        System.out.println("\n");
        // 04 Question

        for (int i = 1; i<=50; i++) {
            if (i%2 == 0) {
                System.out.println("Number : " + i);
            }
        }

    }
}
