package Day5;

class Calculator{

    int a, b, c, d;

    int result= 0;

    public Calculator(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Calculator(Calculator cal){
        this.a = cal.a;
        this.b = cal.b;
        this.c = cal.c;
        this.d = cal.d;
    }

    public void calculateNumber(){
        result = a + b + c+ d;
    }

    public void calculateNumber2(){
        result = a * b*c*d;
    }

}


public class Demo6 {

    public static void main(String[] args){

        Calculator c1 = new Calculator(1,2,3,4);
        Calculator c2 = new Calculator(c1);

        c1.calculateNumber();
        c2.calculateNumber2();

        System.out.println(c1.result);
        System.out.println(c2.result);

    }


}
