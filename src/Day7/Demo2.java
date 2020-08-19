package Day7;

class Calculator{

    public static void subNumber(int num1, int num2){
        System.out.println(num1 - num2);
    }

    public void addNumber(int num1, int num2){
        System.out.println(num1 + num2);
    }

}

public class Demo2 {
    public static void main(String[] args){
        Calculator cal = new Calculator();
        cal.addNumber(10, 20);
        Calculator.subNumber(20,10);
    }
}
