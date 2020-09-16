package Day17;

import java.util.*;

/**
 *
 * Map Interface
 * It contain or allow us to store the data in key value pair
 *
 * Map<key, value>
 * Map<String, String> map = new Map<String, String>
 *
 * map.put("key", "value")
 * map.put("name", "mark")
 * map.put("address", "india")
 *
 * map.get("key")
 * map.get("name")  // mark
 * map.get("address")  // india
 *
 *
 *
 * Example:
 * 1. Map of Zip Code
 *  (110001, "CP")
 *
 * 2. map of employee and manager
 *
 * 3. error code (101, "fatal error")
 *
 * 4. configuration
 *
 * 5. env variable
 *
 * 6. rest api header
 * header("content-type": "")
 * header("access-token": "")
 * header("cookies": true)
 *
 *
 * methods
 * put()
 * putAll()
 * get(key)
 * containsKey(key)
 * remove(key)
 * keySet()
 * entrySet()
 *
 *
 *
 * */


/**
 * HashMap
 *
 *
 * HashMap has a default or initial capacity of 16
 * hasMap contain only unique keys
 * hashMap van have one null key and multiple null values
 * hashMap does not maintain order
 * hashMap not thread safe
 * HashMap is not synchronised
 *
 *
 *
 * */

class HeaderResponse{
    String header;
    String contentType;
    boolean cookies;
    String token;
}


public class Demo1 {

    public static void main(String[] args) {

        HeaderResponse headerResponse = new HeaderResponse();
        headerResponse.contentType = "";
        headerResponse.cookies = true;

        HashMap<String, HeaderResponse> header = new HashMap<>();
        header.put("header", headerResponse);


        // non generic hashmap
        Map map = new HashMap();
        map.put(1, "Mark");
        map.put(2, "Stacy");
        map.put(3, "Watson");
        map.put(3, "Stone"); // overwrite watson with stone
        map.put(4, "Mark");  // new entry
        map.put(5, null);
        map.put("", "");
        map.put(null, "");

        //System.out.println(map.get(200));

        HashMap<Integer, String> has1 = new HashMap<>();
        has1.put(1, "HTML");
        has1.put(2, "CSS");
        has1.put(3, "Java");
        has1.put(4, null);
        has1.put(null, "Php");

        //System.out.println(has1.get(1));

        for(Map.Entry m: has1.entrySet()){
            System.out.println(m.getKey() +" : "+ m.getValue());
        }

        // remove
        has1.remove(4);

        System.out.println();
        for(Map.Entry m: has1.entrySet()){
            System.out.println(m.getKey() +" : "+ m.getValue());
        }


    }




}
