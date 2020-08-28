package Day9;

import java.sql.SQLOutput;

/**
 * Control flow of try and catch
 *
 * case 1: if there is no exception
 * 1,2,3,5 Normal termination
 *
 * case 2: if an exception occur at statement 2 and corresponding catch block
 * is present
 * 1,4,5, NT
 *
 * case 3: If an exception occur at statement 2 and corresponding catch block
 * is not present
 * 1,AT
 *
**/

public class Demo6 {
    public static void main(String[] args) {
        try{
            System.out.println("Statement 1");
            System.out.println("Statement 2");
            System.out.println("Statement 3");
        }
        catch (ArithmeticException e){
            System.out.println("Statement 4");
        }
        System.out.println("Statement 5");



    }
}
