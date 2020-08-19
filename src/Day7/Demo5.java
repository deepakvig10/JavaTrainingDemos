package Day7;

class Test{

    int counter = 0;

    public Test(){
        counter++;
        System.out.println("Counter:" + counter);
    }
}


public class Demo5 {
    public static void main(String[] args){
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
    }
}
