package Day4;

public class Student {

    // by default access modifier for class

    /*
    *
    * */

    private int rollNo;
    private String name;
    private String email;
    private int passMark = 40;
    public int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPassMark() {
        return passMark;
    }

    String address;


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        if(rollNo < 0)
            this.rollNo = 0;
        else
            this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
