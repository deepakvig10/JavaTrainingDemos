package Day14;


/***
 *
 * Volatile keyword in java
 *
 * It is use to make class thread safe
 * It means that multiple thread can use a method and instance of the class at same time without
 * having any problem
 * The volatile keyword can be use for simple or for complex value
 *
 * The volatile keyword does not cache the value and it is always will be read from the
 * main memory
 *
 *
 * # Volatile vs Synchronized Keyword
 * 1. Volatile is used as a flied modifier and other used for method
 * 2. It improved thread performance and other block the thread and decrase the performance
 * 3. the thread cannot be blocked for waiting but in other case thread can be blocked
 *
 *
 * */

class Counter{
    private volatile int count = 0;

    public int getCount(){
        return count;
    }

    public void setCount(){
        ++count;
    }
}

class CounterThread extends Thread{

    Counter counter;

    public CounterThread(Counter c){
        this.counter = c;
    }

    public void run(){
        int oldValue = counter.getCount();
        System.out.println( Thread.currentThread().getName()+ " Old Count: "+ oldValue);
        counter.setCount();
        int newValue = counter.getCount();
        System.out.println(Thread.currentThread().getName()+ "new Count: "+ newValue);
    }
}



public class Demo2 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        CounterThread ct1 = new CounterThread(counter);
        CounterThread ct2 = new CounterThread(counter);

        ct1.start();
        ct2.start();
    }
}
