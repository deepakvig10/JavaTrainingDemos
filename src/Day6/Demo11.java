package Day6;

class FinalDemo{

    // final variable act as a constant
    final int amount = 100;

    public int getAmount(){
        // not allowed
        //amount = 200;
        return amount;
    }

}

public class Demo11 {

    public static void main(String[] args){
        FinalDemo f1 = new FinalDemo();

        System.out.println(f1.getAmount());
    }
}
