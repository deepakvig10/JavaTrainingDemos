package Day7;

public class Demo6 {

    static int counter = 0;

    public Demo6(){
        counter++;
        System.out.println("Counter: "+ counter);
    }


    public static void main(String[] args){
        Demo6 d1 = new Demo6();
        Demo6 d2 = new Demo6();
        Demo6 d3 = new Demo6();
    }

}
