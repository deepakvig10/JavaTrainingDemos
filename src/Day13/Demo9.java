package Day13;

/**
 * what will happen if i try to start a thread twice
 *
 *
 * **/

class MySimpleThread extends Thread{
    public void run(){
        System.out.println("my simple thread.....");
    }
}

public class Demo9 {
    public static void main(String[] args) {
        MySimpleThread t1 = new MySimpleThread();
        t1.start();
        t1.start();
    }
}
