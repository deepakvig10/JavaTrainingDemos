package com.xebia;

import java.awt.*;
import java.util.Date;

public class Reference {

    public static void main(String[] args){

//        String str = "Varun";
//        String str2 = "Varun";
//        String str1 = new String("Varun");

        int x = 10;
        int y = x;
        x = 20;


        //System.out.println(y);


        Point point = new Point(10,20);
        Point p2 = point;
        point.x = 20;

        System.out.println(p2.x);

        Date currentDate = new Date();

        String str = "Varun";
        str = "Varun Gupta";

        System.out.println(str);



    }
}
