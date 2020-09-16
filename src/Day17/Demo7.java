package Day17;

import java.util.*;

/**
 *
 * Iterable -> Collection -> Set -> SortedSet---> NavigableSet ---> TreeSet
 *
 * TreeSet class similar to the HashSet it contain unique value
 * TreeSet allow to access and retrive data quite fast
 * TreeSet maintains acsending order
 *
 *
 * **/


public class Demo7 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Mark");
        treeSet.add("Watson");
        treeSet.add("Paul");

        for(String s: treeSet){
            //System.out.println(s);
        }

        //Iterator<String> itr = treeSet.iterator();
        Iterator<String> itr = treeSet.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }




    }
}
