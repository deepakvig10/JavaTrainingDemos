package Day8;

interface I1{
    void test1();
}

interface I2{
    void test2();
}

class Test implements I1, I2{

    @Override
    public void test1() {
        System.out.println("Test 1");
    }

    @Override
    public void test2() {
        System.out.println("Test 2");

    }
}



public class Demo3 {
    public static void main(String[] args) {
        Test t = new Test();
        t.test1();
        t.test2();
    }
}
