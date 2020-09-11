package Day15;

import java.util.ArrayList;

/**
 * add(element)
 * add(index, element)
 * addAll(collection)
 * addAll(index, collection)
 * remove(element)
 * remove(index)
 * isEmpty()
 *
 *
 *
 * **/


public class Demo6 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list.isEmpty());



        list.add("Mark");
        list.add("Paul");
        list.add("Watson");

        System.out.println(list.isEmpty());
    }
}
