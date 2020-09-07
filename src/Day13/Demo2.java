package Day13;

/**
 * In Java we can create thread in 2 ways
 * 1. extending from Thread Class
 * 2. implementing Runnable interface
 *
 *
 * 1. Creating a thread extending from Thread class
 * Thread is available in java.lang
 *
 *
 *  Thread class provide a start() method which can be use to start a newly create
 *  thread
 * A thread start
 * The thread moves from new state to runnable
 * when finally thread gert a chance to execute it call the run() method
 *
 *
 * **/

class MyFirstThread extends Thread{

    public void run(){
        System.out.println("Thread is running...");
    }
}


public class Demo2{

    public static void main(String[] args) {
        MyFirstThread thread = new MyFirstThread();
        //thread.start();
        thread.run();
    }
}
