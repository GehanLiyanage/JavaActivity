package oop;

import java.util.Scanner;

public class vowel {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter letter : ");
        char letter = obj.next().toLowerCase().charAt(0);

        switch (letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The letter " + letter + " is a vowel.");
                break;
            default:
                if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                    System.out.println("The letter " + letter + " is a consonant.");
                }
        }
    }
}
