package Day5;

/**
 * We can use inheritance to avoid code duplicacy
 * The parent class will have all the common variables and method
 * The child class will have only unique variables and method
 * we can use extend keyword for inheritance
 * Child class can able to access all the vaiable and method of the parent class
 * Parent class cannot access child class member
 * Child class cannot access private member of the parent class
 * Child class can access public, protected members of the parent class
 * Parent / super /
 * Child / sub / derived
 * */


class Employee1{
    protected int id;
    String firstName;
    String lastName;
    String email;
    String phone;
    int age;

    public void getFullName(){
        System.out.println(firstName + " " + lastName);
    }
}

class FullTimeEmployee extends Employee1{
    int AnnualSalary;
}

class PartTimeEmployee extends Employee1{
    int hourSalary;
}

public class Demo8 {

    public static void main(String[] args){
        FullTimeEmployee fte = new FullTimeEmployee();
        fte.firstName = "Mark";
        fte.lastName = "Smith";
        fte.getFullName();


        PartTimeEmployee pte = new PartTimeEmployee();
        pte.firstName = "Watson";
        pte.lastName = "Smith";
        pte.getFullName();

        Employee1 emp = new Employee1();


    }
}
