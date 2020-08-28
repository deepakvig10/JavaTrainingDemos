package Day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * try with resource
 * this is the new feature which was introduce in java 1.7
 *
 *  In the previous version we have to use finally to make
 *  sure we close the connection or for clear up
 *
 *  but it increase the length of your programe
 *  It increase the complexity of the program
 *  It make ur code less readable
 *
 *  In try with resource
 *  we dont have to use finally to displose or close manually or explicity
 *  we can create the resource along with try block
 *  automatically when we react to the last statement of the try block
 *  it will dispose or close the connection
 *
 *  once we reach end of the try block
 *  if control is send to catch block
 *
 *
 *  try(Class obj1; class obj2;)
 *
 *
 * */

public class Demo11 {
    public static void main(String[] args) {
//        BufferedReader br = null;
//       try{
//           br = new BufferedReader(new FileReader("data.txt"));
//       }catch (IOException e){
//           // handle exception
//       }
//       finally {
//           if(br!=null){
//               try {
//                   br.close();
//               } catch (IOException e) {
//                   e.printStackTrace();
//               }
//           }
//       }


        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){


        }catch (IOException e){

        }




    }
}
