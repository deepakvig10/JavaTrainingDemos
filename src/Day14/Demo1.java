package Day14;

import com.sun.tools.javac.tree.JCTree;

/**
 * Inter thread communication
 *
 * Inter thread communication is all about allowing thread to communicate
 * with each other
 *
 * 1. wait()
 * 2. notify()
 * 3. notifyAll()
 *
 *
 * wait() - when the current thread release the lock and wait until another
 * thread invokes notify() method or notifyAll() method
 *
 * notify() - it wakes up a single thread that is waiting for the resource to
 * be release
 *
 * */

class Bank{

    int balance = 10000;

    synchronized void withdraw(int amount){
        System.out.println("withdraw processing.....");
        if(balance < amount){
            System.out.println("Balance insufficient, waiting for deposit");
            try{
                wait();
            } catch (Exception e){

            }
            balance -= amount;
            System.out.println("withdraw completed!!!");

        }
    }

    synchronized void deposit(int amount){
        System.out.println("deposit processing......");
        balance += amount;
        System.out.println("deposit completed!!!");
        notify();
    }

}

class DepositThread extends Thread{

    Bank bank;

    DepositThread(Bank b){
        this.bank = b;
    }

    public void run(){
        bank.withdraw(15000);
    }
}

class WithdrawThread extends Thread{

    Bank bank;

    WithdrawThread(Bank b){
        this.bank = b;
    }

    public void run(){
        bank.deposit(10000);
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Bank bank = new Bank();

//        new Thread(){
//            public void run(){
//                bank.withdraw(15000);
//            }
//        }.start();
//
//        new Thread(){
//            public void run(){
//                bank.deposit(10000);
//            }
//        }.start();

        DepositThread dt = new DepositThread(bank);
        WithdrawThread wt = new WithdrawThread(bank);

        dt.start();
        wt.start();

    }
}
