package Day9;

/**
 *
 * Every try either should have catch or finally
 *
 * Every catch should have try
 *
 * Every finally should have try
 *
 * */


public class Demo11 {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            System.out.println(10/0);
        }
       catch (Exception e){

       }
        finally {
            System.out.println("finally");
        }


    }


}
