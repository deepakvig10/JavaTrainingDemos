package Day17;

import java.util.Hashtable;
import java.util.Map;

/**
 * HashTable
 *
 * It is very much simlar to the hashMap but it is thread safe
 * It is Sychronized
 * hashtable contain unique elements
 * it does not allow null key and value
 *
 * // put()
 * // remove()
 * // putIfAbsent
 *
 *
 * */
public class Demo4 {
    public static void main(String[] args) {
        Hashtable<Integer, String> map1 = new Hashtable<>();
        map1.put(1, "Mark");
        map1.put(2, "Watson");
        map1.put(3, "Paul");

        for(Map.Entry m: map1.entrySet()){
            System.out.println(m.getKey() +" : "+ m.getValue() );
        }

    }

}
