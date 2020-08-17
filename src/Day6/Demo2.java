package Day6;

class BaseClass{

    public BaseClass(){
        System.out.println("Base class constructor");
    }

    public void display(){
        System.out.println("Base class display");
    }
}

class DerivedClass extends BaseClass{

    public DerivedClass(){
        System.out.println("Derived class constructor");
    }

    public void display(){
        System.out.println("Derived class display");
    }

}


public class Demo2 {

    public static void main(String[] args){
//        DerivedClass d1 = new DerivedClass();
//        d1.display();

//        BaseClass b1 = new BaseClass();
//        b1.display();

        // child class can be use to initialize the parent class
        // but parent class cannot be use to initialize the child class
        BaseClass b1 = new DerivedClass();
        //DerivedClass c1 = new BaseClass();
        b1.display();


    }

}
