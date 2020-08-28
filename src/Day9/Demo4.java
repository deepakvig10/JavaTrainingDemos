package Day9;

public class Demo4 {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int c;
        try{
            c = a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Invalid number");
        }
        catch (NullPointerException e){

        }
        catch (Exception e){

        }



    }
}
