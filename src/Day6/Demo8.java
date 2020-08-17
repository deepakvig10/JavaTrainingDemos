package Day6;

abstract class Abstract1{
    abstract void test1();
}

abstract class Abstract2 extends Abstract1{
    abstract void test2();
}

abstract class Abstract3 extends Abstract2{
    abstract void test3();
}

class Test extends Abstract3{

    @Override
    void test1() {

    }

    @Override
    void test2() {

    }

    @Override
    void test3() {

    }
}


public class Demo8 {
}
