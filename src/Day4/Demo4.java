package Day4;

public class Demo4 {

    /*
    * Method overloading
    * 1. we can have different type of parameter
    * 2. we can have different numbers of parameter
    * 3. we can have different order of parameter
    * 4. we can have different return value - invalid
    *
    * */


    public static void add(double a, int b){
        System.out.println("Fifth Method");
        System.out.println(a + b);
    }

    public static void add(int a, double b){
        System.out.println("Fourth Method");
        System.out.println(a + b);
    }

    public static void add(int a, int b){
        System.out.println("First Method");
        System.out.println(a + b);
    }

    public static void add(double a, double b){
        System.out.println("Second Method");
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c){
        System.out.println("Third Method");
        System.out.println(a + b + c);
    }


    public static void main(String[] args){

        add(10, 11.11);
        add(11.11, 10);



    }
}
