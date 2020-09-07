package Day13;

/**
 * Extending Thread class Vs Implementing Runnable interface
 *
 * Implementing runnable interface gives us the oppurtunity
 * to extend a class with other class as well
 *
 * Runnable intertface is faster as we dont have inbuilt method like
 * in the case of thread class
 *
 * **/

class T1 extends Thread{

}

class T2  implements Runnable{

    @Override
    public void run() {

    }
}



public class Demo4 {
}
