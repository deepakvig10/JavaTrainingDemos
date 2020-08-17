package Day4;

public class Employee {

    private int empId;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int phone;
    public int salary = 2000;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void getFullName(){
        System.out.println(firstName + " "+ lastName);
    }

    public void calculateSalary(int days){
        System.out.println("Salary: "+ days * salary);
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
