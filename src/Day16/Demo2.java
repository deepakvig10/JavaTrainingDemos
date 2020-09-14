package Day16;

class Calculation<T>{

//    public static boolean isEqual(Object a , Object b){
//        if(a==b)
//            return true;
//        else
//            return false;
//    }

    public boolean isEqual(T a, T b){
        if(a == b)
            return true;
        else
            return false;
    }



}


public class Demo2 {
    public static void main(String[] args) {

//       boolean result = Calculation.isEqual(10, "ABC");
//       if(result)
//           System.out.println("Are Equal");
//       else
//           System.out.println("Not Equal");

       Calculation<String> cal = new Calculation<String>();
       boolean result = cal.isEqual("AB", "AB");
       if(result)
           System.out.println("Are Equal");
       else
           System.out.println("Not Equal");

       Calculation<Integer> cal2 = new Calculation<>();
       boolean res = cal2.isEqual(10,20);

    }
}
