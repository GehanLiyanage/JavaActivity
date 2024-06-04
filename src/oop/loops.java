package oop;

public class loops {

    public static void main(String[] args) {


        int x;
        int total = 0;

        for(x=1; x<=10; x++){
            total = total + x;

        }
        System.out.println(total);

        int y;
        int mul = 1;

        for(y=1; y<=10; y++){
            mul = mul * y;

        }
        System.out.println(mul);

        int z;

        for(z=1; z<=50; z++){
            if(z%2 == 0){
                System.out.print(z+",");
            }

        }
        System.out.print("\n");

        int q;

        for(q=1; q<=50; q++){
            if(q%2 != 0){
                System.out.print(q+",");
            }

        }
        System.out.print("\n");

        int a = 1;
        while(a<=10){
            System.out.print(a+",");
            a=a+1;
        }

        System.out.print("\n");

        int b = 10;
        while(b>=1){
            System.out.print(b+",");
            b=b-1;
        }

        System.out.print("\n");

        int c = 0;
        while(c<=10){
            if(c%2 != 0) {
                System.out.print(c + ",");
            }
            c=c+1;
        }

        System.out.print("\n");

        int d = 1;
        while(d<=100){
            if(d%2 == 0) {
                System.out.print(d + ",");
            }
            d=d+1;
        }

        System.out.print("\n");

        int f = 1;
        while(f<=100){
            if(f%2 != 0) {
                System.out.print(f + ",");
            }
            f=f+1;
        }

        System.out.print("\n");

        int g = 1;
        while(g<=100){
            if(g%3 == 0) {
                System.out.print(g + ",");
            }
            g=g+1;
        }

        System.out.print("\n");

        int h = 1;
        int total2 = 0;
        while(h<=10){
            total2=total2+h;
            h=h+1;
        }
        System.out.print(total2);


    }
}
