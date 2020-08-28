package Day9;

/**
 * An exception is an event which occur during the execution of the program
 * that disrupt the normal flow of the program
 * for eg: If try to divide a number by zero- now that is a universal truth that
 * number cannot be divide by zero
 * These kind of exception cause your application or programme to stop
 * in approprtietly
 *
 * Exception is always an essential or critical part of any kind of application
 *
 * Type of Exception
 * 1. Checked Exception
 * 2. Runtime Exception
 * 3. Error
 *
 * Checked Exception - are checked at compile time. It means if a method is throwing
 * a checked exception then it should be handled using try catch block
 * it should declare the exception using throws keyword
 * otherwise the program will give a compilation error
 * for eg: FileNotFound -
 *
 *
 * Runtime Exception - Unchecked Exception
 * these exception are not checked at compile time.
 * It means if your program is throwing an unchecked exception and even if your have
 * not handled using try / catch block the program wont give any compilation error
 * but it get break at run time
 * for eg: Arithmetic exception
 *
 * Error
 * These are exceptional condition that are external to the application
 * and that the application usually donot have any control or can recover from
 * for eg: OutOfMemory, StackOverflow, JVM
 *
 * Name of thread : Name of Exception : Description
 * stack trace / location
 *
 * */

public class Demo1 {

    public static void main(String[] args) {
        System.out.println("main");
        doSomething();
    }

    public static void doSomething(){
        System.out.println("do something");
        doSomethingMore();
    }

    public static void doSomethingMore(){
        System.out.println("do something more");
        System.out.println(10/0);
    }
}

/**
* main
* dosomthing
 * dosomethingmore
 * execption
* */