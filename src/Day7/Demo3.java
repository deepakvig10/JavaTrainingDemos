package Day7;

class Employee{

    int empId;
    String firstName;
    String lastName;
    static String companyName = "ABC";

    public Employee(){}

    public Employee(int empId, String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.empId = empId;
        this.companyName = companyName;
    }

    public void display(){
        System.out.println("EmpId"+ empId+ ", FirstName: "+ firstName+", LastName: "+ lastName+", Company: "+ companyName);
    }

}



public class Demo3 {
    public static void main(String[] args){
        Employee emp1 = new Employee(101, "MArk", "Smith");
        Employee emp2 = new Employee(102, "Paul", "Watson");

        emp1.display();
        emp2.display();


    }
}
