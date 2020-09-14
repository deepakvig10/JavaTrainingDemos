package Day16;

import java.util.Hashtable;
import java.util.Map;

/**
 *
 * HashTable
 * it store the data in key value pair or it maps keys to value
 * It inherits from Dictionary class and implemented the map interface
 *
 * HashTable doesnot allow null key and value
 * HashTable class contain unique values
 *
 * K - key
 * V - value
 *
 * user
 * email - 'm@gmail.com'
 * email - key
 * 'm@gmail.com' - value
 *
 * **/


public class Demo11 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(1, "Mark");
        hashtable.put(2, "Paul");
        hashtable.put(3,"Watson");

        //System.out.println(hashtable.get());
        //System.out.println(hashtable);

        for(Map.Entry map: hashtable.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }


    }
}
