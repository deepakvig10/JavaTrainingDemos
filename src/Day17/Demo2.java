package Day17;

import java.util.*;

class Employee{
    int empId;
    String name;
    int age;
    String dept;

    public Employee(int empId, String name, int age, String dept) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "empId=" + empId +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", dept='" + dept + '\'' +
//                '}';
//    }
}


public class Demo2 {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Mark", 20, "Admin");
        Employee emp2 = new Employee(2, "Watson", 20, "HR");
        Employee emp3 = new Employee(3, "Paul", 20, "Sales");

        HashMap<Integer, Employee> emp = new HashMap<>();
        emp.put(3, emp1);
        emp.put(1, emp2);
        emp.put(2, emp3);

        for(Map.Entry entry: emp.entrySet()){
            Employee employee = (Employee) entry.getValue();
            System.out.println(entry.getKey()+" : "+ employee.name);
        }





    }
}
