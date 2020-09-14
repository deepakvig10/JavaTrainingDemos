package Day16;

import java.lang.reflect.Array;
import java.util.ArrayList;

class MyCustomList{

    public static void display(ArrayList<?> list){
        for(Object o: list){
            System.out.println(o);
        }
    }

}


public class Demo5 {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);

        MyCustomList.display(l1);

        ArrayList<Double> l2 = new ArrayList<>();
        l2.add(10.0);
        l2.add(20.0);

        MyCustomList.display(l2);

    }
}
