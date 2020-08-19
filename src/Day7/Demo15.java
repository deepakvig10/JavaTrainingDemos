package Day7;

import sun.jvm.hotspot.debugger.win32.coff.TestDebugInfo;

interface TestInterface{

    void test1();

    default void test2(){
        System.out.println("Interface test2");
    }

    static void test3(){
        System.out.println("Interface test3");
    }
}

class A implements TestInterface{

    @Override
    public void test1() {
        System.out.println("Class Test1");
    }



//    @Override
//    public void test2() {
//        System.out.println("class Test2");
//    }
}

public class Demo15 {
    public static void main(String[] args){
//        TestInterface t = new A();
//        t.test1();
//        t.test2();

        A a = new A();
        a.test1();
        a.test2();

        TestInterface.test3();
    }
}
