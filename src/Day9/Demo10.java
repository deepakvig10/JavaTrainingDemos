package Day9;

/**
 * finally
 * System.exit(0)
 *
 *
 * finally vs System.exit(0)
 *
 * */

public class Demo10 {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            //System.out.println(10/0);
        }
        catch (Exception e){
            System.out.println("catch");
        }
        finally {
            System.out.println("finally");
        }
    }
}
