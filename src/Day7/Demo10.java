package Day7;

interface DemoInterface{
    void test();
    String display();
}

class Test2 implements DemoInterface{

    @Override
    public void test() {
        System.out.println("Interface- Test");
    }

    @Override
    public String display() {
        return "Hello";
    }
}


public class Demo10 {
    public static void main(String[] args){
        Test2 t = new Test2();
        t.test();
        System.out.println(t.display());
    }
}
