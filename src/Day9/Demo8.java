package Day9;

/**
 * print exception class information
 * like
 * name
 * message
 * stacktrace
 *
 *
 * */
public class Demo8 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch (Exception e){
            System.out.println(e.toString());
            //System.out.println(e.getMessage());
            //e.printStackTrace();

        }


    }
}
