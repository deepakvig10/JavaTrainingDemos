package Day16;

interface MyInterface{
    void test1();
}

class First implements MyInterface{
    @Override
    public void test1() {

    }

    public void test2(){}
}

class Second implements MyInterface{
    @Override
    public void test1() {

    }

    public void test3(){}
}


public class Demo13 {
    public static void main(String[] args) {

        First f = new First();
        Second s = new Second();

        MyInterface i1 = new First();
        MyInterface i2 = new Second();



    }
}
