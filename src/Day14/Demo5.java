package Day14;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * ArrayList
 *
 * 1. It is class mostly used for dynamic list
 * 2. It has a variable length unlike array where we have fixed length
 * 3. it can contain a duplicate value
 *
 *
 * Constructor
 * 1. ArrayList() - with 0 argument
 * 2. ArrayList(int capacity)    //
 * 3. ArrayList(Collection)
 *
 *
 * Methods
 * add() - it is used to add or insert element
 * addAll() - it is used to append all the element of other collection in the end
 *
 *
 * */


public class Demo5 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        // all item in the array list
        //System.out.println(list);


        // for-each
        for(String number: list){
            System.out.println(number);
        }


        // iterator

        // getting the iterator
        Iterator itr = list.iterator();

        // hasNext will check if the iterator has the element else it will return false
        while (itr.hasNext()){
            // print the element and move to the next
            System.out.println(itr.next());
        }

        // get and set for the arraylist

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Mark");
        list2.add("Paul");
        list2.add("Watson");
        list2.add("Stacy");

        // if we want to access specific element
        // we can pass the index number
        // 1 is the index number of the element
        System.out.println(list2.get(1));

        // set the or change the element
        list2.set(1, "Paul 2");
        System.out.println(list2.get(1));


        // sort the array list

        System.out.println("before sorting....");
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println("after sorting....");
        System.out.println(list2);

        // creating a int list

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(20);
        numbers2.add(10);
        numbers2.add(40);
        numbers2.add(30);

        System.out.println("before sorting...");
        for(Integer number: numbers2){
            System.out.println(number);
        }

        Collections.sort(numbers2);

        System.out.println("after sorting...");
        for(Integer number: numbers2){
            System.out.println(number);
        }






    }
}
