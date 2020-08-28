package Day9;

/**
 * Control flow with try / catch / finally
 *
 * case 1: if there is no exception
 * 1,2,3,5,6,NT
 *
 * case 2: if an exception occur at statement 2 and corresponding catch block present
 * 1,4,5,6, NT
 *
 * case 3: If an exception occur at statement 2 and corresponding catch block not present
 * 1,5 AT
 *
 *
 * case 4: If an exception occur at statement 6
 * 1,2,3,5, AT
 *
 * case 5: If an exception occur at statement 5
 * 1,2,3, AT
 *
 * case 6: If an excption occur at statement 1 and we dont have any corresponding catch
 * 5. AT
 * */

public class Demo12 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            System.out.println("Statement 2");
            System.out.println("Statement 3");
        }
        catch (NullPointerException e){
            System.out.println("Statement 4");
        }

        finally {
            System.out.println("Statement 5");
        }
        System.out.println("Statement 6");
    }

}
