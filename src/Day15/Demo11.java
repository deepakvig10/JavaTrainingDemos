package Day15;


/**
 *
 *
 * Type parameters
 * 1. T - Type
 * 2. E - element
 * 3. K - Key
 * 4. N - Number
 * 5. V - Value
 *
 * Generic class
 *
 */

class MyCustomClass<T>{
    T num1;
    String name;

    void add(T num2){
        this.num1 = num2;
    }

    T get(){
        return num1;
    }
}


public class Demo11 {
    public static void main(String[] args) {
        MyCustomClass<Integer> obj = new MyCustomClass<Integer>();
        obj.add(10);

        MyCustomClass<String> obj2 = new MyCustomClass<>();
        obj2.add("hello");
    }
}
