package Day8;

interface IAccount{
    void deposit(int amount);
    void withdraw(int amount);
}

class SavingAccount implements IAccount{

    @Override
    public void deposit(int amount) {

    }

    @Override
    public void withdraw(int amount) {

    }

    public void getInterest(){
        System.out.println("4 %");
    }
}

class CurrentAccount implements IAccount{
    @Override
    public void deposit(int amount) {

    }

    @Override
    public void withdraw(int amount) {

    }
}

class AccountFactory{


    public static IAccount getAccount(int id){
        switch (id) {
            case 1: return new SavingAccount();
            case 2: return new CurrentAccount();
            default: return null;
        }
    }
}


public class Demo8 {
    public static void main(String[] args) {
        IAccount account = AccountFactory.getAccount(1);
        CurrentAccount sa = (CurrentAccount) account;


    }
}
