package Day7;

/**
* static block we can use to initialize static variable
 * It is executed before the main method
* **/

class Calculation{

    static int num1;
    int num2;

    static {
        num1 = 20;
    }

    public Calculation(int a, int b){
        num1 = a;
        num2 = b;
    }

    public void display(){
        System.out.println("Num1 = "+ num1+", Num2 = "+ num2);
    }

}


public class Demo9 {
    public static void main(String[] args){
        System.out.println(Calculation.num1);

//        Calculation c = new Calculation(10, 20);
//        c.display();



    }
}
