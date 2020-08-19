package Day7;

interface Printer{
    void print();
}

class HP implements Printer{

    @Override
    public void print() {

    }
}

class Cannon implements Printer{
    @Override
    public void print() {

    }
}


public class Demo11 {
    public static void main(String[] args){

        //Printer p = new Printer();
        HP hp = new HP();
        hp.print();

        Printer p = new Cannon();
        p.print();

    }
}
