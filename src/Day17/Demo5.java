package Day17;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Demo5 {
    public static void main(String[] args) {
        Hashtable h1 = new Hashtable();
        h1.put(1, "A");
        h1.put(2, "A");
        h1.put(3, "C");

        Hashtable h2 = new Hashtable();

        h2 = (Hashtable) h1.clone();

        System.out.println(h1);
        System.out.println(h2);

        h1.clear();
        System.out.println(h1);
        System.out.println(h2);

        if(h2.containsValue("A")){
            System.out.println("value found");
        }else{
            System.out.println("value not found");
        }

        // print all the values from hashtable using Enumeration
        Enumeration e = h2.elements();
        System.out.println(".............");

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

       Set s = h2.entrySet()  ;
        System.out.println(s);

    }
}
