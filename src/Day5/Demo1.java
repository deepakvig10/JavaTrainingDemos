package Day5;

class Student
{
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id >0)
            this.id = id;
        else
            this.id=0;
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

    public void getFullName(){
        System.out.println(firstName + " "+lastName);
    }
}


public class Demo1 {

    public static void main(String[] args){

        Student student = new Student();
//        student.id = -101;
//        student.firstName = null;
//        student.lastName = "Smith";
//        student.email = "m@gmail.com";

        student.setId(-100);
        student.setFirstName("Mark");
        student.setLastName("Smith");
        student.setEmail("m@gmail.com");

        System.out.println(student.getId());



        student.getFullName();

    }

}
