package Day4;

public class Demo6 {

    public static void main(String[] args){

        Student student = new Student();
//        student.rollNo = -101;
//        student.name = null;
//        student.email = "m@gmail.com";
        student.setRollNo(-100);
        student.setName("Mark");
        student.setEmail("m@gmail.com");



        System.out.println(student.getRollNo());
        System.out.println(student.getName());
        System.out.println(student.getEmail());

        Employee emp = new Employee();
        emp.setFirstName("Mark");
        emp.setLastName("Smith");

        emp.getFullName();
        emp.calculateSalary(10);


    }

}
