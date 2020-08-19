package Day7;

/**
 *
 * Design pattern are use as a template or solution to your problems which you
 * encouter in the day to day life
 *
 * Gang of Four - 23 design pattern
 *
 * Type of Design Pattern
 * - Creation
 * the object how and when to create the object of the class
 * singleton
 * factory
 *
 * - Structural
 * how you want stucture you app
 *
 * - Behaviourial
 * - adding behaviour to your object
 * observer
 *
 * */


import sun.security.pkcs11.Secmod;

/**
 * Now body can able to create the object of my class
 * we need atleast one instance of the class
 *
 * */

class Singleton{

    static Singleton instance = null;

    int counter = 0;

    private Singleton(){
        counter++;
        System.out.println(counter);
    }

    public static Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }

    public void getCounter(){
        System.out.println(counter);
    }
}

class DBHelper{
    static DBHelper instance = null;

    private DBHelper(){

    }

    public static DBHelper getInstance(){
        if(instance==null)
            instance = new DBHelper();
        return instance;
    }
}

public class Demo8 {
    public static void main(String[] args){
        Singleton s1 = Singleton.getInstance();
        //s1.getCounter();
        Singleton s2 = Singleton.getInstance();

        //DBHelper d = new DBHelper();




        //s2.getCounter();
    }
}
