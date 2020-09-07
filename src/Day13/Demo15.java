package Day13;

/**
 * Priority
 * there are 3 constant define in thread class to set priority
 * 1. Min
 * 2. Normal
 * 3. Max
 *
 * */

class MyDemo15Thread extends Thread{
    public void run(){
        //System.out.println("Thread Name: "+ Thread.currentThread().getName());
        //System.out.println("Thread Priority: "+ Thread.currentThread().getPriority());
        for(int i=0;i<10; i++){
            System.out.println(Thread.currentThread().getName()+" = "+ i);
        }
    }
}


public class Demo15 {
    public static void main(String[] args) {
        MyDemo15Thread t1 = new MyDemo15Thread();
        MyDemo15Thread t2 = new MyDemo15Thread();

        t1.setPriority(1);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}
