package com.xebia;

public class MathDemo {

    public static void main(String[] args){

        float marks = 99.4f;
        int result = Math.round(marks);
        System.out.println(Math.abs(-100));

        System.out.println(Math.floor(marks));


        int x = 10;
        int y = 20;
        int a = Math.max(x, y);
        //System.out.println(a);

        int otp =  (int)Math.round(Math.random() * 100);

        int otp2 = (int)(Math.random() * 100); // 0.0 to 1.0

        System.out.println(otp2);





        //System.out.println(result);

    }
}
