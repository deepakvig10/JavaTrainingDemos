package Day5;

class Student1{

    private boolean isActive;
    private int id;
    private String name;
    private int passMark = 40;

    public Student1(){


    }

    public void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(isActive);
    }

    public Student1(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassMark() {
        return passMark;
    }
}

public class Demo7 {

    public static void main(String[] args){
        Student1 std = new Student1();
        //std.setName("mark");
        std.display();

    }

}
