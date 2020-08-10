package Day3;

import java.sql.SQLOutput;

public class loopsDemo {

    public static void main(String[] args){

        // without loop
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");

        // with loop
        for(int i=0; i<5; i=i+1){
            //System.out.println("Hello World from loop");
        }

        /*
        5 x 1 = 5
        5 x 2 = 10
        .
        .
        5 x 10 = 50
         */
        int count = 5;
        for(int i=1; i<=10;i++){
            System.out.println(count+" X "+ i + " = "+ count * i);
        }

        // 54321
        for(int i=5; i>=1; i--)
            System.out.print(i);

        // 2468
        // 13579
        for(int i=0; i<10; i=i+2)
            System.out.println(i);



    }
}
