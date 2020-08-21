package Day8;

import demopackage.TestPackage;

/**
 * We have 4 access modifier
 * public - in all the classes in the same package and all other classes from different package
 * private - with in the same class not in any other class
 * protected - in all the classes in the same package and all sub classes from different package
 * default - when no access modifier is define then it is default and it is used with in the package
 *
 * we can use getter and setter to encapsulate class variables
 * read only - getter only
 * write only - setter only
 * read and write - getter and setter
 *
 * **/

class Employee2{

    private int empId;
    private String firstName;
    private String lastName;
    private int salary = 1000;

    public void updateSalary(int amount){
        salary = amount;
    }

    private void displaySalary(){
        System.out.println(salary);
    }

    public void display(){
        displaySalary();
    }


    public int getEmpId() {
        return empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void getFullName(){
        System.out.println(firstName +" "+lastName );
    }

}

class Test2 extends TestPackage{

//    public void test(){
//        Employee employee = new Employee();
//        employee.
//    }

    public void print(){
        firstName = "Paul";
        lastName = "Watson";
    }


}

public class Demo10 {

    public static void main(String[] args) {
        Employee2 emp = new Employee2();
        //emp.firstName = "Mark";
        //emp.lastName = "Smith";
        emp.setFirstName("Mark");
        emp.setLastName("Smith");
        emp.getFullName();

        emp.display();
        emp.updateSalary(9000);
        emp.display();

        Demo12 obj = new Demo12();
        obj.firstName= "Paul";
        obj.lastName = "lastName";
        obj.getFullName();





    }
}
