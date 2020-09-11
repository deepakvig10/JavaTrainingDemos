package Day15;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * ArrayList
 * 1. variable length
 * 2. pre define methods are available to perform some task
 *
 * Add(element)
 * Add(index, element)
 *
 *
 * */

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Watson");
        names.add("Stacy");

        System.out.println(names);

        for(String name: names){
            System.out.println(name);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20);


        // this is list not type safe
        // it can save any type value as an object
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("name");
        list.add(true);
        list.add(10.10);

        for (Object obj: list){
            System.out.println(obj.toString());
        }



        System.out.println("Before Sorting...");
        for(Integer number: numbers){
            System.out.println(number);
        }

        Collections.sort(numbers);

        System.out.println("After Sorting...");
        for(Integer number: numbers){
            System.out.println(number);
        }


        System.out.println("Before Sorting...");
        for (String name: names){
            System.out.println(name);
        }

        Collections.sort(names);

        System.out.println("After Sorting...");
        for (String name: names){
            System.out.println(name);
        }




    }

}
