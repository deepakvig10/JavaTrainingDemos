package Day7;

/**
 * we cannot able to crate the instance(object of the class)
 * of the abstract class as well as interface
 * abstract class can declared filed that are not static and final and
 * we can also define public, protected and private
 *
 * Interface all filed are automatically public, static and final
 * all the method of the interface are public
 * */

abstract class AbstractDemo implements InterfaceDemo{
    // abstract method
    abstract void test1();

    // non abstract method
    void test2(){

    }
}

interface InterfaceDemo{
    // by default all methods are abstract
    void test3();
}

class ImplementClass extends AbstractDemo {

    @Override
    void test1() {

    }

    @Override
    public void test3() {

    }
}


public class Demo14 {
}
