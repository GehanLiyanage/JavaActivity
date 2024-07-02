import java.util.Scanner;

public class pali {

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String obj = scanner.nextLine();
        boolean result = isPalindrome(obj);
        System.out.println(result); // Output: true
    }

}
