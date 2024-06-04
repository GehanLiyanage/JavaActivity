package oop;

public class pattern {

    public static void main(String[] args) {

        int x,y,z,q;

        for(x = 0; x<10; x++){
            for(y = 10; y>x; y--){
                System.out.print(" ");
            }
            for(z=1; z<x; z++){
                System.out.print("*");
            }
            for(q=0; q<x; q++){
                System.out.print("*");
            }
            System.out.println("\n");
        }



        for(x=0; x<6; x++){
            for(y=0; y<x; y++){
                System.out.print(x);
            }
            System.out.print("\n");
        }

        for(x=0; x<6; x++){
            for(y=1; y<x+1; y++){
                System.out.print(y);
            }
            System.out.print("\n");
        }

        for(x=0; x<6; x++){
            for(y=0; y<x; y++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(x=0; x<6; x++){
            for(y=6; y>x; y--){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
