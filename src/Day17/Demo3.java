package Day17;

import java.util.HashMap;
import java.util.Map;

public class Demo3 {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "snskjdbwdwb");
        map1.put(2, "B");
        map1.put(3, "C");
//        map1.put(3, "D");
//        map1.put(4, "D");
//        map1.put(null, null);

        for(Map.Entry m: map1.entrySet()){
            //System.out.println(m.getKey()+" : "+m.getValue());
        }

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(3, "E");
        map2.put(6, "F");
        map2.put(7, "G");

        //map1.putAll(map2);

        for(Map.Entry m: map1.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());
        }

        HashMap<String, String> map3 = new HashMap<>();
        map3.put("A", "A");
        map3.put("B", "B");
        map3.put("C", "C");

        //map1.putAll(map3);

        // putIfAbsent

        HashMap<Integer, String> map4 = new HashMap<>();
        map4.put(1, "Mark");
        map4.put(2, "Stacy");
        map4.put(3, "Paul");

        for (Map.Entry m : map4.entrySet()){
            System.out.println(m.getKey() +" : "+m.getValue());
        }

        map4.putIfAbsent(3, "Watson");
        System.out.println();

        for (Map.Entry m : map4.entrySet()){
            System.out.println(m.getKey() +" : "+m.getValue());
        }


        // conditionally if we want to add element
        //map4.putIfAbsent(3, "Mark");

        // remove
        //map4.remove(2);
        //map4.remove(2, "Mark");

        // replace
        //map4.replace(2, "Mark", "mark2");

        for(Map.Entry m : map4.entrySet()){
            System.out.println(m.getKey() +" : "+ m.getValue() );
        }

        // replace all
        map4.replaceAll((K, V) -> "New Name");
        for(Map.Entry m : map4.entrySet()){
            System.out.println(m.getKey() +" : "+ m.getValue() );
        }






    }
}
