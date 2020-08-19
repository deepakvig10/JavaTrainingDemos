package Day7;


class Student{

    int roll;
    String name;
    static String college = "IIT";

    public void setData(int r, String n){
        roll = r;
        name = n;
    }

    public void display(){
        System.out.println("Roll: "+ roll+", Name: "+ name+", College: "+ college);
    }

    public void changeCollege(String c){
        college = c;
    }

}


public class Demo4 {

    public static void test(){
        }

    public static void main(String[] args){



        Student student1 = new Student();
        student1.setData(1, "Mark");
        student1.display();

        //Student.college = "IIM";

        Student student2 = new Student();
        student2.setData(2, "Paul");

        student2.changeCollege("ABC");
        student2.display();
    }
}
