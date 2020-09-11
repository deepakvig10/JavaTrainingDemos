package Day15;


import javax.jws.Oneway;

class Cal{

    boolean isEqual(int a, int b){
        if(a == b)
            return true;
        else
            return false;
    }

    boolean isStringEqual(String a, String b){
        return true;
    }

    boolean isFloatEqual(float a, float b){
        return true;
    }

    boolean isEq(Object obj1, Object obj2){
        if(obj1.equals(obj2))
            return true;
        else
            return false;
    }


}

public class Demo12 {
    public static void main(String[] args) {
        Cal c = new Cal();
        boolean result = c.isEqual(10, 20);
        if(result)
            System.out.println("Are equal");
        else
            System.out.println("Not equal");

        c.isEq(10, 0);
        c.isEq("AC", "BC");
        c.isEq(12.23, 23.45);
        c.isEq(10, "A");


        /**
         * Problem
         * 1. unnecessary typecasting will happen which will impace
         *    performace of the programe
         * 2. my method is no longer type safe which it can compare
         *    any type of value
         *    int, int--- string, string----int , string
         *
         * */

    }
}
