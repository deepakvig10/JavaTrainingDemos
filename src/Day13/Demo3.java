package Day13;

/**
 * We will create a thread implementing runnable interface
 *
 * **/

class MySecondThread implements Runnable{

    @Override
    public void run() {
        System.out.println("My Second thread is running...");
    }
}

public class Demo3 {
    public static void main(String[] args) {
        MySecondThread mySecondThread = new MySecondThread();
        // we create the instance of the thread class and in
        // the constructor we are passing the reference of the
        // my thread
        Thread t1 = new Thread(mySecondThread);
        t1.start();
    }
}
