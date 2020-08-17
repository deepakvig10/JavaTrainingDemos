package Day5;

/**
 * when parent class has a parametrize constructor it become the duty of the child
 * class to pass the parameter for the parent class constructor
 * the child class can use super keyword to refer parent class object
 * super keyword can be use to refer parent class instance variable
 * super() can be use to invoke parent class constructor
 *
 * */


class Parent1{

    public Parent1(){
        System.out.println("Parent Constructor");
    }

    public Parent1(int a){
        System.out.println("Parent Constructor: "+ a);
    }
}

class Child1 extends Parent1{
    int b;

    public Child1(int a){
        //this.b = a;
        //super(a);
        System.out.println("Child Constructor: ");
    }
}

public class Demo10 {
    public static void main(String[] args){
        Child1 c = new Child1(100);
    }
}
