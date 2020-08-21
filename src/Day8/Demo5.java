package Day8;

interface IStudent{
    void addStudent();
    void updateStudent();
    void deleteStudent();
}

interface IStudentGet{
    void getStudent();
    void getStudentById();
}


class Student implements IStudent, IStudentGet{

    @Override
    public void addStudent() {

    }

    @Override
    public void updateStudent() {

    }

    @Override
    public void deleteStudent() {

    }

    @Override
    public void getStudent() {

    }

    @Override
    public void getStudentById() {

    }
}


public class Demo5 {
}
