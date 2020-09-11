package Day15;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Demo10 {
    public static void main(String[] args) {

        // this list can hold any type of value that mean
        // it is not type safe
        ArrayList list1 = new ArrayList();
        list1.add(10);
        list1.add("Hello");
        list1.add(true);

        // this list is type safe
        // if we try to save any value other then specific type
        // compile time error
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        //list2.add("");

        ArrayList list3 = new ArrayList();
        list3.add("Mark");
        list3.add(10);

        // type casting
        String name = (String)list1.get(0);



    }
}
