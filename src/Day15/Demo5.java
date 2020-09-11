package Day15;

import java.util.ArrayList;

class Student{
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class Demo5 {
    public static void main(String[] args) {
        Student std1 = new Student(1, "Mark", 20);
        Student std2 = new Student(2, "Watson", 30);
        Student std3 = new Student(3, "Paul", 20);

        ArrayList<Student> list = new ArrayList<>();
        list.add(std1);
        list.add(std2);
        list.add(std3);

        for (Student student: list) {
            System.out.println(student.toString());
        }

        System.out.println("---------------");

        Student std4 = new Student(4,"Stacy", 10);

        list.add(0, std4);

        for (Student student: list) {
            //System.out.println(student.toString());
        }

        ArrayList<Student> list2 = new ArrayList<>();
        Student std5 = new Student(4, "Mark", 20);
        Student std6 = new Student(6, "Watson", 30);
        Student std7 = new Student(7, "Paul", 20);
        list2.add(std5);
        list2.add(std6);
        list2.add(std7);

        list.addAll(2, list2);

        for (Student student: list) {
            System.out.println(student.toString());
        }

    }
}
