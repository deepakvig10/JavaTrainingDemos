package Day6;

class Bank{


    public int getInterestRate(){
        return 4;
    }
}

class Kotak extends Bank{
    public int getInterestRate(){
        return 6;
    }

    public int getROI(){
        return 6;
    }
}

class ICICI extends Bank{
    public int getInterestRate(){
        return 7;
    }

    public int getInterest(){
        return 7;
    }
}

class HDFC extends Bank{
    public int getInterestRate(){
        return 8;
    }

    public int getReturn(){
        return 8;
    }
}


public class Demo3 {
    public static void main(String[] args){
        Kotak bank1 = new Kotak();
        ICICI bank2 = new ICICI();
        HDFC bank3 = new HDFC();

        System.out.println(bank1.getInterestRate());
        System.out.println(bank2.getInterestRate());
        System.out.println(bank3.getInterestRate());
    }

}
