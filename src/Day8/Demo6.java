package Day8;


interface Interface1{
    void test1();
    void print();



}

interface Interface2{
    void test2();
    void print();


}

class ImplClass implements Interface1, Interface2{

    @Override
    public void test1() {
        System.out.println("Test 1");
    }

    @Override
    public void test2() {
        System.out.println("Test 2");
    }

    @Override
    public void print() {

    }
}

public class Demo6{

    public static void main(String[] args) {
//        ImplClass obj = new ImplClass();
//        obj.test1();
//        obj.test2();
//        obj.print();

       Interface1 i1 = new ImplClass();
       i1.print();

       Interface2 i2 = new ImplClass();
       i2.print();



    }


}


