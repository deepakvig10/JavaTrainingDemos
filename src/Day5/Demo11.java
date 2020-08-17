package Day5;

class A{
    public A(){
        System.out.println("A constructor");
    }
}

class B extends  A{

    public B(int a){
        System.out.println("B constructor with parameter");
    }

//    public B(){
//        System.out.println("B constructor");
//    }
}

class C extends B{
    public C(int a){
        super(a);
        System.out.println("C constructor");
    }
}


public class Demo11 {

    public static void main(String[] args){

        C obj = new C(10);


    }

}
