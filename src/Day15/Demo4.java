package Day15;

import java.util.ArrayList;

public class Demo4 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Paul");
        names.add("Watson");
        names.add("Mark");

        for (String name: names){
            System.out.println(name);
        }

        System.out.println("-------------");

        // removing specific element from the list
        names.remove("Watson");
        // remove the element from a specific position
        names.remove(1);

        for (String name: names){
            System.out.println(name);
        }
    }
}
