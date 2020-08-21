package Day8;

class Parent{
    public Parent(){
        System.out.println("Parent first constructor");
    }
    public Parent(int a){
        System.out.println("Parent second constructor");
    }
}

class Child extends Parent{

    public Child(){
        super();
        System.out.println("Child first constructor");
    }

    public Child(int a){
        super(a);
        System.out.println("Child second constructor");
    }

}


public class Demo14 {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
