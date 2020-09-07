package Day13;

import java.security.PublicKey;

/**
 * producer consumer problem
 *
 * */

class Company{

    int item;
    boolean flag = false;
    // flag = false it is producer turn
    // flag = true it is consumer turn
    synchronized public void produce(int item) throws Exception{
        if(flag){
            wait();
        }
        this.item = item;
        System.out.println("Produced : "+ this.item);
        flag = true;
        notify();
    }

    synchronized public int consumer() throws Exception{
        if(!flag){
            wait();
        }
        System.out.println("Consumer : "+ item);
        flag = false;
        notify();
        return this.item;
    }

}

class Producer extends Thread{
    Company comp;

    Producer(Company c){
        this.comp = c;
    }

    public void run(){
        int i=1;
        while (true){

            try{
                this.comp.produce(i);
                Thread.sleep(1000);
                i++;
            }catch (Exception e){

            }
        }
    }
}

class Consumer extends Thread{
    Company comp;

    Consumer(Company c){
        this.comp = c;
    }

    public void run(){
        int i = 1;
        while (true){


            try{
                this.comp.consumer();
                Thread.sleep(3000);
            }catch (Exception e){

            }
        }
    }
}



public class Demo8 {
    public static void main(String[] args) {
        Company comp = new Company();
        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);

        p.start();
        c.start();
    }
}
