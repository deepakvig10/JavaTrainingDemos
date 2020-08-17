package Day5;

class Test{

    int a;
    String name = "";

    public Test(){
        System.out.println("Constructor is called");
       a = 10;

    }

    public void display(){
        System.out.println("Display method is called");
        System.out.println("x: "+ a);
    }

}

public class Demo2 {

    public static void main(String[] args){

        Test t = new Test();
        t.display();

        // con
        // display method is called

    }

}
