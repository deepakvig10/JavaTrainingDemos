package Day16;

import java.util.ArrayList;

/**
 * Generics in Java
 * 1. Type safe
 * 2. Type casting not required
 * 3. compile time check
 *
 * **/


public class Demo1 {
    public static void main(String[] args) {

        // Type  un-safe
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("Mark");
        list.add(true);
        list.add(10.0);

        // type safe
        ArrayList<String> list2 = new ArrayList();
        list2.add("Mark");
        //list2.add(10);  // compile time error

        // unnecessary type casting
        ArrayList list3 = new ArrayList();
        list3.add("mark");
        list3.add("paul");

        //String name = list3.get(0); // type casting
        String name = (String)list3.get(0);

    }
}
