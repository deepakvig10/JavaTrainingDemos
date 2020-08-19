package Day7;

import org.omg.CORBA.IRObject;

interface IEmployee{
    void addEmployee();
    void getEmployee();
    void updateEmloyee();
    void deleteEmployee();
}

class MySql implements IEmployee{

    @Override
    public void addEmployee() {

    }

    @Override
    public void getEmployee() {

    }

    @Override
    public void updateEmloyee() {

    }

    @Override
    public void deleteEmployee() {

    }
}

class MongoDb implements IEmployee{

    @Override
    public void addEmployee() {

    }

    @Override
    public void getEmployee() {

    }

    @Override
    public void updateEmloyee() {

    }

    @Override
    public void deleteEmployee() {

    }
}


public class Demo16 {
    public static void main(String[] args){

        IEmployee service = new MongoDb();

        service.addEmployee();

    }

}
