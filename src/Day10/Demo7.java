package Day10;

/**
 * Top 10 Exception
 * 1. NullPointerException
 * 2. ArrayIndexOutOfBoundException
 * 3. StackOverFlowException
 * 4. ClassCastException
 * 5. IllegalArgumentException
 * 6. NumberFormatException
 * 7. IllegalStateException
 * 8. NoClassDefFoundException
 * 9. ExceptionInIntialationException
 * 10. AssertException / AssertionException
 * 11. FileNotFoundException
 * 12. ArithmaticException
 *
 *
 *
 * **/

public class Demo7 {
    public static void main(String[] args) {

        //ArrayIndexOutOfBoundException
        // IndexOutOfBound -> RunTimeEx-> Exception -> Throwable
        int[] a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        try {
            System.out.println(a[-100]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }




    }


}
