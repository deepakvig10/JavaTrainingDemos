package Day15;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Mark");
        list1.add("Paul");
        list1.add("Watson");


        for (String name: list1){
            //System.out.println(name);
        }

        //System.out.println("*******");

        //list1.add(0, "Stacy");

        for (String name: list1){
            //System.out.println(name);
        }

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Stone");
        list2.add("Smith");
        list2.add("Spider");

        //list1.addAll(list2);
        list1.addAll(0, list2);

        for(String name: list1){
            System.out.println(name);
        }


    }

}
