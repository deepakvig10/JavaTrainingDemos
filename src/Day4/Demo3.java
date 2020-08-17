package Day4;

public class Demo3 {

    int data = 10;

    public void testRefFunction(Demo3 obj){
        System.out.println(obj.data);
        obj.data = 20;
    }


    public static void main(String[] args){
        Demo3 d3 = new Demo3();

        System.out.println("Before calling a function: "+ d3.data); // 10
        d3.testRefFunction(d3);
        System.out.println("After calling a function: "+ d3.data);  // 20
        //d3.data = 10;
        d3.testRefFunction(d3);
        System.out.println("After calling a function: "+ d3.data); // 20

    }

}
