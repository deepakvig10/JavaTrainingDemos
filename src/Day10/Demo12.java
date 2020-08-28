package Day10;

/**
 * multi catch block
 * we can have a common block for different type of exception
 *
 * */

public class Demo12 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        try{
            c = a /b;
        }
        catch (ArithmeticException e){

        }
        catch (NumberFormatException  | NullPointerException e){

        }

        catch (Exception e){

        }
        System.out.println(c);
    }
}
