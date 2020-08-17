package Day6;

class FinalDemo2{

 final int balance;

 public FinalDemo2() {
     balance = 200;
 }

 public FinalDemo2(int a){
     balance = a;
     // once the initialization is done we cannot modify the value
     //balance = a + 10;
 }

 public void get(){
     //balance = 300;
 }

}




public class Demo14 {
    public static void main(String[] args){
        FinalDemo2 f = new FinalDemo2(100);
        System.out.println(f.balance);
    }

}
