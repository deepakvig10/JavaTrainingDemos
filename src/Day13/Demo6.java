package Day13;

class MyThread1 extends Thread {
    public void run(){
       for (int i=0;i<10;i++){
           System.out.println("Thread 1: "+ i);
           try{
               //Thread.sleep(10000);
           }catch (Exception e){

           }

       }
    }
}

class MyThread2 implements Runnable{

    @Override
    public void run() {
        for (int i=10;i>=1;i--){
            System.out.println("Thread 2 : "+ i);
            try{
                //Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }
}



public class Demo6 {
    public static void main(String[] args) {
        // create object of Thread1 class
        MyThread1 t1 = new MyThread1();

        // runnable interface
        MyThread2 t2 = new MyThread2();
        Thread t3 = new Thread(t2);

        t1.start();
        t3.start();
    }
}
