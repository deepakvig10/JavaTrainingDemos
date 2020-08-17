package Day5;


class Employee{

    public Employee(){
        System.out.println("Constructor : 0 parameter");

    }

    public Employee(int a){
        System.out.println("Constructor: 1 parameter - int");
    }

    public Employee(int a, int b){
        System.out.println("Constructor: 2 parameter");
    }

    public Employee(String a){
        System.out.println("Constructor: 1 parameter - String");
    }

    public Employee(int a, String b){
        System.out.println("Constructor: 2 parameter - int, string");
    }

    public Employee(String a, int b){
        System.out.println("Constructor: 2 parameter - string, int");
    }


}

public class Demo4 {

    public static void main(String[] args){
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(10);
        Employee emp3 = new Employee("A");
        Employee emp4 = new Employee(10, "A");
        Employee emp5 = new Employee("A", 10);

    }

}
