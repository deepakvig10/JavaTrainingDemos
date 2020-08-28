package Day10;


/**
 * case 1: when we create an object of the exception class seprately
 *
 * **/

class Test2{

}

public class Demo4 {

//    // case 1
//    static ArithmeticException e = new ArithmeticException();
//    public static void main(String[] args){
//        throw  e;
//    }

    // Run time exception: NullPointer Exception
//    static ArithmeticException e;
//    public static void main(String[] args) {
//        throw e;
//    }

    // case 2
//    ArithmeticException ae = new ArithmeticException();
//    public void test(){
//        throw ae;
//    }
//
//    public static void main(String[] args) {
//        Demo4 obj = new Demo4();
//        obj.test();
//    }

    // case 3
    // runtime exception
    // compile time error as if we explicity throw the object of the exception class the next statement become unreachable
//    public static void main(String[] args) {
//        //System.out.println(10/0);
//        throw new ArithmeticException();
//        //System.out.println("We got a exception");
//    }


    // case 4
    // we cannot throw every class it has be throwable to should extend from any exception class
    public static void main(String[] args) {
        //throw new Test2();
    }





}
