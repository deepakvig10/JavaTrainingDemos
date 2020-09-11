package Day15;

/**
 * Generics in Java
 *
 * Generics allows us to decouple the data type from the classes,
 * methods and variables
 *
 * It make ur code reusable or capabale to work with different
 * type of data
 *
 * we can use generics with
 * 1. Collections
 * 2. Classes
 * 3. Methods
 *
 *
 * Advantages of using generics
 * 1. Type Safe
 * 2. Type casting is not required
 * 3. Compile time check
 *
 * */


class Calculator{
    public void addNumbers(int num1, int num2){
        System.out.println(num1 + num2);
    }

//    public static <E> void add(E a, E b){
//
//    }

    public static <E> void displayArray(E[] elements){
        for (E element: elements){
            System.out.println(element);
        }
        System.out.println("-------");
    }

}

public class Demo9 {
    public static void main(String[] args) {
        Integer[] intArray = {10,20,30,40,50};
        Character[] charArray = {'A', 'B', 'C', 'D'};

        Calculator.displayArray(intArray);
        Calculator.displayArray(charArray);
    }

}
