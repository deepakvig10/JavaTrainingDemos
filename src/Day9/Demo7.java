package Day9;

public class Demo7 {
    public static void main(String[] args) {
        try{
            System.out.println("first try");
            System.out.println(10/0);
        }catch(Exception e){
            System.out.println("first catch");
        }
        try{
            System.out.println("Second try");
        }catch (Exception e){
            System.out.println("second catch");
        }


    }
}
