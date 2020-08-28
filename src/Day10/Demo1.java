package Day10;


/**
 * Exception is an event which occurs during the execution of a program that cause the application
 * or program to terminate inappropriately
 * we handle the exception using
 * 1. try - any risky
 * 2. catch - will have exception handling code
 * 3. finally - will execute no matter exception occurs or not, mostly it is use for clearn up purpose
 *
 *
 * Exception can be divided into 3 main categories
 * 1. Checked Exception
 * 2. Runtime Exception
 * 3. Error
 *
 *
 * throwable ->
 * 1. Error ->
 * 2. Exception -> RuntimeException
 *
 *
 * */

public class Demo1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 2;
        int c = 0;
        try{
            c = a/b;
        } catch (Exception e){
            System.out.println("catch");
        }
        finally{
            System.out.println("Finally");
        }

        System.out.println(c);

    }


}
