package Day16;

import java.util.HashMap;
import java.util.HashSet;

/**
 * HashSet
 * LinkedHashSet
 * HashTable
 *
 *
 *
 * HashSet
 *
 * it work on the hashing mechanish
 * Hashset contain unique value only
 * it allow to store null values
 * it is best suitable when we want to perform search opeartion
 * it does not maintain the insertion order like arraylist and linkedlist
 *
 * Hashset doesnt maintain the insertion order but here in the hashset
 * the elements are inserted on the bsic of their hashcode
 *
 *
 *
 *
 * **/


public class Demo9 {
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<>();
        list.add("Mark");
        list.add("Paul");
        list.add("Watson");
        list.add("Watson");

        //


        for(String s: list){
            System.out.println(s);
        }


    }
}
