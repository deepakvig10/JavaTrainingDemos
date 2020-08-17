package Day6;

class Bank2{

    int balance;

    public void deposit(int amount){
        balance  = balance + amount;
    }

    public void withdraw(int amount){
        balance = balance - amount;
    }
}

class Saving extends Bank2{

}

class Current extends Bank2{


    public void withdraw(int amount){
        if(balance < 1000){
            System.out.println("Insufficent fund");
        }else {
            balance = balance - amount;
        }
    }
}


public class Demo4 {
    public static void main(){

    }
}
