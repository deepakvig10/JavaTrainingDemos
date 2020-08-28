package Day10;

public class Demo9 {

    public static void main(String[] args) {
        try{
            test1();
        }catch (StackOverflowError e){

        }

    }

    public static void test1(){

        test2();
    }

    public static void test2(){
        test1();
    }

}
