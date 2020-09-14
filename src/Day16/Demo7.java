package Day16;

import java.util.LinkedList;

/**
 * Linked List
 *
 * It is class used to store elements
 * It can contain duplicate value
 * It maintain insertion order
 * Data manipulation is fast as compare to array list
 *
 * Iterable ----> Collection ---> List ---> AbstractSequntialList -> LinkedList
 *
 * It can add or remove element from both side
 *
 *
 * ArrayList VS Linked List
 * 1. ArrayList is kind of dynamic array and Linked list is internally uses doubly linked list
 * 2. Manipulation is slow and it is faster in the case of linked list
 * 3. arraylist is better when you want to perform sorting and linked is better when you want to perform
 *    data manipulation
 *
 *
 *
 * **/


public class Demo7 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Mark");
        list.add("Paul");
        list.add("Stacy");

        for(String name: list){
            System.out.println(name);
        }



    }
}
