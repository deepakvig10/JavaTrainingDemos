package Day13;

public class Demo5 {

    public static void main(String[] args) {

        System.out.println("Program start.....");
        int a = 10;
        int b = 20;
        int c = a + b;

        Thread mainThread = Thread.currentThread();
        String threadName = mainThread.getName();
        System.out.println(mainThread.getId());
        System.out.println(threadName);

        mainThread.setName("My Main Thread");
        System.out.println(mainThread.getName());

        try {
            Thread.sleep(5000);
        }
        catch (Exception e){

        }

        System.out.println("Result: "+ c);
        System.out.println("Program end...");


    }

}
