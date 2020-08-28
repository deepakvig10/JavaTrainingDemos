package Day10;

class InsufficientFundsException extends Exception{
    private int amount;

    public InsufficientFundsException(){
        System.out.println("Insufficient amount requested");
    }

    public InsufficientFundsException(String message){
        System.out.println(message);
    }

}


class Account{
    private int balance = 0;
    private int accountNumber;

    public Account(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("Account credited: +"+ amount);
    }

    public void withdraw(int amount) throws InsufficientFundsException{
        if(amount <= balance){
            balance -= amount;
            System.out.println("Account debited: -"+ amount);

        }else{
            throw new InsufficientFundsException();
//            try{
//                throw new InsufficientFundsException();
//            }catch (InsufficientFundsException e){
//                System.out.println(e.getMessage());
//            }
        }
    }

    public int getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
}


public class Demo3 {
    public static void main(String[] args) {
        Account account = new Account(123456);
        System.out.println(account.getBalance());
        account.deposit(5000);
        try {
            account.withdraw(2000);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
        account.deposit(1000);
        try {
            account.withdraw(10000);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }

    }
}
