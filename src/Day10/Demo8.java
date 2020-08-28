package Day10;

class Test3{
    public void display(){
        System.out.println("Display");
    }
}

public class Demo8 {
    public static void main(String[] args) {
        // NullPointerException
        // Runtime Ex -> Exception -> Throwable
        String str = "mark";
        System.out.println(str.length());

        String str2 = null;
        //System.out.println(str2.length());

        Test3 obj = new Test3();
        obj.display();

//        Test3 obj2;
//        obj2.display();
    }
}
