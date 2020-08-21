package Day8;
/**
 * constructor chaining
 * Calling a constructor from the another constructor
 * In constructor chaining this should be the first statement
 * This can be done in 2 ways
 * 1. within same class - this() keyword
 * 2. from base class - super()
 * */
class Calculator{
    private int num1;
    private int num2;

    public Calculator(){
        this(10);
        System.out.println("First Constructor");
    }

    public Calculator(int num1){
        this(num1, 20);
        System.out.println("Second Constructor");
    }

    public Calculator(int num1, int num2){
        System.out.println("Third Constructor");
        this.num1 = num1;
        this.num2 = num2;
    }

    public void addNumber(){
        System.out.println("Sum: "+ (num1 + num2));
    }
}

public class Demo13 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.addNumber();

    }
}
