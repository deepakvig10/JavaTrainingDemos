package Day9;

public class Demo5 {

    public static void main(String[] args) {
        try{

            System.out.println("Statement 1");
            System.out.println("Statement 2");
            System.out.println(10/0);
            System.out.println("Statement 3");
            System.out.println("Statement 4");
            System.out.println("Statement 5");
            System.out.println("Statement 6");
            System.out.println("Statement 7");

        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            //System.out.println("Catch Block");
        }


//        catch (ArithmeticException e){
//            System.out.println("Catch Block");
//        }
//
//        catch (NullPointerException e){
//            System.out.println("Catch Block");
//        }





    }



}
