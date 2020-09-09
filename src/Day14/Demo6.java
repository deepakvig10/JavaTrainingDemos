package Day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Employee{
    int empId;
    String name;
    String gender;
    int age;

    public Employee(int empId, String name, String gender, int age) {
        this.empId = empId;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}


public class Demo6 {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Mark", "male", 30);
        Employee emp2 = new Employee(2, "Paul", "male", 40);
        Employee emp3 = new Employee(3, "Stacy", "female", 20);
        Employee emp4 = new Employee(4, "Watson", "male", 30);

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp3);



        for(Employee emp: employeeList){
            //System.out.println("Emp Id: "+ emp.empId+", Name: "+ emp.name+", Gender: "+ emp.gender+", Age: "+ emp.age);
        }

        for(int i=0; i<employeeList.size(); i++){

        }

        Iterator itr = employeeList.iterator();
        while(itr.hasNext()){
            //Employee emp = (Employee) itr.next();
            //System.out.println("Emp Id: "+ emp.empId+", Name: "+ emp.name+", Gender: "+ emp.gender+", Age: "+ emp.age);
            System.out.println(itr.next());
        }
    }
}
