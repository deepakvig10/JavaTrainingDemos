package Day4;

public class Demo1 {

    /*
    * function without return value and without parameters
    * function without return value and with parameters
    * function with return value and with parameters
    * function with return value and without parameters
    *
    * static function can be called by static members
    * static function can be called by class name
    * static function cannot be accessed by class object
    *
    * */

    public static void test(){
        System.out.println("Hello Guest");
    }

    public static void test2(String name){
        System.out.println("Hello "+ name);

    }

    public static String test3(String name){
        return "Hello "+ name;
    }

    public static String test4(){
        return "Hello Guest";
    }

    public static void main(String[] args){
        //Demo1 d = new Demo1();
        test();
        test2("Mark");
        String r1 = test3("Mark");
        System.out.println(r1);
        String r2 = test4();
        System.out.println(r2);


    }

}
