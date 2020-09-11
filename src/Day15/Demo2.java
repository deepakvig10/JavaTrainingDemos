package Day15;


import java.util.ArrayList;

class Employee{

    int empId;
    String name;
    int age;

    public Employee(int empId, String name, int age) {
        this.empId = empId;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Demo2 {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Mark", 20);
        Employee emp2 = new Employee(2, "Paul", 30);
        Employee emp3 = new Employee(3, "Watson", 20);


        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        for(Employee emp: employeeList){
            System.out.println(emp.toString());
            //System.out.println("Employee: Id="+ emp.empId+", Name="+emp.name+", Age="+ emp.age);
        }


    }

}
