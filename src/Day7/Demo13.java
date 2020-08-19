package Day7;

/**
 * by default all the variable in the interface are final
 *
 * */
interface RBI{
    // they act as a final variable
     int interestRate = 4;

    void deposit(int amount);
    void withdraw(int amount);
}

class ICICI implements RBI{


    @Override
    public void deposit(int amount) {
        //interestRate = 2;
    }

    @Override
    public void withdraw(int amount) {

    }
}

class SBI implements RBI{

    @Override
    public void deposit(int amount) {

    }

    @Override
    public void withdraw(int amount) {

    }
}

public class Demo13 {

    public static void main(String[] args){
        RBI rbi = new ICICI();

    }


}
