package Day6;

abstract class DemoAbstract{

    abstract void test1();

    void test2(){
        System.out.println("Test 2");
    }
}

class DemoChild extends DemoAbstract{

    void test1() {
        System.out.println("Test 1");
    }
}


public class Demo5 {

    public static void main(String[] args){

        //DemoAbstract obj = new DemoAbstract();
        DemoChild dc = new DemoChild();
        dc.test1();
        dc.test2();

    }

}
