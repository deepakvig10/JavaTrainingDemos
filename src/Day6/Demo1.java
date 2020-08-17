package Day6;

class Employee{
    int empId;
    String firstName;
    String lastName;

    public void getFullName(){
        System.out.println(firstName + " " + lastName);
    }
}


class FullTimeEmployee extends Employee{
    int annualSalary;

    public void getFullName(){
        super.getFullName();
        System.out.println("Full Time");
    }

}

class PartTimeEmployee extends Employee{
    int hourSalary;

    public void getFullName(){

        System.out.println(firstName +" "+ lastName+ "- Part Time");
    }
}


public class Demo1 {

    public static void main(String[] args){
        FullTimeEmployee fte = new FullTimeEmployee();
        fte.firstName = "Mark";
        fte.lastName = "Smith";

        fte.getFullName();

        PartTimeEmployee pte = new PartTimeEmployee();
        pte.firstName ="Watson";
        pte.lastName = "Smith";
        pte.getFullName();
    }

}
