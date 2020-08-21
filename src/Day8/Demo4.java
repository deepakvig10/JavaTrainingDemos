package Day8;


interface IEmployee1{
    void test1();
}

interface IEmployee2 extends IEmployee1{
    void test2();
}

interface IEmployee3 extends IEmployee2{
    void test3();
}

class Employee implements IEmployee3{

    @Override
    public void test1() {
        System.out.println("Test 1");
    }

    @Override
    public void test2() {
        System.out.println("Test 2");
    }

    @Override
    public void test3() {
        System.out.println("Test 3");

    }
}

public class Demo4 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.test1();
        emp.test2();
        emp.test3();
    }
}
