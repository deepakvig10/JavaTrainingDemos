package Day13;

import sun.tools.jconsole.Tab;

class Table{
    // method is not synchronized
    public synchronized void printTable(int num1){
        for(int i=1;i<10;i++){
            System.out.println(num1 * i);
            try{
                Thread.sleep(500);
            }catch (Exception e){

            }
        }
    }
}

class MyTable1 extends Thread{
    Table table;
    MyTable1(Table t){
        this.table = t;
    }

    public void run(){
        table.printTable(5);
    }
}

class MyTable2 extends Thread{
    Table table;
    MyTable2(Table t){
        this.table = t;
    }

    public void run(){
        table.printTable(100);
    }
}


public class Demo16 {
    public static void main(String[] args) {
        // one single object of the table class
        Table table = new Table();

        MyTable1 t1 = new MyTable1(table);
        MyTable2 t2 = new MyTable2(table);

        t1.start();
        t2.start();
    }
}
