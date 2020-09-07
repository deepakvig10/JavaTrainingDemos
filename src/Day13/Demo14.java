package Day13;

/**
 * What will happen or is there any difference between call run() method
 * directly instead of start()
 *
 * when we call run() method directly it will not start a separate call stack
 *
 * */

class MyDemo14Tread extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
    }
}

public class Demo14 {
    public static void main(String[] args) {
        MyDemo14Tread t1 = new MyDemo14Tread();
        MyDemo14Tread t2 = new MyDemo14Tread();

        t1.start();
        t2.start();
    }
}
