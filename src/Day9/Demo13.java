package Day9;

/**
 * Nesting of try / catch / finally
 *
 * we can do nesting of try catch and finally
 * every try can have it own catch and finally block
 * first preference is given to the catch block of that try block where exception
 * occur if he is inefficient to handle exception then out catch will get the
 * oppurtunity to handle the exception else the application terminate AT
 *
 * */

public class Demo13 {
    public static void main(String[] args) {
        try{
            System.out.println("Outer try");

            try{
                System.out.println("Inner try");
                System.out.println(10/0);
            }
            catch (NullPointerException e){
                System.out.println("Inner catch");
            }
            finally {
                System.out.println("Inner finally");
            }

        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Outer Catch");
        }
        finally {
            System.out.println("Outer finally");
        }


    }


}
