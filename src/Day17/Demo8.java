package Day17;

import java.util.TreeSet;

public class Demo8 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(109);
        set.add(44);
        set.add(98);
        set.add(56);

        for(Integer n: set){
            System.out.println(n);
        }

        System.out.println("Top value:"+ set.pollFirst());
        System.out.println("Bottom value:"+ set.pollLast());
    }
}
