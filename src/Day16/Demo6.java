package Day16;


import java.util.ArrayList;

class Calculator{

    public static double add(ArrayList<? extends Number> list){
        double result = 0.0;

        for(Number number : list){
            result = result + number.doubleValue();
        }
        return result;
    }

}

public class Demo6 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        System.out.println("Integer ="+ Calculator.add(list1));

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(12.34);
        list2.add(56.78);

        System.out.println("Double = "+ Calculator.add(list2));


        ArrayList<String> list3 = new ArrayList<>();
        list3.add("A");
        list3.add("B");

        //Calculator.add(list3);
    }
}
