package Day6;

class ParentDemo{

    final public void test(){
        System.out.println("Test Parent");
    }

}

class ChildDemo extends ParentDemo{
//    public void test(){
//        System.out.println("Test Child");
//    }
}


public class Demo12 {
    public static void main(String[] args){
        ChildDemo c = new ChildDemo();
        c.test();
    }
}
