package Day5;


class Parent{
    public Parent(){
        System.out.println("Parent Constructor");
    }

    public void display(){
        System.out.println("Parent Display");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");
        display();
    }
}


public class Demo9 {

    public static void main(String[] args){
        Child child = new Child();


    }
}
