package Day16;

import java.util.LinkedList;

/**
 * LinkedLIst
 * add(element)
 * add(index, element)
 * addAll(collection)
 * addAll(index, collection)
 *
 * addFirst(element)
 * addLast(element)
 *
 * getFirst()
 * getLast()
 *
 * indexOf()
 *
 *
 *
 * **/


public class Demo8 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Mark");
        list.add("Paul");
        list.add("Stacy");

        // adding element at specific index
        list.add(1, "Watson");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Mark");
        list2.add("Paul");
        list2.add("Stacy");

        list.addAll(list2);

        list.addFirst("First");
        list.addLast("last");



    }
}
